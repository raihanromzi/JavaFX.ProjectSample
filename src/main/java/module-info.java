module com.javafxproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javafxproject to javafx.fxml;
    exports com.javafxproject;
}