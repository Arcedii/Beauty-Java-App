package com.example.beautyjavaapp;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
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


public class CheckBox_RadioBox extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Pane pane = new Pane();

        Text text = new Text("move me!");
        pane.getChildren().addAll(text);
        text.setLayoutX(200);
        text.setLayoutY(200);

        text.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                text.setText("Clicked");
            }
        });

        text.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                text.setText("Moved");
            }
        });

        text.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if(keyEvent.getCode() == KeyCode.S) {
                    text.setY(text.getY() + 10);
                } else if (keyEvent.getCode() == KeyCode.W) {
                    text.setY(text.getY() - 10);
                }else if (keyEvent.getCode() == KeyCode.A) {
                    text.setX(text.getX() - 10);
                }else if (keyEvent.getCode() == KeyCode.D) {
                    text.setX(text.getX() + 10);
                }
            }
        });

        Scene scene = new Scene(pane, 400,400);
        primaryStage.setScene(scene);
        primaryStage.show();
        text.requestFocus();
    }
}

/*
  Pane pane = new Pane();
        RadioButton but1 = new RadioButton("Yes");
        RadioButton but2 = new RadioButton("No");
        Text text = new Text();
        pane.getChildren().addAll(but1, but2, text);
        but1.setLayoutX(20);
        but1.setLayoutY(20);
        but2.setLayoutX(20);
        but2.setLayoutY(40);
        text.setLayoutX(20);
        text.setLayoutY(80);


        ToggleGroup group = new ToggleGroup();
        but1.setToggleGroup(group);
        but2.setToggleGroup(group);

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(but1.isSelected() && !but2.isSelected()) {
                    text.setText("Yes");
                } else if (!but1.isSelected() && but2.isSelected()) {
                    text.setText("Noooooooooooooo");
                }else {
                    text.setText("Ni_ce_go от слова nothing");
                }
            }
        };

        but1.setOnAction(event);
        but2.setOnAction(event);

        Scene scene = new Scene(pane, 400,400);
        primaryStage.setScene(scene);
        primaryStage.show();
 */





/*
    Pane pane = new Pane();
    CheckBox box1 = new CheckBox("Yes");
    CheckBox box2 = new CheckBox("No");
    Text text = new Text();
        pane.getChildren().addAll(box1, box2, text);
                box1.setLayoutX(20);
                box1.setLayoutY(40);
                box2.setLayoutX(20);
                box2.setLayoutY(80);
                text.setX(20);
                text.setY(120);

EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent actionEvent) {
        if(box1.isSelected() && !box2.isSelected()) {
        text.setText("Pizda");
        } else if (!box1.isSelected() && box2.isSelected()) {
        text.setText("No no no nooooooo no no no");
        } else if (box1.isSelected() && box2.isSelected()) {
        text.setText("Совсем ебнутый?");
        } else {
        text.setText("Ni_ce_go от слова nothing");
        }
        }
};

        box1.setOnAction(handler);
        box2.setOnAction(handler);
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

*/







