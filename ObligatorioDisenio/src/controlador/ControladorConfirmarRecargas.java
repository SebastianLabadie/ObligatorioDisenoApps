/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import logica.Fachada;
import logica.Recarga;
import logica.UsuarioAdministrador;
import logica.UsuarioPropietario;
import observador.Observable;
import observador.Observador;

/**
 *
 * @author rodri
 */
public class ControladorConfirmarRecargas implements Observador {
    private VistaConfirmarRecargas vista;
    private ArrayList<Recarga> recargas;
    public ControladorConfirmarRecargas(VistaConfirmarRecargas vista) {
        this.vista = vista;
        Fachada.getInstancia().agregarObservador(this);
        ObtenerRecargasPendientes();
    }
    
    public void ObtenerRecargasPendientes(){
        ArrayList<Recarga> recargas = Fachada.getInstancia().obtenerRecargasPendientes();
        vista.ObtenerRecargasPendientes(recargas);
    
    }
    
    public void AceptarRecarga(Recarga rec,UsuarioAdministrador admin){
        Fachada.getInstancia().aprobarRecarga(rec, admin);
        vista.exito("Recarga Aprobada correctamente");
    }
    
//    public void cargarRecargas(){
//         ArrayList<Recarga> puestos = Fachada.getInstancia().obtenerPuestos();
//         vista.cargarPuestos(puestos);
//    }

    @Override
    public void actualizar(Object evento, Observable origen) {
        if(evento.equals(Fachada.eventos.cambioListaRecargas)){
            ObtenerRecargasPendientes();
            
        }
    }

    
    
}
