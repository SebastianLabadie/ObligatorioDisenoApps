/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import Exceptions.AccesoException;
import Exceptions.LoginException;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class SistemaAcceso {
    
    private ArrayList<UsuarioPropietario> usuariosPropietarios = new ArrayList();
    private ArrayList<UsuarioAdministrador> usuariosAdministradores = new ArrayList();
    private ArrayList<Conexion> conexiones = new ArrayList();
    
    public UsuarioPropietario agregarUsuarioPropietario(String cedula,String pwd,String nc,double saldo){
        UsuarioPropietario u = new UsuarioPropietario(cedula, nc, pwd,saldo);
        usuariosPropietarios.add(u);
        return u;
    }
    
    public UsuarioAdministrador agregarUsuarioAdministrador(String cedula,String pwd,String nc){
        UsuarioAdministrador u = new UsuarioAdministrador(cedula, nc, pwd);
        usuariosAdministradores.add(u);
        return u;
    }
    public UsuarioPropietario loginPropietario(String cedula,String pwd) throws LoginException{
        Usuario u = login(cedula,pwd,usuariosPropietarios);
        return (UsuarioPropietario)u;
    }
    
    public Conexion loginAdministrador(String cedula,String pwd) throws LoginException{
        Usuario u = login(cedula,pwd,usuariosAdministradores);
        administradorYaConectado(u);
        Conexion c = new Conexion((UsuarioAdministrador)u);
        conexiones.add(c);
//            Fachada.getInstancia().avisar(Fachada.eventos.cambioListaConexiones);
        return c;
    }
    
    
    private Usuario login(String cedula,String pwd,ArrayList usuarios) throws LoginException{
        Usuario u;
        for(Object o:usuarios){
            u = (Usuario)o;
            if(u.getCedula().equals(cedula) && u.getPassword().equals(pwd)){
                return u;
            }
        }
        throw new LoginException("Acceso denegado");
    } 
    
    private void administradorYaConectado(Usuario u) throws LoginException{
        for (Conexion c: conexiones) {
            if (c.getUsuario().getCedula().equals(u.getCedula())) {
               throw new LoginException("Ud. Ya está logueado");
            }
        }
    }

    public ArrayList<Conexion> getConexiones() {
        return conexiones;
    }
    public void logout(Conexion c){
        conexiones.remove(c);
//        Fachada.getInstancia().avisar(Fachada.eventos.cambioListaConexiones);
    }
    
    
    public UsuarioPropietario obtenerPropietarioPorCedula(String cedula) throws AccesoException{
        for(UsuarioPropietario u:usuariosPropietarios){
            if(u.getCedula().equals(cedula)){
                return u;
            }
        }
        
        throw new AccesoException("No existe el propietario");
    }
}
