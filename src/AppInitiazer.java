import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitiazer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("assest/image/modern-water-waves-logo-design-blue-ocean-sign-vector-26746297-removebg-preview.png")));
        primaryStage.setTitle("Blue Ocean");
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/LoginView.fxml"))));
        primaryStage.show();

    }
}
