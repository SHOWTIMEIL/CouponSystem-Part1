package Facade;

import Exception.ExceptionMessage;

public class LoginManager {

    private static LoginManager instance = null;

    private LoginManager() {
    }

    /**
     * Creates an instance of the login manager if not null.
     * @return the created instance.
     */
    public static LoginManager getInstance() {
        if (instance == null) {
            instance = new LoginManager();
        }
        return instance;
    }

    /**
     * This method manages the login to the system.
     * The method use the clientType param to call the right login method for each type.
     * @param email      
     * @param password   
     * @param clientType.
     * @return the corresponding clientFacade to the clientType on successful login,
     *   null when the login failed.
     */
    public ClientFacade login(String email, String password, ClientType clientType) {
        AdminFacade adminFacade = new AdminFacade();
        CompanyFacade companyFacade = new CompanyFacade();
        CustomerFacade customerFacade = new CustomerFacade();
        try {
            switch (clientType) {
                case ADMINISTRATOR:
                    if (adminFacade.login(email, password)) {
                        return adminFacade;
                    }
                case COMPANY:
                    if (companyFacade.login(email, password)) {
                        return companyFacade;
                    }
                case CUSTOMER:
                    if (customerFacade.login(email, password)) {
                        return customerFacade;
                    } else {
                        System.out.println(ExceptionMessage.AUTHENTICATION_FAILED.getMessage());
                    }
            }
        } catch (Exception e) {

        }
        return null;
    }

}