/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import Exceptions.NumeroNegativoException;

/**
 *
 * @author rodri
 */
public class Validador {
    public static double positivoDouble(double valor) throws NumeroNegativoException{
        if(valor < 1) throw new NumeroNegativoException();
        return valor;
    }
    
     public static int positivoInt(int valor)throws NumeroNegativoException{
         if(valor < 1) throw new NumeroNegativoException();
        return valor;
    }
     
}
