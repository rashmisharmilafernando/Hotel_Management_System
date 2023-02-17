package model;

public class BillTable {
    private  String roomType;
    private  int roomNumber;
    private  String customerName;
    private  String dates;
    private int night;
    private String meals;
    private  int price;

    public BillTable(String roomType, int roomNumber, String customerName, String dates, int night, String meals, int price) {
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.customerName = customerName;
        this.dates = dates;
        this.night = night;
        this.meals = meals;
        this.price = price;
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
    public void setNight(int night) {
        this.night = night;
    }

    public int getNight() {
        return night;
    }
}
