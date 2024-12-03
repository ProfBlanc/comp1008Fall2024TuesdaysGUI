package ca.georgiancollege.comp1008fall2024tuesdaysgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class LoginController {

    @FXML
    private Label txtMessage;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void onSubmit(ActionEvent event) {


        System.out.println(txtUsername.getText());
        System.out.println(txtPassword.getText());

    }

    @FXML
    void initialize(){
        //method that runs AFTER all JavaFX componenets are loaded
        //but BEFORE stage is showned

        // ??? What about constructor?
        //constructor executes BEFORE all JavaFX components are loaded

        txtMessage.setTextFill(Color.GREEN);
        txtMessage.setText("Green is a good color!");

    }

}
