package parcialpoo_2x2;
import java.util.ArrayList;
import java.util.Scanner;



public class MainPrincipal {
    
    
    
    
    
static ArrayList<Habitacion> listaDeHabitaciones = new ArrayList<Habitacion>();


         public static  void agregarHabitacion(String piso, String numeroDeHabitacion, String tipo, String paquete, String estado, double precio)
        {
        
          listaDeHabitaciones.add(new Habitacion(piso,numeroDeHabitacion, tipo, paquete, estado, precio));
        }
       
        public static void eliminarHabitacion(int i)
        {
        
          listaDeHabitaciones.remove(i);
        }
        
        
        public static void mostrar(){
            System.out.println("Piso\tNumeroDeHabitacion\tTipo\tPaquete\tEstado\tPrecio");
            int j=listaDeHabitaciones.size();
            
            for(int k=0; k < j;k++){
                Habitacion hx = listaDeHabitaciones.get(k);
                System.out.println(k+"\t"+hx.getPiso()+"\t"+hx.getNumeroDeHabitacion()+"\t"+hx.getTipo()+"\t"+hx.getPaquete()+"\t"+hx.Estado()+"\t"+hx.getPrecio());
            }

        }
   
    
            
            //reservarHabitacion(Piso, Numero);
            
            
            //int cantHabitaciones=sc2.nextInt();
            //agregarHabitacionNuevo(piso,numeroDeHabitacion, tipo, paquete, estado, precio);
    
    
    
   
    public static void main(String[] args) {
        // TODO code application logic here
      
       
     
         
            int opcion=0,seguir=0;
            Scanner entrada= new Scanner(System.in);
            do{
                System.out.println("MENU DEL HOTEL");
                System.out.println("1- Reservar Nueva Habitacion");
                System.out.println("2- Cancelar Reservacion");
                System.out.println("3- Modificar Reservacion");
                System.out.println("4- Habilitar Habitacion");
                System.out.println("5- Deshabilitar Habitacion");
                System.out.println("6- Agregar Piso");
                System.out.println("7- Eliminar Piso");
                System.out.println("8- Mostrar Habitaciones");
                System.out.println("9- Cambiar Precio");
                System.out.println("10- Salir ");

                opcion=entrada.nextInt();

        
        
                switch(opcion){
                    case 1:
                        Administrador1.nuevaReservacion();
                        System.out.println(" Añadiendo Reservacion ");
                      
                        break;

                    case 2:
                        mostrar();
                       System.out.println("ingrese el piso, seguido del numero de Habitacion");
                       int n=entrada.nextInt();
                       System.out.println("ingrese el numero de habitacion a habilitar");
                       int m=entrada.nextInt();
                       Habitacion hab = listaDeHabitaciones.get(n);
                       hab.habilitarHabitacion(m);
                       System.out.println(" Habitacion habilitada con exito!");
                        break;

                    case 3:
                         mostrar();
                       System.out.println("ingrese el piso, seguido del numero de Habitacion");
                       int x=entrada.nextInt();
                       System.out.println("ingrese el numero de habitaciones a deshabilitar");
                       int y=entrada.nextInt();
                       Habitacion habi = listaDeHabitaciones.get(x);
                       habi.deshabilitarHabitacion(y);
                       System.out.println("Habitacion habiliatda con exito!");
                        break;

                    case 4:
                        Administrador1.mostrar();
                       System.out.println("ingrese el piso, seguido del numero de Habitacion");
                       int z=entrada.nextInt();
                       listaDeHabitaciones.remove(z);
                       System.out.println("Habitacion Eliminada con exito!");
                        break;

                    case 5:
                        Administrador1.mostrar();
                        break;
                    case 6:
                        System.exit(0);
                        break;


            }
                System.out.println("Para continuar digite 1");
                seguir=entrada.nextInt();
            }while(seguir==1);  

             }else {
                System.out.println("Acceso no autorizado");
                Scanner leer= new Scanner(System.in);
                System.out.println("ingrese 1 para continuar o 2 para salir");
                int intento = leer.nextInt();
            }
        }while(intento==1);

    


    /**
     *
     */

}    
    
}









