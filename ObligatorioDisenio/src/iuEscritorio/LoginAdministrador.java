/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iuEscritorio;

import Exceptions.LoginException;
import java.awt.Frame;
import logica.Conexion;
import logica.Fachada;
import logica.UsuarioAdministrador;

/**
 *
 * @author PC
 */
public class LoginAdministrador extends LoginAbstracto{

    public LoginAdministrador(Frame parent, boolean modal) {
        super(parent, modal, "LOGIN ADMINISTRADOR");
    }

    
    @Override
    public Object llamarLogin(String cedula, String pass) throws LoginException  {
        return Fachada.getInstancia().loginAdministrador(cedula, pass);
    }

    @Override
    public void mostrarProximoCasoUso(Object obj) {
        new MenuAdministrador((UsuarioAdministrador)obj).setVisible(true);
    }
    
}
