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
public class SistemaAcceso {
    
    private ArrayList<UsuarioPropietario> usuariosAgenda = new ArrayList();
    private ArrayList<UsuarioAdministrador> usuariosAdministradores = new ArrayList();
    private ArrayList<Conexion> conexiones = new ArrayList();
    
    public void agreagarUsuarioPropietario(String cedula,String pwd,String nc){
        usuariosAgenda.add(new UsuarioPropietario(cedula, nc, pwd));
    }
    public void agreagarUsuarioAdministrador(String cedula,String pwd,String nc){
        usuariosAdministradores.add(new UsuarioAdministrador(cedula, nc, pwd));
    }
    public UsuarioPropietario loginPropietario(String cedula,String pwd){
        Usuario u = login(cedula,pwd,usuariosAgenda);
        return (UsuarioPropietario)u;
    }
    
    public Conexion loginAdministrador(String cedula,String pwd){
        Usuario u = login(cedula,pwd,usuariosAdministradores);
        Conexion c = null;
        if(!administradorYaConectado(u)){
            c = new Conexion((UsuarioAdministrador)u);
            conexiones.add(c);
//            Fachada.getInstancia().avisar(Fachada.eventos.cambioListaConexiones);
        }
        return c;
    }
    private Usuario login(String cedula,String pwd,ArrayList usuarios){
        Usuario u;
        for(Object o:usuarios){
            u = (Usuario)o;
            if(u.getCedula().equals(cedula) && u.getPassword().equals(pwd)){
                return u;
            }
        }
        return null;
    } 
    
    public boolean administradorYaConectado(Usuario u){
        if (u==null)  return true;
        
        for (Conexion c: conexiones) {
            if (c.getUsuario().getCedula().equals(u.getCedula())) {
                return true;
            }
        }
        
        return false;
    }

    public ArrayList<Conexion> getConexiones() {
        return conexiones;
    }
    public void logout(Conexion c){
        conexiones.remove(c);
//        Fachada.getInstancia().avisar(Fachada.eventos.cambioListaConexiones);
    }
}
