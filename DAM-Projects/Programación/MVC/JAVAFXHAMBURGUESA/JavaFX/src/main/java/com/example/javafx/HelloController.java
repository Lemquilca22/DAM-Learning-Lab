package com.example.javafx;

import com.example.javafx.Modelo.Comida;
import com.example.javafx.Modelo.Bebida;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    // Declaramos los IDs que pusimos en el archivo FXML
    @FXML private TextField txtNombre;
    @FXML private ComboBox<String> cbTamanio;
    @FXML private ComboBox<String> cbPanInf;
    @FXML private ComboBox<String> cbIng1;
    @FXML private ComboBox<String> cbCarne;
    @FXML private ComboBox<String> cbIng2;
    @FXML private ComboBox<String> cbPanSup;
    @FXML private ComboBox<String> cbBebida;
    @FXML private TextArea txtRecibo;


    private Comida modeloAux = new Comida("", "", "", "", "", "", "");


    @FXML
    public void initialize() {

        for (int i = 0; i < modeloAux.cantidadTamanios(); i++) {
            cbTamanio.getItems().add(modeloAux.gettamanio(i));
        }

        for (int i = 0; i < modeloAux.cantidadPan(); i++) {
            cbPanInf.getItems().add(modeloAux.getPan(i));
            cbPanSup.getItems().add(modeloAux.getPan(i));
        }

        for (int i = 0; i < modeloAux.cantidadCarnes(); i++) {
            cbCarne.getItems().add(modeloAux.getcarne(i));
        }
        for (int i = 0; i < modeloAux.cantidadIngredientes(); i++) {
            cbIng1.getItems().add(modeloAux.getingrediente(i));
            cbIng2.getItems().add(modeloAux.getingrediente(i));
        }
        cbBebida.getItems().addAll(Bebida.getBebidas());
    }

    @FXML
    protected void onFinalizarPedidoClick() {
        // Validamos que no haya campos vacíos
        if (txtNombre.getText().isEmpty() || cbBebida.getSelectionModel().isEmpty()) {
            txtRecibo.setText("Por favor, ingresa un nombre y selecciona una bebida.");
            return;
        }

        Comida hFinal = new Comida(
                txtNombre.getText(),
                cbTamanio.getValue(),
                cbPanSup.getValue(),
                cbIng1.getValue(),
                cbCarne.getValue(),
                cbIng2.getValue(),
                cbPanInf.getValue()
        );

        int indexBebida = cbBebida.getSelectionModel().getSelectedIndex() + 1;
        Bebida bFinal = new Bebida(
                Bebida.getNombre(indexBebida),
                Bebida.getPrecio(indexBebida),
                "Mediana",
                true
        );

        // Imprimimos el resultado en el TextArea
        String ticket = "------- RECIBO BURGER -------\n" +
                "NOMBRE HAMBURGUESA: " + hFinal.getNomhamburguesa() + "\n" +
                "TAMAÑO: " + hFinal.getTamanioH() + "\n" +
                "CARNE: " + hFinal.getTipocarne() + "\n" +
                "EXTRAS: " + hFinal.getIngredientes1() + " y " + hFinal.getIngredientes2() + "\n" +
                "PAN: " + hFinal.getPanbottom1() + " / " + hFinal.getPanTop() + "\n" +
                "-----------------------------\n" +
                "BEBIDA: " + bFinal.getNombreBebida() + " (" + bFinal.getPrecioBebida() + "€)\n" +
                "=============================";

        txtRecibo.setText(ticket);
    }
}