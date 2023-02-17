package controller;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.BookingSheet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookingController {



    public TextField pricetxt;
    public TableView tableBooking;
    public TableColumn <BookingSheet,String>roomType;
    public TableColumn<BookingSheet,Integer> roomNumber;
    public TableColumn<BookingSheet, Integer> date;
    public TableColumn<BookingSheet,String> mealPlan;
    public TableColumn <BookingSheet,String>nameOfFood;
    public TableColumn<BookingSheet,Integer> price;
    public TextField roomtypetxt;
    public TextField roomnumbertxt;
    public TextField mealPlanetxt;
    public TextField foodtxt;
    public TextField datetxt;

    public void initialize(){
     roomType.setCellValueFactory(new PropertyValueFactory<BookingSheet,String>("Type"));
     roomNumber.setCellValueFactory(new PropertyValueFactory<BookingSheet,Integer>("number"));
     date.setCellValueFactory(new PropertyValueFactory<BookingSheet, Integer>("datenow"));
     mealPlan.setCellValueFactory(new PropertyValueFactory<BookingSheet,String>("tablemealPlan"));
     nameOfFood.setCellValueFactory(new PropertyValueFactory<BookingSheet,String>("Food"));
     price.setCellValueFactory(new PropertyValueFactory<BookingSheet,Integer>("allprice"));

 }
    public void submitOnAction(ActionEvent actionEvent) {
    BookingSheet bookingSheet=new BookingSheet(
            roomtypetxt.getText(),
            Integer.parseInt(roomnumbertxt.getText()),
            datetxt.getText(),
            mealPlanetxt.getText(),
            foodtxt.getText(),
            Integer.parseInt(pricetxt.getText()));

        ObservableList<BookingSheet> bookingSheets=tableBooking.getItems();
        bookingSheets.add(bookingSheet);
        tableBooking.setItems(bookingSheets);

        new Alert(Alert.AlertType.CONFIRMATION, "Added!").show();
    }
    public void deleteOnAction(ActionEvent actionEvent) {
        int selectdID =tableBooking.getSelectionModel().getSelectedIndex();
        tableBooking.getItems().remove(selectdID);
        new Alert(Alert.AlertType.CONFIRMATION, "Delected!").show();
    }


}
