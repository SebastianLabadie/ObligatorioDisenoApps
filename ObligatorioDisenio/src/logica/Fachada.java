/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import observador.Observable;

/**
 *
 * @author PC
 */
public class Fachada extends Observable{
    
    public enum eventos{cambioListaConexiones};
    
    private SistemaAcceso sAcceso = new SistemaAcceso();
//    private SistemaAgendas sAgendas = new SistemaAgendas();
    
    private static Fachada instancia = new Fachada();

    public static Fachada getInstancia() {
        return instancia;
    }
    

    private Fachada() {
    }

    public void agreagarUsuarioPropietario(String cedula, String pwd, String nc) {
        sAcceso.agreagarUsuarioPropietario(cedula, pwd, nc);
    }
    public void agreagarUsuarioAdministrador(String cedula, String pwd, String nc) {
        sAcceso.agreagarUsuarioAdministrador(cedula, pwd, nc);
    }

    public UsuarioPropietario loginPropietario(String cedula, String pwd) {
        return sAcceso.loginPropietario(cedula, pwd);
            
    }

    public Conexion loginAdministrador(String cedula, String pwd) {
        return sAcceso.loginAdministrador(cedula, pwd);
    }
    

//    public ArrayList<TipoContacto> getTiposContacto() {
//        return sAgendas.getTiposContacto();
//    }
//
//    public void agregarTipoContacto(String nombre) {
//        sAgendas.agregarTipoContacto(nombre);
//    }

    public ArrayList<Conexion> getConexiones() {
        return sAcceso.getConexiones();
    }

    public void logout(Conexion c) {
        sAcceso.logout(c);
    }
//
//    public ArrayList<TipoTelefono> getTiposTelefono() {
//        return sAgendas.getTiposTelefono();
//    }
//
//    public void agregarTipoTelefono(String nombre) {
//        sAgendas.agregarTipoTelefono(nombre);
//    }
//    
    
    
}
