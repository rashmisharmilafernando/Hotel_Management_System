package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
public class LoginController {
    public AnchorPane MainScreen;
    public Label date;
    public Label time;
    public JFXTextField txtusername;
    public JFXPasswordField txtPasswrd;
    public JFXButton btnCancle;
    String adminuserName = "Admin";
    String adminpassWord = "1234";
    String receptionistuserName = "User";
    String receptionistpassWord = "12345";
    boolean isLogin = true;

    public void btnLogin(ActionEvent actionEvent) throws IOException {
        String uName = txtusername.getText();
        String pWord = txtPasswrd.getText();
        if (isLogin) {
            if (uName.equals(adminuserName) && pWord.equals(adminpassWord)) {
                Stage window = (Stage) MainScreen.getScene().getWindow();
                window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/AdminDashBoradView.fxml"))));
            } else if (uName.equals(receptionistuserName) && pWord.equals(receptionistpassWord)) {
                Stage window = (Stage) MainScreen.getScene().getWindow();
                window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ReceptionistDashboradView.fxml"))));
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Incorrect Username or Password", ButtonType.OK);
            alert.showAndWait();
        }
    }
    public void btnCancle(ActionEvent actionEvent) {
        System.exit(0);
    }
}
