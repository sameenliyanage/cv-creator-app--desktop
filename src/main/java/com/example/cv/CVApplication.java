package com.example.cv;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;


public class CVApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private double x = 0;
    private double y = 0;


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Signin-view.fxml"));

        root.setOnMousePressed((MouseEvent event) ->{
            x = event.getSceneX();
            y = event.getSceneY();
        });

        root.setOnMouseDragged((MouseEvent event) ->{
            primaryStage.setX(event.getScreenX() - x);
            primaryStage.setY(event.getScreenY() - y);

            primaryStage.setOpacity(0.8);
        });

        root.setOnMouseReleased((MouseEvent event) ->{
            primaryStage.setOpacity(1);
        });

        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setTitle("CV Application");
        primaryStage.getIcons().add(new Image("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\images\\CV_logo.png"));
        primaryStage.setScene(new Scene(root, 600, 400));
        FadeTransition fadeout = new FadeTransition(Duration.seconds(0.3), root);
        fadeout.setFromValue(0.0);
        fadeout.setToValue(1.0);
        fadeout.play();
        primaryStage.show();
    }
}