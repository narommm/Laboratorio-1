package parcialpoo_2x2;


import java.util.Scanner;

public class Administrador1 {

    
    Scanner sc;

    public Administrador1() {
        sc = new Scanner(System.in);

    }

    
    public String getNombre(String reservar) {
        String Nombre = "";
        while (Nombre.equals("")) {
            System.out.println(reservar);
            Nombre = sc.nextLine();
            if (!Nombre.matches("^[A-Za-z ]*$")) {
                Nombre="";    
            }
        }
        return Nombre;
    }

    public int getDui(String reservar) {
        String DUI = "";
        while (DUI.equals("")) {
            System.out.println(reservar);
            DUI = sc.nextLine();
            if (!DUI.matches("^[0-9]{8}")) {//cada digito entre 1 y 9, y dui de ocho cifras
            DUI="";
            }
        }
        return Integer.parseInt(DUI);
    }
/*
    public String getEstado(String reservar) {
        String est = "";
        while (est.equals("")) {
            System.out.println(reservar);
            est = sc.nextLine();
            if (!est.matches("^[A-Za-z]*$")) {//cada digito entre 1 y 9, y ultimod 4 digitos de la tarjeta                       
            est="";
            }
        }
        return est;
    }*/

    public int getNumeroHabitacion(String reservar) {
        String n = "";
        while (n.equals("")) {
            System.out.println(reservar);
            n = sc.nextLine();
            if (!n.matches("[1-9]{1}")) {//cada digito entre 1 y 9,para habitaciones de dos cifras                     
            n="";
            }
            
        }
        return Integer.parseInt(n);
    }

    public String getPiso(String reservar) {
        String Piso = "";
        while (Piso.equals("")) {
            System.out.println(reservar);
            Piso = sc.nextLine();
            if (!Piso.matches("^[A-Za-z]*$")) {
            Piso="";
            }
        }
        return Piso;
    }
    }
/*
    public static void habilitar(String i) {
      ReservaDeHotel.eliminarHabitacion(i);
        System.out.println("La habitacion esta habilitada");

    }

    public static void deshabilitar(String piso,String numerodehabitacio,String estado) {
        ReservaDeHotel.agregarHabitacion(piso, numerodehabitacio, estado);
        System.out.println("La habitacion esta deshabilitada");

    }

    public void cambiarPrecio() {
        ReservaDeHotel.cambiarprecioshabitaciones();

    }

    public void mostrarHabitaciones() {
        ReservaDeHotel.mostrar();
    }
     
    }*/
