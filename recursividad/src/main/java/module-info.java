module bordados.recursividad {
    requires javafx.controls;
    requires javafx.fxml;


    opens bordados.recursividad to javafx.fxml;
    exports bordados.recursividad;
    exports bordados.recursividad.claseCasteo.ejerciciosRecursividad;
    opens bordados.recursividad.claseCasteo.ejerciciosRecursividad to javafx.fxml;
}