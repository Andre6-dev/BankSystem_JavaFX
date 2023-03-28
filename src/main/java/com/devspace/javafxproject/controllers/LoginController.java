package com.devspace.javafxproject.controllers;

import com.devspace.javafxproject.models.Model;
import com.devspace.javafxproject.views.AccountType;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.collections.FXCollections;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public ChoiceBox<AccountType> acc_selector;
    public Label payee_address_lbl;
    public TextField payee_address_fld;
    public TextField payee_password_fld;
    public Button login_btn;
    public Label error_lbl;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        acc_selector.setItems(FXCollections.observableArrayList(AccountType.CLIENT, AccountType.ADMIN));
        acc_selector.setValue(Model.getInstance().getViewFactory().getLoginAccountType());

        // Select the account type
        acc_selector.valueProperty().addListener(observable ->
                Model.getInstance().getViewFactory().setLoginAccountType(acc_selector.getValue()));

        login_btn.setOnAction(event -> onLogin());
    }

    private void onLogin() {
        // Get the stage from the label
        Stage stage = (Stage) error_lbl.getScene().getWindow();
        // Show the client window based on the account type
        if (Model.getInstance().getViewFactory().getLoginAccountType() == AccountType.CLIENT) {
            // Evaluate clieng login credentials
            Model.getInstance().evaluateClientCred(payee_address_fld.getText(), payee_password_fld.getText());
            if (Model.getInstance().getClientLoginSuccessFlag()) {
                Model.getInstance().getViewFactory().showClientWindow();
                Model.getInstance().getViewFactory().closeStage(stage);
            } else {
                error_lbl.setText("Invalid Credentials");
                payee_address_fld.setText("");
                payee_password_fld.setText("");
            }
        } else {
            Model.getInstance().getViewFactory().showAdminWindow();
        }
    }
}
