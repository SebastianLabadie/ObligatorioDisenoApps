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
    private ArrayList<BonificacionAsignada> bonificacionesAsignadas;
    private ArrayList<Notificacion> notificaciones;
    private double saldo;
    

    public UsuarioPropietario(String cedula, String nombreCompleto, String password,double saldo) {
        super(cedula, nombreCompleto, password);
        this.saldo = saldo;
        this.vehiculos = new ArrayList<>();
        this.recargas = new ArrayList<>();
        this.bonificacionesAsignadas = new ArrayList<>();
        this.notificaciones = new ArrayList<>();
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void agregarRecarga(Recarga rec){
        recargas.add(rec);
    }
    
    public double getSaldo() {
        return saldo;
    }

    public ArrayList<Recarga> getRecargas() {
        return recargas;
    }

    public ArrayList<Notificacion> getNotificaciones() {
        return notificaciones;
    }
    
    public void agregarNotificacion(Notificacion n){
        notificaciones.add(n);
    }
    
    public void eliminarNotificaciones(){
        notificaciones.clear();
    }
    
    public void asociarVehiculo(Vehiculo v){
        vehiculos.add(v);
    }
    
    public void agregarBonificacionAsignada(BonificacionAsignada b){
        bonificacionesAsignadas.add(b);
    }
    
    public ArrayList<BonificacionAsignada> obtenerBonificacionesAsignadas(){
        return bonificacionesAsignadas;
    }
    
    public boolean bonificacionYaAsignada(Bonificacion b,Puesto p){
        for (BonificacionAsignada ba : bonificacionesAsignadas) {
            if (ba.getBonificacion().equals(b) && ba.getPuesto().equals(p)) return true;
        }
        
        return false;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void aceptarRecarga(Recarga recarga,UsuarioAdministrador admin){
        for(Recarga r:recargas){
            if(r.equals(recarga))
                r.setEstado(Recarga.EstadoRec.ACEPTADA); 
                setSaldo(this.saldo+r.getMonto());
                r.setAdmin(admin);
        }
    }
    
    

}
