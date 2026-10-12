module com.programandofodacci.terranovaindustrialist {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.programandofodacci.terranovaindustrialist to javafx.fxml;
    exports com.programandofodacci.terranovaindustrialist;
}
