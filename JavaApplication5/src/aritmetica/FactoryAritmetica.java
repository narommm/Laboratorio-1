/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

import binario.Conversor;
import factory.AbstractFactory;

/**
 *
 * @author UCA
 */
public class FactoryAritmetica implements AbstractFactory{
     @Override
     public Aritmetica getAritmetica(String type){
         
     }
     
     @Override
     public Conversor getConversor(){
         return null;
     }
    
}
