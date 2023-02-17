package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Customer;

import java.io.IOException;

public class CustomerController {

    public AnchorPane addinforPanel;
    public TableView inforTable;
    public TableColumn <Customer,String>nametable;
    public TableColumn<Customer,Integer> nictable;
    public TableColumn <Customer,Integer>roomnotable;
    public TableColumn<Customer,Integer> numbertable;
    public TableColumn<Customer,String> emailtable;
    public TableColumn <Customer,String>addresstable;
    public TextField nametxt;
    public TextField roomnotxt;
    public TextField nictxt;
    public TextField teletxt;
    public TextField emailtxt;
    public TextField addresstxt;
    public  void initialize(){
        nametable.setCellValueFactory(new PropertyValueFactory<Customer,String>("customername"));
        nictable.setCellValueFactory(new PropertyValueFactory<Customer,Integer>("customernic"));
        roomnotable.setCellValueFactory(new PropertyValueFactory<Customer,Integer>("customerroomno"));
        numbertable.setCellValueFactory(new PropertyValueFactory<Customer,Integer>("customertelephone"));
        emailtable.setCellValueFactory(new PropertyValueFactory<Customer,String>("email"));
        addresstable.setCellValueFactory(new PropertyValueFactory<Customer,String>("address"));

            ObservableList<Customer> list= FXCollections.observableArrayList();
            list.add(new Customer("Kamal Parera",890,1,0776543454,"kamal23@gmail.com","Panadura"));
            list.add(new Customer("Saman silva",987,8,0776456543,"saman90@gmail.com","Kaluthra"));
            list.add(new Customer("Kamal Parera",567,4,0764567654,"shuh23@gmail.com","galle"));
            list.add(new Customer("Kamal Parera",3456,3,0733456454,"dinelsha45@gmail.com","Colombo"));
            list.add(new Customer("Kamal Parera",4567,9,07212343454,"salani89@gmail.com","Panadura"));
            list.add(new Customer("Kamal Parera",1234,2,0720123264,"ananda@gmail.com","wadduwa"));
            list.add(new Customer("Kamal Parera",2345,3,0771232123,"Nimal@gmail.com","Hirana"));
            list.add(new Customer("Kamal Parera",4567,10,0731234545,"charu@gmail.com","kurunagala"));
            inforTable.setItems(list);

    }
    public void submitOnAction(ActionEvent actionEvent) {
        Customer customer=new Customer(
                nametxt.getText(),
               Integer.parseInt(roomnotxt.getText()) ,
                Integer.parseInt(nictxt.getText()),
               Integer.parseInt( teletxt.getText()),
                emailtxt.getText(),
                addresstxt.getText());
        ObservableList<Customer> customers=inforTable.getItems();
        customers.add(customer);
        inforTable.setItems(customers);
    }
    public void bookingRoomOnAction(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage) addinforPanel.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("BookingView.fxml"))));
    }
    public void deleteOnAction(ActionEvent actionEvent) {
        int selectedID=inforTable.getSelectionModel().getSelectedIndex();
        inforTable.getItems().remove(selectedID);
    }
}
