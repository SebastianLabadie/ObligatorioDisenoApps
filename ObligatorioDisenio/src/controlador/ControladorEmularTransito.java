/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Exceptions.NoExiste;
import Exceptions.TransitoException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logica.BonificacionAsignada;
import logica.Fachada;
import logica.Puesto;
import logica.Tarifa;
import logica.UsuarioPropietario;
import logica.Vehiculo;
import observador.Observable;
import observador.Observador;

/**
 *
 * @author sebastianlb
 */
public class ControladorEmularTransito{
    private VistaEmularTransito vista;
    
    public ControladorEmularTransito(VistaEmularTransito vista){
        this.vista = vista;
        cargarPuestos();
        cargarTarifasPuesto(Fachada.getInstancia().obtenerPuestos().get(0));
    }
    
    public void cargarPuestos(){
         ArrayList<Puesto> puestos = Fachada.getInstancia().obtenerPuestos();
         vista.cargarPuestos(puestos);
    }
    
    public void seleccionoPuesto(Puesto p){
        if (p==null)  vista.error("Debe seleccionar un puesto correcto");
        
        cargarTarifasPuesto(p);
    }
    
    public void cargarTarifasPuesto(Puesto p){
         vista.cargarTarifasPuesto(p.getTarifas());
    }
    
    public void crearTransito(Puesto p,String matricula){
        try {
             Vehiculo v = Fachada.getInstancia().obtenerVehiculoByMatricula(matricula);
            
             //buscar tarifa de categoria del vehiculo
            Tarifa tarifa = null;
            for (Tarifa t : p.getTarifas()) {
                if (t.getCategoria().equals(v.getCategoria())) tarifa = t;
            }

            //buscar si el usuario tiene bonificaciones en el puesto seleccionado
             UsuarioPropietario u = v.getPropietario();
             BonificacionAsignada bonificacion=null;
             for (BonificacionAsignada ba : u.obtenerBonificacionesAsignadas()) {
                 if (ba.getPuesto().equals(p))  bonificacion=ba;
            }
             
            


            Fachada.getInstancia().agregarTransito(p, v, tarifa, bonificacion);
            vista.exito("Transito agregado con exito");
        } catch (NoExiste ex) {
            vista.error(ex.getMessage());
        } catch (TransitoException ex) {
            vista.error(ex.getMessage());
        }
    }

    
    
}
