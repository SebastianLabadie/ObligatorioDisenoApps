/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Exceptions.NumeroNegativoException;
import logica.Fachada;
import logica.UsuarioPropietario;
import observador.Observable;
import observador.Observador;

/**
 *
 * @author rodri
 */
public class ControladorRecargarSaldo implements Observador{
    private VistaRecargarSaldo vista;
    private UsuarioPropietario usr;

    public ControladorRecargarSaldo(VistaRecargarSaldo vista,UsuarioPropietario usr) {
        this.vista = vista;
        this.usr = usr;
        Fachada.getInstancia().agregarObservador(this);
        cargarDatosDelUsr();
    }
    
    public void cargarDatosDelUsr(){
        vista.cargarDatosUsuario(usr);
    }
    
    public void recargarSaldo(double monto){
       
      
        try {
            Fachada.getInstancia().agregarRecarga(monto,this.usr);
            vista.exito("Recarga creada correctamente.");
        } catch (NumeroNegativoException ex) {
            vista.error("Numero es menor o igual a 0.");
        }
    }
    
    @Override
    public void actualizar(Object evento, Observable origen) {
      if(evento.equals(Fachada.eventos.cambioListaRecargas)){
            cargarDatosDelUsr();
            
        }
    }
    
    
}
