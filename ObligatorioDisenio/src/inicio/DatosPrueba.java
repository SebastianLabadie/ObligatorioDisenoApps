/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicio;

import Exceptions.BonificacionAsignadaException;
import Exceptions.DuplicadoException;
import Exceptions.NumeroNegativoException;
import Exceptions.TransitoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.CategoriaVehiculo;
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
    
    public static void cargar() {
        //CARGA DE USUARIOS
        UsuarioAdministrador admin1 = fachada.agregarUsuarioAdministrador("a", "a", "Admin1");
        UsuarioAdministrador admin2 =  fachada.agregarUsuarioAdministrador("b", "b", "Admin2");
            
        UsuarioPropietario propietario1 = fachada.agregarUsuarioPropietario("c", "c", "Propietario1",600.00);
        UsuarioPropietario propietario2 = fachada.agregarUsuarioPropietario("d", "d", "Propietario2",50.00);
        
        try {
            //CARGA DE CATEGORIAS DE VEHICULOS
           fachada.agregarCategoriaVehiculo("Auto");
           fachada.agregarCategoriaVehiculo("Moto");
           fachada.agregarCategoriaVehiculo("Camion");
           
            
            //CARGA DE VEHICULOS
            Vehiculo v1 = fachada.agregarVehiculo("MAT01", "ROJO", "MOD1",fachada.obtenerCategoriasVehiculos().get(0));
            Vehiculo v2 = fachada.agregarVehiculo("MAT02", "ROJO", "MOD1",fachada.obtenerCategoriasVehiculos().get(1));
            Vehiculo v3 = fachada.agregarVehiculo("MAT03", "ROJO", "MOD1",fachada.obtenerCategoriasVehiculos().get(2));
            Vehiculo v4 = fachada.agregarVehiculo("MAT04", "ROJO", "MOD1",fachada.obtenerCategoriasVehiculos().get(0));
            Vehiculo v5 = fachada.agregarVehiculo("MAT05", "ROJO", "MOD1",fachada.obtenerCategoriasVehiculos().get(1));
            Vehiculo v6 = fachada.agregarVehiculo("MAT05", "ROJO", "MOD1",fachada.obtenerCategoriasVehiculos().get(2));
            
            propietario1.asociarVehiculo(v1);
            propietario1.asociarVehiculo(v2);
            propietario1.asociarVehiculo(v3);
            propietario2.asociarVehiculo(v4);
            propietario2.asociarVehiculo(v5);
            propietario2.asociarVehiculo(v6);
            v1.asignarPropietario(propietario1);
            v2.asignarPropietario(propietario1);
            v3.asignarPropietario(propietario1);
            v4.asignarPropietario(propietario2);
            v5.asignarPropietario(propietario2);
            v6.asignarPropietario(propietario2);
            
            
            //CARGA DE TARIFAS
            fachada.agregarTarifa(100,"Tarifa autos", fachada.obtenerCategoriasVehiculos().get(0));
            fachada.agregarTarifa(300,"Tarifa autos2",fachada.obtenerCategoriasVehiculos().get(0));
            fachada.agregarTarifa(200,"Tarifa motos", fachada.obtenerCategoriasVehiculos().get(1));
            fachada.agregarTarifa(300,"Tarifa camiones", fachada.obtenerCategoriasVehiculos().get(2));
            
            //CARGA DE PUESTOS
            fachada.agregarPuesto("Puesto 1", "direccion");
            fachada.agregarPuesto("Puesto 2", "direccion");
            fachada.agregarPuesto("Puesto 3", "direccion");
            
            //ASIGNACION DE TARIFAS A PUESTOS
            fachada.obtenerPuestos().get(0).agregarTarifa(fachada.obtenerTarifas().get(0));
            fachada.obtenerPuestos().get(0).agregarTarifa(fachada.obtenerTarifas().get(2));
            fachada.obtenerPuestos().get(0).agregarTarifa(fachada.obtenerTarifas().get(3));
            
            fachada.obtenerPuestos().get(1).agregarTarifa(fachada.obtenerTarifas().get(1));
            fachada.obtenerPuestos().get(1).agregarTarifa(fachada.obtenerTarifas().get(2));
            fachada.obtenerPuestos().get(1).agregarTarifa(fachada.obtenerTarifas().get(3));
            
          
            
            //CARGA DE BONIFICACIONES
            fachada.agregarBonificacion("Exonerado 1");
            fachada.agregarBonificacion("Exonerado 2");
            fachada.agregarBonificacion("Trabajador 1");
            fachada.agregarBonificacion("Trabajador 2");
            fachada.agregarBonificacion("Frecuente 1");
            fachada.agregarBonificacion("Frecuente 2");
            
            
            //ASIGNAR BONIFICACIONES
            fachada.crearBonificacionAsignada(fachada.obtenerPuestos().get(0), fachada.obtenerBonificaciones().get(4), propietario1);
            
            fachada.crearBonificacionAsignada(fachada.obtenerPuestos().get(1), fachada.obtenerBonificaciones().get(5), propietario1);
            
            fachada.crearBonificacionAsignada(fachada.obtenerPuestos().get(1), fachada.obtenerBonificaciones().get(4), propietario2);
            fachada.crearBonificacionAsignada(fachada.obtenerPuestos().get(1), fachada.obtenerBonificaciones().get(0), propietario2);
            
            //AGREGAR TRANSITO PRUEBA
            fachada.agregarTransito(fachada.obtenerPuestos().get(0), v1, fachada.obtenerTarifas().get(0),propietario1.obtenerBonificacionesAsignadas().get(0));
            
            //Recargas
            fachada.agregarRecarga(100, propietario2);
            fachada.agregarRecarga(300, propietario1);
            fachada.agregarRecarga(300, propietario1);
            fachada.agregarRecarga(1000, propietario2);
            
        }
        catch (DuplicadoException ex) {
            Logger.getLogger(DatosPrueba.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransitoException ex) {
            Logger.getLogger(DatosPrueba.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BonificacionAsignadaException ex) {
            Logger.getLogger(DatosPrueba.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumeroNegativoException ex) {
            Logger.getLogger(DatosPrueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
