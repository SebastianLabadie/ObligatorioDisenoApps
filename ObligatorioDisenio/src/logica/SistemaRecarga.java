/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import Exceptions.NumeroNegativoException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rodri
 */
public class SistemaRecarga {
    private ArrayList<Recarga> recargas = new ArrayList<Recarga>();
    
    public void agregarRecarga(double monto,UsuarioPropietario usr) throws NumeroNegativoException{
        Validador.positivoDouble(monto);
        Recarga r = new Recarga(monto,usr);
        recargas.add(r);
        usr.agregarRecarga(r);
        Fachada.getInstancia().avisar(Fachada.eventos.cambioListaRecargas);
        
    }
    
    public ArrayList<Recarga> obtenerRecargasDeUsuario(UsuarioPropietario u){
         return u.getRecargas();
     }
    
    public ArrayList<Recarga> obtenerRecargasPendientes(){
        
        ArrayList<Recarga> recargasPendientes = new ArrayList<Recarga>();
        
        for(Recarga r:recargas){
            if(r.getEstado().equals(Recarga.EstadoRec.PENDIENTE))
                recargasPendientes.add(r);
        }
        return recargasPendientes;
        
    }
    
    public void aprobarRecarga(Recarga rec,UsuarioAdministrador admin){
        
        for(Recarga r:recargas){
            if(r.equals(rec)){
                r.setEstado(Recarga.EstadoRec.ACEPTADA);
                r.setAdmin(admin);
                
                UsuarioPropietario usr = r.getPropietario();
                
                usr.aceptarRecarga(r,admin);
                Fachada.getInstancia().avisar(Fachada.eventos.cambioListaRecargas);
                //Crear notificacion
                Notificacion notificacion = new Notificacion(new Date()+" Tu recarga de $" +rec.getMonto()+" fue aprobada.");
                usr.agregarNotificacion(notificacion);
                Fachada.getInstancia().avisar(Fachada.eventos.cambioListaNotificaciones);
            }
                
                
        }
    };
    
}
