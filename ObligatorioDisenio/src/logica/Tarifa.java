/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author sebastianlb
 */
public class Tarifa {
    private int monto;
    private String nombre;
    private CategoriaVehiculo categoria;

    public Tarifa(int monto, String nombre, CategoriaVehiculo categoria) {
        this.monto = monto;
        this.nombre = nombre;
        this.categoria = categoria;
    }

   

    public int getMonto() {
        return monto;
    }

    public String getNombre() {
        return nombre;
    }
    

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public CategoriaVehiculo getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaVehiculo categoria) {
        this.categoria = categoria;
    }
    
    
    
}
