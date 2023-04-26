module com.example.beautyjavaapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.beautyjavaapp to javafx.fxml;
    exports com.example.beautyjavaapp;
}