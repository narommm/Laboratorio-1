/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import parcialpoo_2x2.Reserva;
/**
 * 
 * @author Gaby Salguero
 */

public class Cliente {
    //-- Atributos --
    private String dui, tarjCred, direccion;
    private Reserva fecha;
    public String nombre;
    public int numHabitacion;
    
   
    public Cliente(){}
    
    //-- Constructor --

    public Cliente(String dui, String tarjCred, String direccion, Reserva fecha, String nombre, int numHabitacion) {
        this.dui = dui;
        this.tarjCred = tarjCred;
        this.direccion = direccion;
        this.fecha = fecha;
        this.nombre = nombre;
        this.numHabitacion = numHabitacion;
    }
    
    
    // -- Metodos --

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getTarjCred() {
        return tarjCred;
    }

    public void setTarjCred(String tarjCred) {
        this.tarjCred = tarjCred;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Reserva getFecha() {
        return fecha;
    }

    public void setFecha(Reserva fecha) {
        Reserva reserva = new Reserva();
        
        while (true){
           reserva.Registrarentrada(numHabitacion, numHabitacion, numHabitacion);
           break;
        }
        
        reserva.Registrarsalida(numHabitacion, numHabitacion, numHabitacion);
        reserva.det_estacion(numHabitacion);
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }
}
