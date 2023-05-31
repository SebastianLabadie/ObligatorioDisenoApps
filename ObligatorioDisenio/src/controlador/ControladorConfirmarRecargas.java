/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import logica.Fachada;
import logica.Recarga;
import logica.UsuarioPropietario;

/**
 *
 * @author rodri
 */
public class ControladorConfirmarRecargas {
    private VistaConfirmarRecargas vista;

    public ControladorConfirmarRecargas(VistaConfirmarRecargas vista) {
        this.vista = vista;
    }
    
    public void ObtenerRecargasPendientes(){
        ArrayList<Recarga> recargas = Fachada.getInstancia().obtenerRecargasPendientes();
        vista.ObtenerRecargasPendientes(recargas);
    
    }
    
    public void AceptarRecarga(Recarga rec,UsuarioPropietario admin){
        vista.AceptarRecarga(rec, admin);
    }
    
//    public void cargarRecargas(){
//         ArrayList<Recarga> puestos = Fachada.getInstancia().obtenerPuestos();
//         vista.cargarPuestos(puestos);
//    }

    
    
}
