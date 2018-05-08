package parcialpoo_2x2;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gaby Salguero
 */
public class mainPrincipal {

    public static void main(String[] args) {
        mainPrincipal menufinal = mainPrincipal.getInstance();

        menufinal.menuHotel();
    }

    private static mainPrincipal menufinal;

    private mainPrincipal() {
    }

    public static mainPrincipal getInstance() {
        if (menufinal == null) {
            menufinal = new mainPrincipal();
        }
        return menufinal;
    }

    public void menuHotel() {

        ReservaDeHotel.crearhabitaciones(6, 10);
        //Scanner input = new Scanner(System.in);
        Scanner datos = new Scanner(System.in);

        int intento = 0;

        do {
            int opcion = 0, seguir = 0;
            //Scanner entrada = new Scanner(System.in);
            do {
                System.out.println("------ MENU DEL HOTEL ------");
                System.out.println("1- Reservar nueva habitacion.");
                System.out.println("2- Cancelar reservacion.");
                System.out.println("3- Modificar reservacion.");
                System.out.println("4- Habilitar habitacion.");
                System.out.println("5- Deshabilitar habitacion.");
                System.out.println("6- Mostrar habitaciones.");
                System.out.println("7- Mostrar habitaciones reservadas.");
                System.out.println("8- Cambiar precio.");
                System.out.println("9- Salir.");

                //opcion = entrada.nextInt();
                try {
                    opcion = datos.nextInt();

                    switch (opcion) {
                        case 1:
                           // Administrador1.nuevaReservacion();
                            // System.out.println(" Añadiendo Reservacion ");
                            
                        Administrador1 in=new Administrador1();
                        String nombre=in.getNombre("Ingresa nombre del Cliente");            
                        int dui=in.getDui("Ingresa DUI");
                       // String estado=in.getEstado("Ingresa el estdo R de la habitacion para reservar");
                        int tarjetaC=in.getTarjetaCredito("Ingrese ultimos cuatro digitos de la tarjeta");
                        int numero=in.getNumeroHabitacion("Ingrese numero de habitacion");
                        String piso=in.getPiso("Ingrese la letra del piso");
                        String num=String.valueOf(numero);
                        String diu=String.valueOf(dui);
                        String tarjeta=String.valueOf(tarjetaC);
                        ReservaDeHotel.agregarHabitacion(piso, num, nombre, diu);
                  
                  
                  
                        System.out.println("Nombre:"+ nombre);
                        System.out.println("DUI:"+ dui);
                     //   System.out.println("Targeta de Credito:"+ estado);
                        System.out.println("Tarjeta de credito:"+tarjetaC);
                        System.out.println("Numero de Habitacion:"+ numero);
                        System.out.println("Piso:"+ piso);
                       // System.out.println(" Añadiendo Reservacion ");
                            break;

                        case 2:
                            //ReservaDeHotel.mostrar();
                            datos.nextLine();
                            System.out.println("Ingrese el piso, seguido del numero de habitacion: ");
                            String n = datos.nextLine();
                            ReservaDeHotel.eliminarHabitacion(n);
                            break;

                        case 3:
                            //ReservaDeHotel.mostrar();
                            System.out.println("Ingrese el piso, seguido del numero de habitacion: ");
                            datos.nextLine();
                            String x = datos.nextLine();
                            
                            Habitacion habi = ReservaDeHotel.listaDeHabitaciones.get(x);
                          
                            habi.getCliente().setFecha(2018, 8, 1, 2018, 8, 5);
                            ReservaDeHotel.agregarHabitacion(x, habi);
                            System.out.println("Reserva modificada!");
                            break;

                        case 4:
                            // ReservaDeHotel.mostrar();
                            System.out.println("Ingrese el piso, seguido del numero de habitacion: ");
                            datos.nextLine();
                            String y = datos.nextLine();
                            ReservaDeHotel.eliminarHabitacion(y);
                            break;

                        case 5:
                            //ReservaDeHotel.mostrar();
                            datos.nextLine();
                            System.out.println("Ingrese el piso: ");
                            String yy = datos.nextLine();
                            System.out.println("Ingrese el numero de habitacion: ");
                            String yyy = datos.nextLine();
                            ReservaDeHotel.eliminarHabitacion(yy, yyy);
                            break;

                        case 6:
                            ReservaDeHotel.mostrar();
                            break;

                        case 7:
                            ReservaDeHotel.mostrar2();
                            break;

                        case 8:

                            break;

                        case 9:
                            System.exit(0);
                            //System.out.println("Salida exitosa...");
                            break;

                        default:
                            System.out.println("Por favor ingrese una opcion valida.");
                    }
                    System.out.println("Para continuar digite 1...");
                    seguir = datos.nextInt();

                } catch (InputMismatchException e) {
                    System.err.println("Por favor, Ingrese un número.");
                    datos.nextLine();
                }
            } while (seguir == 1);
        } while (intento == 1);
    }
}
