module com.class.fxcourse{
        requires javafx.controls;
        requires javafx.fxml;
        requires javafx.web;

        requires org.controlsfx.controls;
        requires com.dlsc.formsfx;
        requires validatorfx;
        requires org.kordamp.ikonli.javafx;
        requires org.kordamp.bootstrapfx.core;
        requires eu.hansolo.tilesfx;

        opens com.class.fxcourse to javafx.fxml;
        exports com.class.fxcourse;
        }