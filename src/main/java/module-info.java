module com.kodilla.kodillacourse {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kodilla.kodillacourse to javafx.fxml;
    exports com.kodilla.kodillacourse;
}