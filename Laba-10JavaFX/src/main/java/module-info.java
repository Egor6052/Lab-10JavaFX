module com.example.laba10javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.laba10javafx to javafx.fxml;
    exports com.example.laba10javafx;
}