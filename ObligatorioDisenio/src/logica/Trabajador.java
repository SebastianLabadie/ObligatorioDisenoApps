/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Calendar;

/**
 *
 * @author sebastianlb
 */
public class Trabajador extends Bonificacion{

    public Trabajador(String nombre) {
        super(nombre);
    }

    @Override
    public int getDescuento(int cantidadTransitos) {
        if(esDiaDeSemana()) return 80;
        
        return 0;
    }
    
     public boolean esDiaDeSemana(){
        Calendar calendar = Calendar.getInstance();

        int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);

        if (diaSemana >= Calendar.MONDAY && diaSemana <= Calendar.FRIDAY) {
            return true;
        } else {
           return false;
        }
    }
    
}
