/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import Exceptions.DuplicadoException;
import java.util.ArrayList;

/**
 *
 * @author sebastianlb
 */
public class SistemaTransito {
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    
    public Vehiculo agregarVehiculo(String matricula, String color, String modelo) throws DuplicadoException{
        //validar que vehiculo no este creado
        validarVehiculo(matricula);
        Vehiculo v = new Vehiculo(matricula, color, modelo);
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
    
}
