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
    private String nombre;
    private String nombreCompleto;
    private String password;

    public Usuario(String nombre, String nombreCompleto, String password) {
        this.nombre = nombre;
        this.nombreCompleto = nombreCompleto;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getPassword() {
        return password;
    }
    
    
}
