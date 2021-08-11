module com.fabian.emulatorlauncher {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.fabian.emulatorlauncher to javafx.fxml;
    exports com.fabian.emulatorlauncher;
    exports com.fabian.emulatorlauncher.Controller;
    opens com.fabian.emulatorlauncher.Controller to javafx.fxml;
}