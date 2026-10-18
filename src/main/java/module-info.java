module com.example.apptransfer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.apptransfer to javafx.fxml;
    exports com.example.apptransfer;
}