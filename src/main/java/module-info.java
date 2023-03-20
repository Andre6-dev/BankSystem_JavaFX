module com.devspace.javafxproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens com.devspace.javafxproject to javafx.fxml;
    exports com.devspace.javafxproject;
    exports com.devspace.javafxproject.controllers;
    exports com.devspace.javafxproject.controllers.Admin;
    exports com.devspace.javafxproject.controllers.Client;
    exports com.devspace.javafxproject.models;
    exports com.devspace.javafxproject.views;
}