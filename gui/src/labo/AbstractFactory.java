/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo;

import labo.Aritmetica.Aritmetica;
import labo.Aritmetica.OperacionesTipo;

/**
 *
 * @author UCA
 */
public interface AbstractFactory {
    
   Aritmetica getAritmetica(OperacionesTipo type);
   
}
