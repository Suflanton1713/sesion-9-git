module r.sesion9git {
    requires javafx.controls;
    requires javafx.fxml;


    opens r.sesion9git to javafx.fxml;
    exports r.sesion9git;
}