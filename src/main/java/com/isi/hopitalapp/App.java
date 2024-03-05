package com.isi.hopitalapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.persistence.*;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/pages/Acceuil.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 400);
        stage.setTitle("Acceuil");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        // Initialize EntityManagerFactory and EntityManager here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        // Launch JavaFX application
        launch(args);

        // Close EntityManager and EntityManagerFactory when application exits
        em.close();
        emf.close();
    }
}