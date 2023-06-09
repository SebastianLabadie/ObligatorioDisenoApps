/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import logica.Transito;

/**
 *
 * @author sebastianlb
 */
public class ControladorTransitoExitoso {
    
    private VistaTransitoExitoso vista;
    private Transito transito;

    public ControladorTransitoExitoso(VistaTransitoExitoso vista, Transito transito) {
        this.vista = vista;
        this.transito = transito;
        cargarDatos();
    }
    
    private void cargarDatos(){
        vista.cargarDatosTransito(transito);
    }
    
}
