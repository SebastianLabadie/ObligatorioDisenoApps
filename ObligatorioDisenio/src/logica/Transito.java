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
public class Transito {
    private Date fechaIngreso;
    private Puesto puesto;
    private Vehiculo vehiculo;
    private Tarifa tarifa;
    private int montoPagado;

    public Transito( Puesto puesto, Vehiculo vehiculo, Tarifa tarifa) {
        this.fechaIngreso = new Date();
        this.puesto = puesto;
        this.vehiculo = vehiculo;
        this.tarifa = tarifa;
        this.montoPagado =0;
    }
    
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public int getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(int montoPagado) {
        this.montoPagado = montoPagado;
    }
    
}
