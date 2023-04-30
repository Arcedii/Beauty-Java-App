package com.example.beautyjavaapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Stack;

public class HelloApplication extends Application {
    private Circle circle;

    @Override
    public void start(Stage primaryStage) throws IOException {
             circle = new Circle(50);
             circle.setFill(Color.BLUE);
             StackPane stackPane = new StackPane();
             stackPane.getChildren().add(circle);

             Button button = new Button("Change");
             StackPane stackPane2 = new StackPane();
             stackPane2.getChildren().add(button);
             button.setOnAction(new ButtonListener());

             BorderPane pane = new BorderPane();
             pane.setCenter(stackPane);
             pane.setBottom(stackPane2);

             Scene scene = new Scene(pane, 400, 400);
             primaryStage.setScene(scene);
             primaryStage.show();



    }
    class ButtonListener implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent activeEvent) {
            if(circle.getRadius() == 0) circle.setRadius(100);
            else circle.setRadius(circle.getRadius() - 10);
        }
    }

    /* Circle circle = new Circle(50);
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setFill(Color.RED);
    //  circle.setStroke(Color.RED);
        circle.setStrokeWidth(20);

    Circle circle2 = new Circle(50);
        circle2.setCenterX(300);
        circle2.setCenterY(150);
        circle2.setFill(Color.GREEN);
    //  circle.setStroke(Color.RED);
        circle2.setStrokeWidth(20);

    Circle circle3 = new Circle(50);
        circle3.setCenterX(100);
        circle3.setCenterY(300);
        circle3.setFill(Color.BLUE);
    //  circle.setStroke(Color.RED);
        circle3.setStrokeWidth(20);


    Text text = new Text("RGB");
        text.setX(140);
        text.setY(215);
    // text.setFill(Color.PURPLE);
    // Font font = Font.font("Time New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22);
    // text.setFont(font);
        text.setStyle("-fx-font-size : 40px;" + "-fx-fill : linear-gradient(to right, red, blue, green, white, red);");
    // Color color = new Color(1,0.5,0,1);
    // text.setFill(color);



    Pane pane = new Pane();
        pane.getChildren().add(circle);
        pane.getChildren().add(circle2);
        pane.getChildren().add(circle3);
        pane.getChildren().add(text);

    Scene scene = new Scene(pane, 400,400);
        primaryStage.setScene(scene);
        primaryStage.show();  */

}