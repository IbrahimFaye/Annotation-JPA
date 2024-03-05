module com.isi.hopitalapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires java.sql;
    requires org.hibernate.orm.core;


    opens com.isi.hopitalapp to javafx.fxml;
    exports com.isi.hopitalapp;
    opens com.isi.hopitalapp.entities;
    exports com.isi.hopitalapp.controller;
    opens com.isi.hopitalapp.controller;
}