/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import Exceptions.DuplicadoException;
import Exceptions.NumeroNegativoException;
import java.util.ArrayList;

/**
 *
 * @author sebastianlb
 */
public class SistemaTransito {
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private ArrayList<CategoriaVehiculo> categoriasVehiculos = new ArrayList<>();
    private ArrayList<Puesto> puestos = new ArrayList<>();
    private ArrayList<Tarifa> tarifas = new ArrayList<>();
    private ArrayList<Transito> transitos = new ArrayList<>();
    private ArrayList<Recarga> recargas = new ArrayList<>();
    
    
     
    public Vehiculo agregarVehiculo(String matricula, String color, String modelo,CategoriaVehiculo cat) throws DuplicadoException{
        //validar que vehiculo no este creado
        validarVehiculo(matricula);
        Vehiculo v = new Vehiculo(matricula, color, modelo,cat);
        vehiculos.add(v);
        return v;
    }
    
    private void validarVehiculo(String matricula) throws DuplicadoException{
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                throw new DuplicadoException("Vehiculo duplicado");
            }
        }
    }
    
    public void agregarCategoriaVehiculo(String nom){
        CategoriaVehiculo c = new CategoriaVehiculo(nom);
        categoriasVehiculos.add(c);
    }
    
    public void agregarTarifa(int monto,String nombre,CategoriaVehiculo cat){
        Tarifa t = new Tarifa(monto,nombre, cat);
        tarifas.add(t);
    }
    
    public void agregarPuesto(String nom,String dir){
        Puesto p = new Puesto(nom, dir);
        puestos.add(p);
    }

    public void agregarTransito(Puesto puesto,Vehiculo vehiculo, Tarifa tarifa ){
        Transito t= new Transito(puesto, vehiculo, tarifa);
        transitos.add(t);
        
    }
    
    public void agregarRecarga(double monto,UsuarioPropietario usr) throws NumeroNegativoException{
        Validador.positivoDouble(monto);
        Recarga r = new Recarga(monto);
        recargas.add(r);
        usr.agregarRecarga(r);
        Fachada.getInstancia().avisar(Fachada.eventos.cambioListaRecargas);
        
    }
    
    
     public ArrayList<Transito> obtenerTransitosDeUsuario(UsuarioPropietario u){
         ArrayList<Transito> ret = new ArrayList<>();
         for (Transito t : transitos) {
             if (t.getVehiculo().getPropietario().equals(u)) {
                   ret.add(t);
             }
         }
         
         return ret;
     }
     
     public ArrayList<Recarga> obtenerRecargasDeUsuario(UsuarioPropietario u){

         return u.getRecargas();
     }

    public ArrayList<Recarga> getRecargas() {
        return recargas;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public ArrayList<CategoriaVehiculo> getCategoriasVehiculos() {
        return categoriasVehiculos;
    }

    public ArrayList<Puesto> getPuestos() {
        return puestos;
    }

    public ArrayList<Tarifa> getTarifas() {
        return tarifas;
    }
    
    
    
    
}
