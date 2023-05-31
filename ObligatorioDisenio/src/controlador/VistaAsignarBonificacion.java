/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import logica.Bonificacion;
import logica.BonificacionAsignada;
import logica.Puesto;
import logica.UsuarioPropietario;

/**
 *
 * @author sebastianlb
 */
public interface VistaAsignarBonificacion {
    public void cargarBonificaciones(ArrayList<Bonificacion> bonificaciones);
    public void cargarPuestos(ArrayList<Puesto> puestos);
    public void mostrarDatosPropietario(UsuarioPropietario usuario, ArrayList<BonificacionAsignada> bonificacionesAsigndas);
    public void error(String message);
    public void exito(String message);
}
