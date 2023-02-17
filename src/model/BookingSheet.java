package model;

import java.time.LocalDate;

public class BookingSheet {
    private String Type;
    private int number;
    private String datenow;
    private  String tablemealPlan;
    private String food;
    private int allprice;

    public BookingSheet(String type, int number, String datenow, String tablemealPlan, String food, int allprice) {
        Type = type;
        this.number = number;
        this.datenow = datenow;
        this.tablemealPlan = tablemealPlan;
        this.food = food;
        this.allprice = allprice;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDatenow() {
        return datenow;
    }

    public void setDatenow(String datenow) {
        this.datenow = datenow;
    }

    public String getTablemealPlan() {
        return tablemealPlan;
    }

    public void setTablemealPlan(String tablemealPlan) {
        this.tablemealPlan = tablemealPlan;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getAllprice() {
        return allprice;
    }

    public void setAllprice(int allprice) {
        this.allprice = allprice;
    }
}
