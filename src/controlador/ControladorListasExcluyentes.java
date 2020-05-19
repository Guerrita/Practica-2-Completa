package controlador;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import lista.Listas;

public class ControladorListasExcluyentes {
    @FXML
    private Label lblLdosNoTresNoCinco, lblLtresNoDosNoCinco, lblLcincoNoDosNoTres;

    @FXML
    public void initialize() {
        Listas.ldosNoTresNoCinco = Listas.ldos.ldosNoLtresNoLcinco();
        Listas.ltresNoDosNoCinco = Listas.ltres.ltresNoLdosNoLcinco();
        Listas.lcincoNoDosNoTres = Listas.lcinco.lcincoNoLtresNoLdos();

        lblLdosNoTresNoCinco.setText(Listas.ldosNoTresNoCinco.recorre());
        lblLtresNoDosNoCinco.setText(Listas.ltresNoDosNoCinco.recorre());
        lblLcincoNoDosNoTres.setText(Listas.lcincoNoDosNoTres.recorre());

    }
}
