/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author sebastianlb
 */
public class Puesto {
    private String nombre;
    private String direccion;
    private ArrayList<Tarifa> tarifas;

    public Puesto(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tarifas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Tarifa> getTarifas() {
        return tarifas;
    }
    
    
    
    public void agregarTarifa(Tarifa t){
        if(!tarifas.contains(t)){
            tarifas.add(t);
        }
    }
    
    
    
    
}
