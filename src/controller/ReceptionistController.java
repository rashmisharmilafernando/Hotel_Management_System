package controller;

import com.jfoenix.controls.JFXButton;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReceptionistController {

    public AnchorPane frontDesk;
    public Label date;
    public Label time;
    public JFXButton dashbadButton;
    public JFXButton customerButton;
    public JFXButton bookingButton;
    public JFXButton okButton;
    public Button loginbutton;
    public AnchorPane secondAnchonePane;
    public BarChart MonthlyAvaliableRoom;
    public PieChart TodayAvaliableRoom;
    private volatile boolean stop;
    public void initialize(){
        timenow();
        dateNow();
        XYChart.Series bar=new XYChart.Series();
        bar.setName("Number of Rooms");
        bar.getData().add(new XYChart.Data<>("Single",5) );
        bar.getData().add(new XYChart.Data<>("Double",4) );
        bar.getData().add(new XYChart.Data<>("Triple",2) );
        bar.getData().add(new XYChart.Data<>("Quad",3) );
        MonthlyAvaliableRoom.getData().addAll(bar);
        ObservableList<PieChart.Data> piechartdata = FXCollections.observableArrayList(
                new PieChart.Data("Single Room", 2),
                new PieChart.Data("Double Room", 5),
                new PieChart.Data("Triple Room", 3),
                new PieChart.Data("Quad Room", 1));
        TodayAvaliableRoom.getData().addAll(piechartdata);
    }
    public void loginbuttonOnAction(ActionEvent actionEvent) throws IOException {
    Stage window =(Stage) frontDesk.getScene().getWindow();
    window.setScene(new Scene(FXMLLoader.load(getClass() .getResource("/view/LoginView.fxml"))));
}
    private void timenow() {
        Thread thread = new Thread(() -> {
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
            while (!stop) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                final String timenow = sdf.format(new Date());
                Platform.runLater(() -> {
                    time.setText(timenow);
                });
            }
        });
        thread.start();
    }
    private void dateNow() {
        Thread thread = new Thread(() -> {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            while (!stop) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                final String dateNow = sdf.format(new Date());
                Platform.runLater(() -> {
                    date.setText(dateNow);
                });
            }
        });
        thread.start();
    }
    public void bookingButtonOnAction(ActionEvent actionEvent) throws IOException {
        secondAnchonePane.getChildren().clear();
        Stage window = (Stage) secondAnchonePane.getScene().getWindow();
        secondAnchonePane.getChildren().add(FXMLLoader.load(getClass().getResource("/view/BookingView.fxml")));
    }
    public void okbuttonOnAction(ActionEvent actionEvent) throws IOException {
        secondAnchonePane.getChildren().clear();
        Stage window = (Stage) secondAnchonePane.getScene().getWindow();
        secondAnchonePane.getChildren().add(FXMLLoader.load(getClass().getResource("/view/ConfirmView.fxml")));
    }
    public void customerButtonOnAction(ActionEvent actionEvent) throws IOException {
        secondAnchonePane.getChildren().clear();
        Stage window = (Stage) secondAnchonePane.getScene().getWindow();
        secondAnchonePane.getChildren().add(FXMLLoader.load(getClass().getResource("/view/CustomerView.fxml")));
    }
    public void dashbadButtonOnAction(ActionEvent actionEvent) throws IOException {
        frontDesk.getChildren().clear();
        Stage window = (Stage) frontDesk.getScene().getWindow();
        frontDesk.getChildren().add(FXMLLoader.load(getClass().getResource("/view/ReceptionistDashboradView.fxml")));
    }
}
