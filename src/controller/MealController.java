package controller;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.DatabaseOfMeal;
import tm.DatabaseOfMealTM;
import java.util.ArrayList;

public class MealController {
    public AnchorPane MealPanel;
    public TableView mealTable;
    public TableColumn pName;
    public TableColumn nameOfFood;
    public TableColumn code;
    public TableColumn price;
    static ArrayList<DatabaseOfMeal> list= new ArrayList<>();
    static {
        list.add(new DatabaseOfMeal("ML001","Local", "KiriBath and Lunumiris",100.00));
        list.add(new DatabaseOfMeal("ML002","Local", "Bath(Samba,Basmathi,SuduKakulu,Elavalu Bath",100.00));
        list.add(new DatabaseOfMeal("ML003","Local", "Parippu",50.00));
        list.add(new DatabaseOfMeal("ML004","Local", "Malu Abul",70.00));
        list.add(new DatabaseOfMeal("ML005","Local", "Chicken Curry",80.00));
        list.add(new DatabaseOfMeal("ML006","Local", "WambatuMoju",50.00));
        list.add(new DatabaseOfMeal("MC007","Chinese", "Chinese Fied Rice",250.00));
        list.add(new DatabaseOfMeal("MC008","Chinese", "Chicken Devilled",350.00));
        list.add(new DatabaseOfMeal("MC009","Chinese", "Vegetable Chopsey",450.00));
        list.add(new DatabaseOfMeal("MF010","French", "Cafe Francals",550.00));
        list.add(new DatabaseOfMeal("MF011","French", "Delifrance",350.00));
        list.add(new DatabaseOfMeal("MF012","French", "Baguetse Franch Bokery",345.00));
    }
    public TextField mealPlanetxt;
    public TextField codetypetxt;
    public TextField pricetxt;
    public TextField foodtxt;

    public void initialize() {
        code.setCellValueFactory(new PropertyValueFactory<>("codeNumber"));
        pName.setCellValueFactory(new PropertyValueFactory<>("packageName"));
        nameOfFood.setCellValueFactory(new PropertyValueFactory<>("foodName"));
        price.setCellValueFactory(new PropertyValueFactory<>("prices"));
        loadAllData();
    }
    ObservableList<DatabaseOfMealTM> tmList = FXCollections.observableArrayList();
    private void loadAllData() {
        for (DatabaseOfMeal m : list) {
            DatabaseOfMealTM databaseOfMealTM = new DatabaseOfMealTM(m.getCodeNumber(),m.getPackageName(), m.getFoodName(),m.getPrices());
            tmList.add(databaseOfMealTM);
            mealTable.setItems(tmList);
        }
    }
    public void submitOnAction(ActionEvent actionEvent) {
        DatabaseOfMeal databaseOfMeal=new DatabaseOfMeal(
                codetypetxt.getText(),
                mealPlanetxt.getText(),
                foodtxt.getText(),
                Double.parseDouble(pricetxt.getText()));

                ObservableList<DatabaseOfMeal>  Meal=mealTable.getItems();
                Meal.add(databaseOfMeal);
                mealTable.setItems(Meal);

        new Alert(Alert.AlertType.CONFIRMATION, "Added!").show();
    }
    public void deleteOnAction(ActionEvent actionEvent) {
        int selectId=mealTable.getSelectionModel().getFocusedIndex();
        mealTable.getItems().remove(selectId);
        new Alert(Alert.AlertType.CONFIRMATION, "Delected!").show();
    }
    public void editOnAction(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.CONFIRMATION, "Edited!").show();

    }
}
