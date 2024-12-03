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

    void example1(){

//        System.out.println(txtUsername.getText());
//        System.out.println(txtPassword.getText());

        if(
                (
                        txtUsername.getText().equalsIgnoreCase("admin")
                                &&
                                txtPassword.getText().equalsIgnoreCase("pass")
                )
                        ||
                        (txtUsername.getText().equalsIgnoreCase("firstname"))
                                &&
                                txtPassword.getText().equalsIgnoreCase("lastname")
        )
        {
            txtMessage.setTextFill(Color.GREEN);
            txtMessage.setText("Login Successful");
        }
        else{
            txtMessage.setTextFill(Color.RED);
            txtMessage.setText("Incorrect Username and/or Password");
        }

    }


    LoginModel model = new LoginModel();

    @FXML
    void onRegister(ActionEvent event){

        try{
            model.registerUser(txtUsername.getText(), txtPassword.getText());
            txtMessage.setTextFill(Color.GREEN);
            txtMessage.setText("Registration Successful!");
        }
        catch (Exception ex){
            txtMessage.setTextFill(Color.RED);
            txtMessage.setText(ex.getMessage());
        }

    }

    @FXML
    void onSubmit(ActionEvent event) {

        try{
            model.loginUser(txtUsername.getText(), txtPassword.getText());
            txtMessage.setTextFill(Color.GREEN);
            txtMessage.setText("Login Successful!");
        }
        catch (Exception ex){
            txtMessage.setTextFill(Color.RED);
            txtMessage.setText(ex.getMessage());
        }


    }

    @FXML
    void initialize(){
        //method that runs AFTER all JavaFX componenets are loaded
        //but BEFORE stage is showned

        // ??? What about constructor?
        //constructor executes BEFORE all JavaFX components are loaded

        txtMessage.setTextFill(Color.GREEN);
        txtMessage.setText("Green is a good color!");
        txtMessage.setText("");
    }

}
