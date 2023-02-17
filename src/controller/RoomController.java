package controller;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.DatabaseOfMeal;
import model.Room;
import tm.DatabaseOfMealTM;
import tm.RommTM;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class RoomController {
    public AnchorPane roomPane;
    public TableView roomTable;
    public TableColumn roomNumber;
    public TableColumn typeOfRoom;
    public TableColumn status;
    public TableColumn price;
    public TextField roomtypetxt;
    public TextField roomnumbertxt;
    public TextField pricetxt;
    public TextField statustxt;
    static ArrayList<Room> list=new ArrayList<>();
    static {
        list.add(new Room("Single",1,"Full Ac",15000));
        list.add(new Room("Single",2,"Full Ac",15000));
        list.add(new Room("Single",3,"Full Ac,",15000));
        list.add(new Room("Single",4,"Full Ac",15000));
        list.add(new Room("Single",5,"Full Ac",15000));
        list.add(new Room("Double",6,"Full Ac",35000));
        list.add(new Room("Double",7,"Full Ac",35000));
        list.add(new Room("Double",8,"Full Ac",35000));
        list.add(new Room("Double",9,"Full Ac",35000));
        list.add(new Room("Double",10,"Full Ac",35000));
        list.add(new Room("Double",11,"Full Ac",35000));
        list.add(new Room("Double",12,"Full Ac",35000));
        list.add(new Room("Double",13,"Full Ac",35000));
        list.add(new Room("Double",14,"Full Ac",35000));
        list.add(new Room("Double",15,"Full Ac",35000));
        list.add(new Room("Tripe",16,"Full Ac",55000));
        list.add(new Room("Tripe",17,"Full Ac",55000));
        list.add(new Room("Tripe",18,"Full Ac",55000));
        list.add(new Room("Tripe",19,"Full Ac",55000));
        list.add(new Room("Tripe",20,"Full Ac",55000));
        list.add(new Room("Quad",21,"Full Ac",75000));
        list.add(new Room("Quad",22,"Full Ac",75000));
        list.add(new Room("Quad",23,"Full Ac",75000));
        list.add(new Room("Quad",24,"Full Ac",75000));
        list.add(new Room("Quad",25,"Full Ac",75000));
    }
    public void initialize(){
        typeOfRoom.setCellValueFactory(new PropertyValueFactory<>("typeOfRoom"));
        roomNumber.setCellValueFactory(new PropertyValueFactory<>("roomNumber"));
        status.setCellValueFactory(new PropertyValueFactory<>("status"));
        price.setCellValueFactory(new PropertyValueFactory<>("price"));
        loadAllData();
    }
    ObservableList<RommTM> tmList = FXCollections.observableArrayList();
    private void loadAllData() {
        for (Room r : list) {
            RommTM rommTM = new RommTM(r.getTypeOfRoom(),r.getRoomNumber(),r.getStatus(),r.getPrice());
            tmList.add(rommTM);
            roomTable.setItems(tmList);
        }
    }
    public void submitOnAction(ActionEvent actionEvent) {
        Room room=new Room(
                roomnumbertxt.getText(),
                Integer.parseInt(roomtypetxt.getText()),
                statustxt.getText(),
                Double.parseDouble(pricetxt.getText()));
             ObservableList<Room> rooms=roomTable.getItems();
                 rooms.add(room);
                 roomTable.setItems(rooms);
                 new  Alert(Alert.AlertType.CONFIRMATION,"Added").show();
    }
    public void deleteOnAction(ActionEvent actionEvent) {
        int selectId=roomTable.getSelectionModel().getFocusedIndex();
        roomTable.getItems().remove(selectId);
        new Alert(Alert.AlertType.CONFIRMATION, "Delected!").show();
    }
    public void editOnAction(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.CONFIRMATION, "Edited!").show();
    }
}
