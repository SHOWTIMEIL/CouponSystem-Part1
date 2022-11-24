package Customer;

import java.util.ArrayList;
import java.util.List;

import Coupon.Coupon;

public class Customer {

    private int id;
    private String First_Name;
    private String Last_Name;
    private String email;
    private String password;
    List<Coupon> coupuns =  new ArrayList<>();

    public Customer(int id, String first_Name, String last_Name, String email, String password) {
        this.id = id;
        First_Name = first_Name;
        Last_Name = last_Name;
        this.email = email;
        this.password = password;
    }

    public Customer(){
        
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Customer: ");
        stringBuilder.append("id: ").append(id);
        stringBuilder.append(",  First Name: ").append(First_Name);
        stringBuilder.append(",  Last Name: ").append(Last_Name);
        stringBuilder.append(",  Email: ").append(email);
        stringBuilder.append(",  Password: ").append(password).append("\n");
        stringBuilder.append(", Coupons:").append(coupuns).append("\n");
        return stringBuilder.toString();
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirst_Name() {
        return First_Name;
    }
    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }
    public String getLast_Name() {
        return Last_Name;
    }
    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public List<Coupon> getCoupuns() {
        return coupuns;
    }
    public void setCoupuns(List<Coupon> coupuns) {
        this.coupuns = coupuns;
    }
        
    


}