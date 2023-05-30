/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import logica.BonificacionAsignada;
import logica.Fachada;
import logica.Recarga;
import logica.Transito;
import logica.UsuarioPropietario;
import observador.Observable;
import observador.Observador;

/**
 *
 * @author sebastianlb
 */
public class ControladorTableroDeControl implements Observador {
    private UsuarioPropietario usuario;
    private Recarga recarga;
    private ArrayList<Transito> transitos;
    private ArrayList<Recarga> recargas;
    private ArrayList<BonificacionAsignada> bonificaciones;
    private VistaTableroDeControl vista;

    public ControladorTableroDeControl(UsuarioPropietario usuario,VistaTableroDeControl vista) {
        this.usuario = usuario;
        this.vista = vista;
        Fachada.getInstancia().agregarObservador(this);
        cargarDatos();
        remplazarLabels();
        mostrarVehiculos();
        mostrarRecargas();
        mostrarTransitos();
        mostrarBonificacionesAsignadas();
    }
    
    public void cargarDatos()
    {
        this.transitos = Fachada.getInstancia().obtenerTransitosDeUsuario(this.usuario);
        this.recargas = Fachada.getInstancia().obtenerRecargasDeUsuario(this.usuario);
        this.bonificaciones = this.usuario.obtenerBonificaciones();
    }
    
    public void remplazarLabels(){
        vista.remplazarLabels(usuario, transitos, bonificaciones,recargas);   
    }
    
    public void mostrarVehiculos(){
        vista.mostrarVehiculos(usuario.getVehiculos());
    }
    
    public void mostrarTransitos(){
        vista.mostrarTransitos(transitos);
    }
    
     public void mostrarRecargas(){
        vista.mostrarRecargas(recargas);
    }
     
      public void mostrarBonificacionesAsignadas(){
        vista.mostrarBonificacionesAsignadas(bonificaciones);
    }
    
    
    
    @Override
    public void actualizar(Object evento, Observable origen) {
        if(evento.equals(Fachada.eventos.cambioListaRecargas)){
            this.recargas = Fachada.getInstancia().obtenerRecargasDeUsuario(this.usuario);
            remplazarLabels();
            mostrarRecargas();
        }
        
    }
    
}
