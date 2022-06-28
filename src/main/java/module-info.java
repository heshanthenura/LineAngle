module com.heshanthenura.lineangle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.heshanthenura.lineangle to javafx.fxml;
    exports com.heshanthenura.lineangle;
}