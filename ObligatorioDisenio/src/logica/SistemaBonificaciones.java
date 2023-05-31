/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import Exceptions.BonificacionAsignadaException;
import java.util.ArrayList;

/**
 *
 * @author sebastianlb
 */
public class SistemaBonificaciones {
    private ArrayList<Bonificacion> bonificaciones = new ArrayList<>();


    
    
    public void agregarBonificacion(String nombre){
        Bonificacion b = obtenerTipoBonificacion(nombre);
        
        bonificaciones.add(b);
    }
    
    private Bonificacion obtenerTipoBonificacion(String nombre){
        if(nombre.contains("Exonerado")) return new Exonerado(nombre);
        if(nombre.contains("Frecuente")) return new Frecuente(nombre);
        if(nombre.contains("Trabajador")) return new Trabajador(nombre);
        
        return null;
    }
    
    public ArrayList<Bonificacion> obtenerBonificaciones(){
        return bonificaciones;
    }
    
    public void crearBonificacionAsignada(Puesto p,Bonificacion b, UsuarioPropietario u) throws BonificacionAsignadaException{
        if(p ==null) throw new BonificacionAsignadaException("Debe especificar un puesto");
        if(b ==null) throw new BonificacionAsignadaException("Debe especificar una bonificación");
        
        //validar que usuario no tenga una bonificacion para ese mismo puesto ya asignada
        
        BonificacionAsignada ba = new BonificacionAsignada(b, p);
        u.agregarBonificacion(ba);
    }
    
}
