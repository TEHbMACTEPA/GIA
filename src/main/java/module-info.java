module com.example.java0505 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java0505 to javafx.fxml;
    exports com.example.java0505;
}