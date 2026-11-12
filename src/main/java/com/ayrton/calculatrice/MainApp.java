package com.ayrton.calculatrice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        Label message = new Label("Ma calculatrice scientifique démarre !");

        StackPane racine = new StackPane(message);
        Scene scene = new Scene(racine, 500, 300);

        stage.setTitle("Calculatrice scientifique");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}