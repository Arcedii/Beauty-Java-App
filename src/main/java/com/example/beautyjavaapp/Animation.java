package com.example.beautyjavaapp;

import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Stack;


public class Animation extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
                Pane pane = new Pane();
                Image image = new Image(new FileInputStream("src/main/java/image.png"));
                ImageView imageView = new ImageView(image);
                pane.getChildren().add(imageView);


                FadeTransition ft = new FadeTransition(Duration.millis(3000), imageView);
                ft.setFromValue(1.0);
                ft.setToValue(0.0);
                ft.setCycleCount(5);
                ft.setAutoReverse(true);
                ft.play();


                Scene scene = new Scene(pane, 400, 400);
                primaryStage.setScene(scene);
                primaryStage.show();


    }


    //PathTransition
    /*
                Pane pane = new Pane();
                Image image = new Image(new FileInputStream("src/main/java/image.png"));
                ImageView imageView = new ImageView(image);
                pane.getChildren().add(imageView);
                Line line = new Line(100, 200, 1000, 500);

                PathTransition transition = new PathTransition(Duration.millis(5000), line , imageView);
                transition.setCycleCount(3);
                transition.play();

                Scene scene = new Scene(pane, 400, 400);
                primaryStage.setScene(scene);
                primaryStage.show();
     */
}
