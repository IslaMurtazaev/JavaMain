package games.quizCard;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class QuizCardPlayer extends Application{

    public void start(Stage primaryStage) throws Exception {

        VBox mainLayout = new VBox(10);
        mainLayout.setPadding(new Insets(10));
        mainLayout.setAlignment(Pos.CENTER);
//        mainLayout.setBorder(new Border(BorderStroke.MEDIUM, new BorderImage[] {}));

        Button nextCard = new Button("Next card");
        nextCard.setOnAction(event -> nextCard());
        Button saveMenu = new Button("Save menu");
        saveMenu.setOnAction(event -> saveMenu());
        Button nextMenu = new Button("Next menu");
        nextMenu.setOnAction(event -> nextMenu());
        Button saveFile = new Button("Save file");
        saveFile.setOnAction(event -> saveFile());

        Label questionLabel = new Label("Question");
        questionLabel.setFont(new Font("serif", 16));
        Label answerLabel = new Label("Answer");
        answerLabel.setFont(new Font("serif", 16));

        TextArea question = new TextArea();
        question.setMaxSize(300, 80);
        TextArea answer = new TextArea();
        answer.setMaxSize(300, 20);



//        Menu fileMenu = new Menu("File");

        MenuBar fileMenu = new MenuBar();
        MenuItem newMenuItem = new MenuItem("New");
//        newMenuItem.setOnAction(event -> nextMenu());

//        fileMenu.set

//        fileMenu


        HBox top = new HBox();
        top.getChildren().add(fileMenu);

        mainLayout.getChildren().addAll(top,questionLabel, question, answerLabel, answer, nextCard);
        Stage window = primaryStage;
        Scene scene = new Scene(mainLayout);
        window.setScene(scene);
        window.setMinWidth(500);
        window.setMinHeight(400);
//        window.setFullScreen(true);
        window.setTitle("Quiz Card Builder");
//        window.getIcons().set()
        window.show();

    }

    public void nextCard(){

    }

    public void saveMenu(){

    }

    public void nextMenu(){

    }

    public void saveFile(){

    }

}
