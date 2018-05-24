/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo.Aritmetica;

import labo.AbstractFactory;

/**
 *
 * @author UCA
 */
public class FactoryAritmetica implements AbstractFactory{

    @Override
    public Aritmetica getAritmetica(OperacionesTipo type) {
        switch(type){
            case Suma:
                return new Suma();
            case Resta:
                return new Resta();
                
        
        }
        return null;
    }
    
 
}
