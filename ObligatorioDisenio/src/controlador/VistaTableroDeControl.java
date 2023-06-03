/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import logica.BonificacionAsignada;
import logica.Notificacion;
import logica.Recarga;
import logica.Transito;
import logica.UsuarioPropietario;
import logica.Vehiculo;

/**
 *
 * @author sebastianlb
 */
public interface VistaTableroDeControl {
    public void remplazarLabels(UsuarioPropietario u,ArrayList<Transito> t,ArrayList<BonificacionAsignada> b,ArrayList<Recarga> r,ArrayList<Notificacion> n);
    public void mostrarVehiculos(ArrayList<Vehiculo> vehiculos);
    public void mostrarTransitos(ArrayList<Transito> transitos);
    public void mostrarRecargas(ArrayList<Recarga> recargas);
    public void mostrarBonificacionesAsignadas(ArrayList<BonificacionAsignada> bonificaciones);
    public void mostrarNotificaciones(ArrayList<Notificacion> notificaciones);
}
