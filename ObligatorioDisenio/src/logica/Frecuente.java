/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author sebastianlb
 */
public class Frecuente extends Bonificacion{

    public Frecuente(String nombre) {
        super(nombre);
    }

    @Override
    public int getDescuento() {
        return 50;
    }
    
}
