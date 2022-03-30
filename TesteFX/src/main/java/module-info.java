module com.mycompany.testefx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.testefx to javafx.fxml;
    exports com.mycompany.testefx;
}
