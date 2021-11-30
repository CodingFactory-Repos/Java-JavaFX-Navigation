module me.loule.navigation {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens me.loule.navigation to javafx.fxml;
    exports me.loule.navigation;
    exports me.loule.navigation.controller;
    opens me.loule.navigation.controller to javafx.fxml;
}