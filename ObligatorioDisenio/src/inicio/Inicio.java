/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicio;

import iuEscritorio.MenuAplicacion;

/**
 *
 * @author sebastianlb
 */
public class Inicio {
    public static void main(String[] args) {
         DatosPrueba.cargar();
        //DatosPrueba.probar();
        new MenuAplicacion().setVisible(true);
    }
}
