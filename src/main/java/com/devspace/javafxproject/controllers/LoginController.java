package com.devspace.javafxproject.controllers;

import com.devspace.javafxproject.models.Model;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public ChoiceBox acc_selector;
    public Label payee_address_lbl;
    public TextField payee_address_fld;
    public TextField payee_password_fld;
    public Button login_btn;
    public Label error_lbl;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        login_btn.setOnAction(event -> onLogin());
    }

    private void onLogin() {
        // Get the stage from the label
        Stage stage = (Stage) error_lbl.getScene().getWindow();
        // Close the stage after login
        Model.getInstance().getViewFactory().closeStage(stage);
        // Show the client window
        Model.getInstance().getViewFactory().showClientWindow();
    }
}
