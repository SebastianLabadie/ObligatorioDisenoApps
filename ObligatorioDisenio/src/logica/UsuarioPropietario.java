/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class UsuarioPropietario extends Usuario{
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Recarga> recargas;
    private int saldo;
    

    public UsuarioPropietario(String cedula, String nombreCompleto, String password,int saldo) {
        super(cedula, nombreCompleto, password);
        this.saldo = saldo;
        this.vehiculos = new ArrayList<>();
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public int getSaldo() {
        return saldo;
    }

    public ArrayList<Recarga> getRecargas() {
        return recargas;
    }
    
    public void asociarVehiculo(Vehiculo v){
        vehiculos.add(v);
    }
 
    
}
