/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import logica.Recarga;
import logica.UsuarioAdministrador;
import logica.UsuarioPropietario;

/**
 *
 * @author rodri
 */
public interface VistaConfirmarRecargas {
    public void ObtenerRecargasPendientes(ArrayList<Recarga> rec);
    public void AceptarRecarga(Recarga rec,UsuarioAdministrador admin);
    public void error(String message);
    public void exito(String message);
    
}
