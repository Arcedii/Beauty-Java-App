package com.example.beautyjavaapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Circle circle = new Circle(50);
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setFill(Color.BLUE);
        circle.setStroke(Color.RED);
        circle.setStrokeWidth(20);


        Text text = new Text("Hi");
        text.setX(200);
        text.setY(200);
       // text.setFill(Color.PURPLE);
       // Font font = Font.font("Time New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22);
       // text.setFont(font);
        text.setStyle("-fx-font-size : 50px; -fx-fill: red;");


        Pane pane = new Pane();
        pane.getChildren().add(circle);
        pane.getChildren().add(text);

        Scene scene = new Scene(pane, 400,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}