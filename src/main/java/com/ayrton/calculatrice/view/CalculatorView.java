package com.ayrton.calculatrice.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class CalculatorView extends BorderPane {

    private final TextField affichage;

    public CalculatorView() {
        setPrefSize(500, 650);

        affichage = new TextField("0");
        affichage.setEditable(false);
        affichage.setFocusTraversable(false);
        affichage.setAlignment(Pos.CENTER_RIGHT);
        affichage.setPrefHeight(80);

        setTop(affichage);
        setCenter(creerGrilleBoutons());
    }

    private GridPane creerGrilleBoutons() {
        GridPane grille = new GridPane();

        grille.setPadding(new Insets(15));
        grille.setHgap(10);
        grille.setVgap(10);
        grille.setAlignment(Pos.CENTER);

        ajouterBouton(grille, "7", 0, 0);
        ajouterBouton(grille, "8", 1, 0);
        ajouterBouton(grille, "9", 2, 0);

        ajouterBouton(grille, "4", 0, 1);
        ajouterBouton(grille, "5", 1, 1);
        ajouterBouton(grille, "6", 2, 1);

        ajouterBouton(grille, "1", 0, 2);
        ajouterBouton(grille, "2", 1, 2);
        ajouterBouton(grille, "3", 2, 2);

        ajouterBouton(grille, "0", 1, 3);

        return grille;
    }

    private void ajouterBouton(GridPane grille, String texte, int colonne, int ligne) {
        Button bouton = new Button(texte);

        bouton.setPrefSize(100, 70);

        grille.add(bouton, colonne, ligne);
    }

    public TextField getAffichage() {
        return affichage;
    }
}