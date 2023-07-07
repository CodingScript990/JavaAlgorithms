module com.example.algorithmscodeup {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.algorithmscodeup to javafx.fxml;
    exports com.example.algorithmscodeup;
}