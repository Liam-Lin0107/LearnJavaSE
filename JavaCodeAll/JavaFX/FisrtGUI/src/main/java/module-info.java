module com.example.fisrtgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fisrtgui to javafx.fxml;
    exports com.example.fisrtgui;
}