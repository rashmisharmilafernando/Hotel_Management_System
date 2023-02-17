package controller;

import com.jfoenix.controls.JFXButton;
import javafx.application.Platform;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class AdminDashBoradFxmlController {
    public Label date;
    public AnchorPane anchorpane;
    public JFXButton dashbadButton;
    public JFXButton roomButton;
    public JFXButton mealButton;
    public JFXButton incomrButton;
    public AreaChart areachart;
    public AnchorPane secondeAnchorPane;
    @FXML
    private Label time;
    private volatile boolean stop;
    public void initialize() {
        timenow();
        dateNow();

        XYChart.Series series = new XYChart.Series();
        XYChart.Series series1 = new XYChart.Series();
        XYChart.Series series2 = new XYChart.Series();

        series.setName("Revenus");
        series.getData().add(new XYChart.Data("8th", 1200000.00));
        series.getData().add(new XYChart.Data("9th", 2000000.00));
        series.getData().add(new XYChart.Data("10th", 3300000.00));
        series.getData().add(new XYChart.Data("11th", 4000000.00));
        series.getData().add(new XYChart.Data("12th", 5600000.00));

        series1.setName("Expenese");
        series1.getData().add(new XYChart.Data("8th", 500000.00));
        series1.getData().add(new XYChart.Data("9th", 750000.00));
        series1.getData().add(new XYChart.Data("10th", 870000.00));
        series1.getData().add(new XYChart.Data("11th", 950000.00));
        series1.getData().add(new XYChart.Data("12th", 250000.00));

        series2.setName("profit");
        series2.getData().add(new XYChart.Data("8th", 750400.00));
        series2.getData().add(new XYChart.Data("9th", 1850000.00));
        series2.getData().add(new XYChart.Data("10th", 2250000.00));
        series2.getData().add(new XYChart.Data("11th", 3350000.00));
        series2.getData().add(new XYChart.Data("12th", 4340000.00));
        areachart.getData().addAll(series, series1, series2);


    }
    public void loginbuttonOnAction(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage) anchorpane.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass() .getResource("/view/LoginView.fxml"))));
    }
    public void dashbadButtonOnAction(ActionEvent actionEvent) throws IOException {
        anchorpane.getChildren().clear();
        Stage window = (Stage) anchorpane.getScene().getWindow();
        anchorpane.getChildren().add(FXMLLoader.load(getClass().getResource("/view/AdminDashBoradView.fxml")));


    }
    public void roomButtonOnAction(ActionEvent actionEvent) throws IOException {
                    secondeAnchorPane.getChildren().clear();
                    Stage window = (Stage) secondeAnchorPane.getScene().getWindow();
                    secondeAnchorPane.getChildren().add(FXMLLoader.load(getClass().getResource("/view/RoomView.fxml")));
    }
    public void mealButtonOnAction(ActionEvent actionEvent) throws IOException {
                     secondeAnchorPane.getChildren().clear();
                     Stage window = (Stage) secondeAnchorPane.getScene().getWindow();
                   secondeAnchorPane.getChildren().add(FXMLLoader.load(getClass().getResource("/view/MealView.fxml")));
    }
    public void incomebuttonOnAction(ActionEvent actionEvent) throws IOException {
           secondeAnchorPane.getChildren().clear();
           Stage window = (Stage) secondeAnchorPane.getScene().getWindow();
          secondeAnchorPane.getChildren().add(FXMLLoader.load(getClass().getResource("/view/IncomeReportsView.fxml")));
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

}



