package com.javafxproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
//    Stage is top-level javafx container, it's a main windows
    @Override
    public void start(Stage stage) throws IOException {

//        Load the UI from fxml
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Main.fxml")));


    /*
        MANUAL UI MAKING

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(16);
        root.setHgap(32);
        root.setGridLinesVisible(true);

        Text greetings = new Text("This is Text Label");
        greetings.setFill(Color.NAVY);

        Label greetings = new Label("This is Greetings Label");
        greetings.setTextFill(Color.NAVY);
        greetings.setFont(Font.font("SF Compact Display",FontWeight.MEDIUM,24));

        Label greetings2 = new Label("Lorem Ipsum");
        greetings2.setTextFill(Color.BLACK);
        greetings2.setFont(Font.font("SF Compact Display",FontWeight.MEDIUM,16));

        root.getChildren().add(greetings);
        root.getChildren().add(greetings2);
        root.addRow(0,greetings);
        root.addRow(1,greetings2);

    */

//        Initialize the scene
        Scene scene = new Scene(root, 700, 275, Color.WHITESMOKE);

//        Set Stage
        stage.setTitle("Java FX Test!");
        stage.setResizable(true);

//        Each stage require a scene, each scene needs scene graph (Rectangle, UI)
//        Java FX is like a theater, the stage is always the same, but the scene (UI, color) can be different
//        We don't have to make a new stage, but we can import from a different fxml
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}