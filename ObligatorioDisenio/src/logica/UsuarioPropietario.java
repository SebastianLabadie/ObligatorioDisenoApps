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
    private ArrayList<BonificacionAsignada> bonificaciones;
    private int saldo;
    

    public UsuarioPropietario(String cedula, String nombreCompleto, String password,int saldo) {
        super(cedula, nombreCompleto, password);
        this.saldo = saldo;
        this.vehiculos = new ArrayList<>();
        this.recargas = new ArrayList<>();
        this.bonificaciones = new ArrayList<>();
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void agregarRecarga(Recarga rec){
        recargas.add(rec);
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
    
    public void agregarBonificacion(BonificacionAsignada b){
        bonificaciones.add(b);
    }
    
    public ArrayList<BonificacionAsignada> obtenerBonificaciones(){
        return bonificaciones;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}
