/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controlador;

import logica.UsuarioPropietario;

/**
 *
 * @author rodri
 */
public interface VistaRecargarSaldo {
    public void recargarSaldo();
    public void cargarDatosUsuario(UsuarioPropietario usr);
    public void error(String message);
    public void exito(String message);
}
