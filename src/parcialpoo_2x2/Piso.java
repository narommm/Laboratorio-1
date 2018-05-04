/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo_2x2;

import java.util.ArrayList;
import java.util.Scanner;


public class Piso {
    public ArrayList<Habitacion> Habitaciones;

    public Piso(ArrayList<Habitacion> Habitaciones) {
        Habitaciones = new ArrayList<>();
        
        this.Habitaciones = Habitaciones;
    }
    
    public void add(){
        Habitacion habitacion = new Habitacion();
        
        habitacion.add(habitacion);
       
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese tipo de habitacion");
        System.out.print(": ");
        habitacion.setTipo(leer.nextLine());
       
        System.out.println("Ingrese precio");
        System.out.print(": ");
        habitacion.setPrecio(leer.nextFloat());
        
        System.out.println("Ingrese el estado");
        System.out.print(": ");
        habitacion.setEstado(leer.nextInt(0));
    }
    
    public void add(Habitacion habitacion) throws Exception{
        if(habitacion != null) {
            if (!Habitaciones.contains(habitacion)) {
                Habitaciones.add(habitacion);
            }
            Exception e = new Exception("No se permiten datos duplicados");
            throw e;
        } else {
            throw new Exception("No se puede agregar una habitacion nula");
        }
        
    }
    
    public void mostrar() {
        for ( Habitacion e : Habitaciones) {
            System.out.println(e.toString());
        }
    }
    
    
    
}
    
    
    
   
