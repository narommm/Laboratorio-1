/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import labo.Aritmetica.Aritmetica;
import labo.Aritmetica.FactoryAritmetica;
import labo.Aritmetica.OperacionesTipo;
import labo.Aritmetica.Suma;
import labo.laboj;

/**
 *
 * @author UCA
 */
public class Gui{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new laboj().setVisible(true);
   
        FactoryAritmetica factory= new FactoryAritmetica();
        Aritmetica suma = factory.getAritmetica(OperacionesTipo.Resta);
        
        System.out.println(suma.operacion(12, 12));
    }
    
}
