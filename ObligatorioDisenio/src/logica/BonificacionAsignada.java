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
public class BonificacionAsignada {
    private Bonificacion bonificacion;
    private Puesto puesto;
    private Date fechaAsignada;

    public BonificacionAsignada(Bonificacion bonificacion, Puesto puesto) {
        this.bonificacion = bonificacion;
        this.puesto = puesto;
        this.fechaAsignada = new Date();
    }

    public Bonificacion getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(Bonificacion bonificacion) {
        this.bonificacion = bonificacion;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public Date getFechaAsignada() {
        return fechaAsignada;
    }

    public void setFechaAsignada(Date fechaAsignada) {
        this.fechaAsignada = fechaAsignada;
    }
    
    
    
    
}
