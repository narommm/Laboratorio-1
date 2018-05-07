/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo_2x2;

import java.util.Scanner;

/**
 *
 * @author andreu
 */

public class Cliente {
    public String nombre;
    private String dui;
    private Reserva fecha;
    private Administrador1 registra;

    public Cliente(String nombre, String dui, Reserva fecha, Habitacion habitacion, Administrador1 registra) {
        this.nombre = nombre;
        this.dui = dui;
        this.fecha = fecha;
        this.habitacion = habitacion;
        this.registra = registra;
    }

    Cliente() {
    }
  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public Habitacion habitacion;

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Administrador1 getRegistra() {
        return registra;
    }

    public void setRegistra(Administrador1 registra) {
        this.registra = registra;
    }

    public Reserva getFecha() {
        return fecha;
    }

    public void setFecha(Reserva fecha) {
        Reserva reserva = new Reserva();
        
        while(true){
            reserva.Registrarentrada(0, 0, 0);
            break;
        }
        
        reserva.Registrarsalida(0, 0, 0);
        reserva.det_estacion(0);
        this.fecha = fecha;
    }
    
    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }
    
    /*public void insertarfechas(int a,int b,int c,int d,int e,int f){
        Scanner input=new Scanner(System.in);
        Reserva r=new Reserva();
        
        r.Registrarentrada(a, b, c);
        r.Registrarsalida(d, e, f);
        //this.reserva=r;
    }*/
}