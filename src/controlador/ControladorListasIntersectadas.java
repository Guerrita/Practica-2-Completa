package controlador;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import lista.Listas;

public class ControladorListasIntersectadas {
    @FXML
    private Label lblL2L3, lblL2L5, lblL3L5, lblL2L3L5;

    @FXML
    public void initialize() {
        Listas.ldosTres=Listas.ldos.interseccionLdosLtres();
        Listas.ldosCinco= Listas.ldos.interseccionLdosLcinco();
        Listas.ltresCinco = Listas.ltres.interseccionLtresLcinco();
        Listas.ldosTresCinco = Listas.ldos.interseccionLdosLtresLcinco();
        lblL2L3.setText(Listas.ldosTres.recorre());
        lblL2L5.setText(Listas.ldosCinco.recorre());
        lblL3L5.setText(Listas.ltresCinco.recorre());
        lblL2L3L5.setText(Listas.ldosTresCinco.recorre());
    }
}
