package controller;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.BillTable;
import tm.BillTableTM;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ConfirmController {
    public TableView confirmTable;
    public TableColumn roomTypeTable;
    public TableColumn roomNoTable;
    public TableColumn customerTable;
    public TableColumn datesTable;
    public TableColumn nightTable;
    public TableColumn mealsTable;
    public TableColumn priceTable;
    public TableColumn printButton;
    public TableColumn deleteButton;
    public AnchorPane confirmPanel;
    static ArrayList<BillTable> list=new ArrayList<>();
    static {
        list.add(new BillTable("Quad model.Room",1,"Kasun Perera","2021.08.12 - 2021.08.15",3,"local",15000));
    }
    public void initialize(){
        roomTypeTable.setCellValueFactory(new PropertyValueFactory<>("roomType"));
        roomNoTable.setCellValueFactory(new PropertyValueFactory<>("roomNumber"));
        customerTable.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        datesTable.setCellValueFactory(new PropertyValueFactory<>(" dates"));
       nightTable.setCellValueFactory(new PropertyValueFactory<>("night"));
        mealsTable.setCellValueFactory(new PropertyValueFactory<>("meal"));
        priceTable.setCellValueFactory(new PropertyValueFactory<>("price"));
        printButton.setCellValueFactory(new PropertyValueFactory<>("printButton"));
        deleteButton.setCellValueFactory(new PropertyValueFactory<>("deleteButton"));
       loadAllDate();
    }
    ObservableList<BillTableTM> billList= FXCollections.observableArrayList();
    private  void loadAllDate(){
        for(BillTable b:list){
            Button btn=new Button("Print");
            Button btn1=new Button("Delete");
            BillTableTM billTableTM=new BillTableTM(b.getRoomType(),b.getRoomNumber(),b.getCustomerName(),b.getDates(),b.getNight(),b.getMeals(),b.getPrice(),btn,btn1);
            billList.add(billTableTM);
            confirmTable.setItems(billList);
        }
    }
}
