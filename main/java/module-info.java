module com.example.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.javafx to javafx.fxml;
    exports com.example.javafx.Labs.no4;
    exports com.example.javafx.Labs.no5;
//    exports com.example.javafx.Labs.no6;
    exports com.example.javafx.Labs.no7;
    exports com.example.javafx.Labs.no8;

}