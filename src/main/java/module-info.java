module com.example.f23comp1011tasks2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.f23comp1011tasks2 to javafx.fxml;
    exports com.example.f23comp1011tasks2;
}