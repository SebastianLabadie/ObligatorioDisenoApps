/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author sebastianlb
 */
public abstract class Bonificacion {
    private String nombre;

    public Bonificacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public abstract int getDescuento(int cantidadTransitos);

    @Override
    public String toString() {
        return  nombre ;
    }
    
    
    @Override
    public boolean equals(Object obj) {
        Bonificacion otraBonificacion = (Bonificacion)obj;
        
        return this.nombre.equals(otraBonificacion.getNombre());
    }
    
    
}
