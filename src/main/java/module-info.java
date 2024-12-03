module ca.georgiancollege.comp1008fall2024tuesdaysgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.georgiancollege.comp1008fall2024tuesdaysgui to javafx.fxml;
    exports ca.georgiancollege.comp1008fall2024tuesdaysgui;
}