/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Exceptions.AccesoException;
import Exceptions.BonificacionAsignadaException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Bonificacion;
import logica.BonificacionAsignada;
import logica.Fachada;
import logica.Puesto;
import logica.UsuarioPropietario;

/**
 *
 * @author sebastianlb
 */
public class ControladorAsignarBonificacion {
   public VistaAsignarBonificacion vista;
   private Fachada fachada;

    public ControladorAsignarBonificacion(VistaAsignarBonificacion vista) {
        this.vista = vista;
        this.fachada = Fachada.getInstancia();
        cargarBonificaciones();
        cargarPuestos();
    }
   
    
    public void cargarBonificaciones(){
        ArrayList<Bonificacion> bonificaciones = fachada.obtenerBonificaciones();
        vista.cargarBonificaciones(bonificaciones);
    }
   
    public void cargarPuestos(){
         ArrayList<Puesto> puestos = fachada.obtenerPuestos();
        vista.cargarPuestos(puestos);
    }
   
    public void buscarPropietario(String cedula){
       try {
           UsuarioPropietario u = fachada.obtenerPropietarioPorCedula(cedula);
           ArrayList<BonificacionAsignada> ba = u.obtenerBonificacionesAsignadas();
           vista.mostrarDatosPropietario(u, ba);
       } catch (AccesoException ex) {
           vista.error(ex.getMessage());
       }
    }
    
    public void asignarBonificacion(Bonificacion b,Puesto p,String cedula){
       try {
           UsuarioPropietario u = fachada.obtenerPropietarioPorCedula(cedula);
           fachada.crearBonificacionAsignada(p, b, u);
       } catch (AccesoException ex) {
            vista.error(ex.getMessage());
       } catch (BonificacionAsignadaException ex) {
           vista.error(ex.getMessage());
       }
    }
    
}
