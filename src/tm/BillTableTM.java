package tm;

import javafx.scene.control.Button;

public class BillTableTM {
    private  String roomType;
    private  int roomNumber;
    private  String customerName;
    private  String dates;
    private int night;
    private String meals;
    private  int price;
    private Button printButton;
    private  Button deleteButton;

    public void setNight(int night) {
        this.night = night;
    }

    public int getNight() {
        return night;
    }

    public BillTableTM(String roomType, int roomNumber, String customerName, String dates, int night, String meals, int price, Button printButton, Button deleteButton) {
        this.setRoomType(roomType);
        this.setRoomNumber(roomNumber);
        this.setCustomerName(customerName);
        this.setDates(dates);
        this.night = night;
        this.setMeals(meals);
        this.setPrice(price);
        this.setPrintButton(printButton);
        this.setDeleteButton(deleteButton);
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public String getMeals() {
        return meals;
    }

    public void setMeals(String meals) {
        this.meals = meals;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Button getPrintButton() {
        return printButton;
    }

    public void setPrintButton(Button printButton) {
        this.printButton = printButton;
    }

    public Button getDeleteButton() {
        return deleteButton;
    }

    public void setDeleteButton(Button deleteButton) {
        this.deleteButton = deleteButton;
    }
}
