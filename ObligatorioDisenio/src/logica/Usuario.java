/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author PC
 */
public abstract class Usuario {
    private String cedula;
    private String nombreCompleto;
    private String password;

    public Usuario(String cedula, String nombreCompleto, String password) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.password = password;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object otroUSuario) {
        Usuario u = (Usuario)otroUSuario;
        return this.cedula.equals(u.getCedula());
    }
    
    
    
}
