package controlador;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import lista.Listas;
import modelo.LSLC;

public class ControladorLZ {

    @FXML
    private Label lblLz, lblLzOrdenada;

    public void initialize(){
        Listas.lzeta = new LSLC();
        Listas.lzetaOrdenada = new LSLC();
        Listas.lzeta.lz(Listas.lcero, Listas.ldos, Listas.ltres, Listas.lcinco);
        Listas.lzetaOrdenada.copiar(Listas.lzeta);
        Listas.lzetaOrdenada.ordenarAscendenteYDescendentemente();
        lblLz.setText(Listas.lzeta.recorre());
        lblLzOrdenada.setText(Listas.lzetaOrdenada.recorre());

    }
}
