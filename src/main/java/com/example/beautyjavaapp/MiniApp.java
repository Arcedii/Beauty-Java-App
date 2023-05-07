package com.example.beautyjavaapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class MiniApp extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        BorderPane pane = new BorderPane();
        TextArea textArea = new TextArea();
        ScrollPane scrollPane = new ScrollPane(textArea);

        Image image = new Image(new FileInputStream("src/main/java/Java.jpg"));
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(300);
        imageView.setFitHeight(250);

        Label l1 = new Label("Java" , imageView);
        l1.setContentDisplay(ContentDisplay.TOP);

        pane.setLeft(l1);
        pane.setCenter(textArea);

        Scene scene = new Scene(pane, 400,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
