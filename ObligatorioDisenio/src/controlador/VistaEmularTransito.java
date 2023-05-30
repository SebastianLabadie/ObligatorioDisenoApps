/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import logica.Puesto;
import logica.Tarifa;

/**
 *
 * @author sebastianlb
 */
public interface VistaEmularTransito {
    
    public void cargarPuestos(ArrayList<Puesto> puestos);
    public void cargarTarifasPuesto(ArrayList<Tarifa> tarifas);
    public void error(String message);
    public void exito(String message);
    
}
