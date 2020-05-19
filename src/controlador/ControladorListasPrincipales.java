package controlador;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import lista.Listas;

public class ControladorListasPrincipales {
    @FXML
    private Label lblL0, lblL2,lblL3,lblL5;

    @FXML
    public void initialize(){
        lblL0.setText(Listas.lcero.recorre());
        lblL2.setText(Listas.ldos.recorre());
        lblL3.setText(Listas.ltres.recorre());
        lblL5.setText(Listas.lcinco.recorre());
    }
}
