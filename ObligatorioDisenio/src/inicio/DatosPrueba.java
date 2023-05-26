/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicio;

import Exceptions.DuplicadoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Fachada;
import logica.UsuarioAdministrador;
import logica.UsuarioPropietario;
import logica.Vehiculo;

/**
 *
 * @author sebastianlb
 */
public class DatosPrueba {
    private static Fachada fachada = Fachada.getInstancia();
    
    public static void cargar(){
        //CARGA DE USUARIOS
        UsuarioAdministrador admin1 = fachada.agregarUsuarioAdministrador("a", "a", "Admin1");
        UsuarioAdministrador admin2 =  fachada.agregarUsuarioAdministrador("b", "b", "Admin2");
            
        UsuarioPropietario propietario1 = fachada.agregarUsuarioPropietario("c", "c", "Propietario1",100);
        UsuarioPropietario propietario2 = fachada.agregarUsuarioPropietario("d", "d", "Propietario2",2000);
        
        try {
            //CARGA DE VEHICULOS
            Vehiculo v1 = fachada.agregarVehiculo("MAT01", "ROJO", "MOD1");
            Vehiculo v2 = fachada.agregarVehiculo("MAT02", "ROJO", "MOD1");
            Vehiculo v3 = fachada.agregarVehiculo("MAT03", "ROJO", "MOD1");
            Vehiculo v4 = fachada.agregarVehiculo("MAT04", "ROJO", "MOD1");
            
            propietario1.asociarVehiculo(v1);
            propietario2.asociarVehiculo(v2);
            
        } catch (DuplicadoException ex) {
            Logger.getLogger(DatosPrueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
