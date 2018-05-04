package parcialpoo_2x2;

import java.util.ArrayList;
import java.util.Scanner;

public class Administrador1 {

    static void nuevaReservacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Administrador1(ArrayList<Piso> Pisos) {
        //   Habitaciones = new ArrayList<>();

        //  this.Habitaciones = Habitaciones;
    }

    public void add() {
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

    /*public void add(Habitacion habitacion) throws Exception {
        if (habitacion != null) {
            if (!Habitacion.contains(habitacion)) {
                Habitacion.add (habitacion);
            }
Exception e = new Exception("No se permiten datos duplicados");
            throw e;
        } else {
            throw new Exception("No se puede agregar un estudiante nulo");
        }
        
    }
    
    public void mostrar() {
        for ( Piso e : Pisos) {
            System.out.println(e.toString());
        }
    }
    
    public void eliminar(){
ArrayList<Piso>lista=new ArrayList<>();
//Metodo remove, Elimina elementos de nuestra lista mediante indice

lista.remove(Piso.Identificador); 
//Elimino el elemento si es fila 1, 2 dependiendo de posicion
        System.out.println("Remove");
        System.out.println(lista.toString());
    }
    
   
   
     public void cancelar(){
         
     }
     public void modificar(){
         
     }
     
    public void habilitar(){
        System.out.println("La habitacion esta habilitada");
        
    }
    public void deshabilitar(){
        System.out.println("La habitacion esta deshabilitada");
        
    }
   
    
      */  
    }
