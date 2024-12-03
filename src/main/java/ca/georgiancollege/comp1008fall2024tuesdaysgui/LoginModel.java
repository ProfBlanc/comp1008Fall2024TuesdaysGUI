package ca.georgiancollege.comp1008fall2024tuesdaysgui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LoginModel {

    Path path;


    public LoginModel(){

        path = Path.of("src", "main", "resources",
                "ca", "georgiancollege",
                "comp1008fall2024tuesdaysgui", "data");
        try{
            if(!path.toFile().exists()){
                Files.createDirectory(path);
            }
        }
        catch (IOException e){
            System.err.println("Unable to create directory");
        }

    }

    void registerUser(String username, String password) {}

    void loginUser(String username, String password) {

        if(username.equals("admin") && password.equals("pass"))
            return;

        throw new IllegalArgumentException("Incorrect username and/or password");

    }

}
