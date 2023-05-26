/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iuEscritorio;

import Exceptions.LoginException;
import java.awt.Frame;
import logica.Conexion;
import logica.Fachada;
import logica.UsuarioPropietario;

/**
 *
 * @author PC
 */
public class LoginPropietario extends LoginAbstracto{

    public LoginPropietario(Frame parent, boolean modal) {
        super(parent, modal, "LOGIN PROPIETARIO");
    }

    
    @Override
    public Object llamarLogin(String cedula, String pass) throws LoginException {
        return Fachada.getInstancia().loginPropietario(cedula, pass);
    }

    @Override
    public void mostrarProximoCasoUso(Object obj) {
        new TableroDeControl((UsuarioPropietario)obj).setVisible(true);
    }
    
}
