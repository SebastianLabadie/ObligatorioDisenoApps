/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author sebastianlb
 */
public class Vehiculo {
    private String matricula;
    private String color;
    private String modelo;
    private CategoriaVehiculo categoria;
    private UsuarioPropietario propietario;

    public Vehiculo(String matricula, String color, String modelo,CategoriaVehiculo cat) {
        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
        this.categoria = cat;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    public CategoriaVehiculo getCategoria() {
        return categoria;
    }
    

    public UsuarioPropietario getPropietario() {
        return propietario;
    }
    
    
    
    public void asignarPropietario(UsuarioPropietario u){
        this.propietario = u;
    }
    
    
    
}
