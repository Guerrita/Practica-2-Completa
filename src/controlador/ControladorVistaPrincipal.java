package controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class ControladorVistaPrincipal {

    @FXML
    private BorderPane contenedorPrincipal;

    public void mnuAgregar_action() {
        try {
            AnchorPane agregarDato = FXMLLoader
                    .load(getClass().getResource("../vista/agregar-datos.fxml"));
            this.contenedorPrincipal.setCenter(agregarDato);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void mnuListasPrincipales_action() {
        try {
            AnchorPane agregarDato = FXMLLoader
                    .load(getClass().getResource("../vista/listas-principales.fxml"));
            this.contenedorPrincipal.setCenter(agregarDato);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void mnuListasIntersectadas_action() {
        try {
            AnchorPane agregarDato = FXMLLoader
                    .load(getClass().getResource("../vista/listas-intersectadas.fxml"));
            this.contenedorPrincipal.setCenter(agregarDato);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void mnuListasExcluyentes_action() {
        try {
            AnchorPane agregarDato = FXMLLoader
                    .load(getClass().getResource("../vista/listas-excluyentes.fxml"));
            this.contenedorPrincipal.setCenter(agregarDato);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void mnuLZ_action() {
        try {
            AnchorPane agregarDato = FXMLLoader
                    .load(getClass().getResource("../vista/lz.fxml"));
            this.contenedorPrincipal.setCenter(agregarDato);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
