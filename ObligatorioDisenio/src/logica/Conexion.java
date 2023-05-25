/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Date;

/**
 *
 * @author PC
 */
public class Conexion {
    private UsuarioAdministrador usuario;
    private Date fecha = new Date();

    public Conexion(UsuarioAdministrador usuario) {
        this.usuario = usuario;
    }

    public UsuarioAdministrador getUsuario() {
        return usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    
    
}
