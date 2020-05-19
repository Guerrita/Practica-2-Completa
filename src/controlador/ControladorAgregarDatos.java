package controlador;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import lista.Listas;
import sun.rmi.server.InactiveGroupException;

import javax.swing.*;

public class ControladorAgregarDatos {

    @FXML
    private TextField txtDato;


    @FXML
    public void  initialize(){
        txtDato.setTextFormatter(new TextFormatter<>(change -> {
            if (change.getControlNewText().matches("([1-9][0-9]*)?")&& change.getControlNewText().length()<=12){
                return change;
            }
            return null;
        }));
    }

    public void btnGuardar_action(){
        Integer dato = Integer.valueOf(txtDato.getText());
        if (dato%2==0){//Se ingresan los datos al final de la lista
            if (dato%3==0){
                if (dato%5==0){//El dato es multiplo de 2, de 3 y de 5
                    Listas.ldos.insertarAlFinal(dato);
                    Listas.ltres.insertarAlInicio(dato);
                    Listas.lcinco.insertarAscendentemente(dato);
                }
                else {//El dato es multiplo de 2 y de 3
                    Listas.ldos.insertarAlFinal(dato);
                    Listas.ltres.insertarAlInicio(dato);
                }
            }
            else if (dato%5==0){//El dato es multiplo de 2 y de 5
                Listas.ldos.insertarAlFinal(dato);
                Listas.lcinco.insertarAscendentemente(dato);
            }
            else { //El dato es solo multiplo de 2
                Listas.ldos.insertarAlFinal(dato);
            }
        }
        else if (dato%3==0){//Se ingresan los datos al principio de la lista
            if (dato%5==0){//El dato es multiplo de 3 y de 5
                Listas.ltres.insertarAlInicio(dato);
                Listas.lcinco.insertarAscendentemente(dato);
            }
            else {//El dato es solo multiplo de 3
                Listas.ltres.insertarAlInicio(dato);
            }
        }
        else if (dato%5==0){ //Se crea la LSLC de modo que los datos queden ordenados ascendentemente
            Listas.lcinco.insertarAscendentemente(dato);
        }

        else { //Se crea la LSLC de modo que los datos queden ordenados descendentemente
            Listas.lcero.insertarDescendentemente(dato);
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Agregar dato");
        alert.setHeaderText("Dato");
        alert.setContentText("El registro del dato ha sido exitoso");
        alert.showAndWait();

        txtDato.clear();
    }


}
