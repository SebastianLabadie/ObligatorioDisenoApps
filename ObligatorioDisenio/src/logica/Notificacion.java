/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Date;

/**
 *
 * @author sebastianlb
 */
public class Notificacion {
    private Date fecha;
    private String mensaje;

    public Notificacion( String mensaje) {
        this.fecha = new Date();
        this.mensaje = mensaje;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getMensaje() {
        return mensaje;
    }
    
    
}
