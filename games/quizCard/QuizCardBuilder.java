package games.quizCard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class QuizCardBuilder extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage){
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        } catch (IOException ex){}
    }

}
