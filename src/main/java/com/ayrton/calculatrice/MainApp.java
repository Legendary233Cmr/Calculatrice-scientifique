package com.ayrton.calculatrice;

import com.ayrton.calculatrice.view.CalculatorView;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        CalculatorView calculatriceView = new CalculatorView();
        Scene scene = new Scene(calculatriceView);

        stage.setTitle("Calculatrice scientifique");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(MainApp.class, args);
    }
}