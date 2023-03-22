package com.devspace.javafxproject;

import com.devspace.javafxproject.models.Model;
import com.devspace.javafxproject.views.ViewFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Model.getInstance().getViewFactory().showLoginWindow();
    }
}
