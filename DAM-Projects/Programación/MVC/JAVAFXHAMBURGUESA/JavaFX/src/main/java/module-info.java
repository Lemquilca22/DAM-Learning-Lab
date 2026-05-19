module com.example.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.javafx to javafx.fxml;
    opens com.example.javafx.Modelo to javafx.base;
    exports com.example.javafx;
}