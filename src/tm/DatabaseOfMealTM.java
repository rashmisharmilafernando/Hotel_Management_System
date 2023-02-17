package tm;

import javafx.scene.control.Button;

public class DatabaseOfMealTM {
    private  String codeNumber;
    private String packageName;
    private String  foodName;
    private double prices;

    public DatabaseOfMealTM(String codeNumber, String packageName, String foodName, double prices) {
        this.codeNumber = codeNumber;
        this.packageName = packageName;
        this.foodName = foodName;
        this.prices = prices;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getCodeNumber() {
        return codeNumber;
    }

    public void setCodeNumber(String codeNumber) {
        this.codeNumber = codeNumber;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }
}
