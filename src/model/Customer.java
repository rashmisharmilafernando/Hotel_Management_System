package model;

public class Customer {
    private  String  customername;
    private  long customernic;
    private  int customerroomno;
    private long customertelephone;
    private String email;
    private String address;

    public Customer(String customername, long customernic, int customerroomno, long customertelephone, String email, String address) {
        this.customername = customername;
        this.customernic = customernic;
        this.customerroomno = customerroomno;
        this.customertelephone = customertelephone;
        this.email = email;
        this.address = address;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public long getCustomernic() {
        return customernic;
    }

    public void setCustomernic(int customernic) {
        this.customernic = customernic;
    }

    public int getCustomerroomno() {
        return customerroomno;
    }

    public void setCustomerroomno(int customerroomno) {
        this.customerroomno = customerroomno;
    }

    public long  getCustomertelephone() {
        return customertelephone;
    }

    public void setCustomertelephone(int customertelephone) {
        this.customertelephone = customertelephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
