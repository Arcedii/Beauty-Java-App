package com.example.beautyjavaapp;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
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


public class OnTextDrag extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Pane pane = new Pane();
        Text text = new Text("Передвинь меня сцуко!");
        text.setX(200);
        text.setY(200);

        text.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                text.setX(mouseEvent.getX());
                text.setY(mouseEvent.getY());

            }
        });

        pane.getChildren().add(text);
        Scene scene = new Scene(pane ,400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
