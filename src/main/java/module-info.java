module es.ieslosmontecillos.expresionlambakeyevent {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.expresionlambakeyevent to javafx.fxml;
    exports es.ieslosmontecillos.expresionlambakeyevent;
}