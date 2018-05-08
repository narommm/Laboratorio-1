
package parcialpoo_2x2;

/**
 *
 * @author Mery Acevedo
 */
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
/**
 * clase que crea el treemap donde se guardan las habitaciones y donde se modifican tambien
 * 
 */
public class ReservaDeHotel {

    public static Map<String, Habitacion> listaDeHabitaciones = new TreeMap<String, Habitacion>();

    public Map<String, Habitacion> getListaDeHabitaciones() {
        return listaDeHabitaciones;
    }

    public static void crearhabitaciones(int numpisos, int numhabitacion) {
        String[] pisos = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Tipohab tipoh = new Tipohab();
        for (int i = 0; i < numpisos; i++) {
            // System.out.println(pisos[i]);
            for (int j = 1; j <= numhabitacion; j++) {
                String numhab = String.valueOf(j);
                String key = (pisos[i] + numhab);               //aqui cree las hab el for era para las llaves 
                Habitacion habitacion = new Habitacion();
                if (j % 2 == 0) {
                    habitacion.setTipo("doble");
                    habitacion.setPrecio(tipoh.GetPrecioDoble());   //aqui determino el tipo de hab y tambien el precio que llevaran
                } else {
                    habitacion.setTipo("basica");
                    habitacion.setPrecio(tipoh.getPrecio());
                }
                habitacion.setEstado("habilitada");             //deja el estado de la habitacion automaticamente habilitado
                listaDeHabitaciones.put(key, habitacion);       //agrega la llave y la habitacion al treemap
            }
        }
    }

    public static void agregarHabitacion(String piso, String numeroDeHabitacion) {//metodo para deshabilitar una habitacion
        int numerodehabitacion = Integer.parseInt(numeroDeHabitacion);
        Scanner input = new Scanner(System.in);
        //System.out.println("ola1");
        String key = piso + numeroDeHabitacion;
        //Habitacion habi;
        if (listaDeHabitaciones.containsKey(key)) {         //verifica si la habitacion existe
            Habitacion valor = listaDeHabitaciones.get(key);
            valor.setEstado("inhabilitada");
            listaDeHabitaciones.put(key, valor);
        } else {
            System.out.println("esta habitacion no esta");
        }
    }

    public static void agregarHabitacion(String yave, Habitacion habitacion) {
        listaDeHabitaciones.put(yave, habitacion);
    }

    public static void agregarHabitacion(String piso, String numeroDeHabitacion, String nombre, String dui) {
        int numerodehabitacion = Integer.parseInt(numeroDeHabitacion);          //metodo que deja una habitacion como reservada
        //System.out.println("ola");
        Scanner input = new Scanner(System.in);

        String key = piso + numeroDeHabitacion;
        Habitacion habit = listaDeHabitaciones.get(key);
        
            Cliente c = new Cliente();//crea un objeto cliente
            c.setNombre(nombre);    //inserta los datos del cliente
            c.setDui(dui);
            
            if (listaDeHabitaciones.containsKey(key)) {//revisa que la habitacion exista
                if ("habilitada".equals(habit.Estado())) {//revisa que este habilitada
                    c.setFecha(2018,7,1,2018,7,5);      //inserta las fechas de llegada y entraada
                Habitacion valor = listaDeHabitaciones.get(key);
                valor.setEstado("reservada");   //cambia el estado a reservada
                valor.setCliente(c);            //setea el objeto cliente en la varible cliente tipo cliente
                System.out.println("desea el paquete premiun si/no");
                String opcion = input.nextLine();
                 System.out.println(" Añadiendo Reservacion ");
                if ("si".equals(opcion)) {//agrega el paquete
                    valor.agregarpaquete(0);
                } else {
                    valor.agregarpaquete(1);
                }
                listaDeHabitaciones.put(key, valor);}//agrega la hab reservada
                else{
                    System.out.println("la habitacion ya se encuentra reservada");
                }

            } else {
                System.out.println("esta habitacion no esta");
            }
        

    }

    public static void eliminarHabitacion(String piso, String numeroDeHabitacion) {//metodo que  habilita una habitacion
        String key = piso + numeroDeHabitacion;
        if (listaDeHabitaciones.containsKey(key)) {//verifica que este
            Habitacion valor = listaDeHabitaciones.get(key);
            valor.setEstado("habilitada");
            valor.setCliente(null);//hace nulos los atributos de la habitacion
            valor.setPaquete(null);
            listaDeHabitaciones.put(key, valor);
        }

    }

    public static void eliminarHabitacion(String i) {
        if (listaDeHabitaciones.containsKey(i)) {
            Habitacion valor = listaDeHabitaciones.get(i);
            valor.setEstado("habilitada");
            valor.setCliente(null);
            valor.setPaquete(null);
            listaDeHabitaciones.put(i, valor);
        }

    }

    public static void mostrar() {//muestra todas las habitaciones

        for (Entry<String, Habitacion> listadehabitaciones : listaDeHabitaciones.entrySet()) {
            String clave = listadehabitaciones.getKey();
            Habitacion valor = listadehabitaciones.getValue();
            System.out.println("habitacion " + clave + "     ------       estado: " + valor.estado + "     -----        tipo de habitacion " + valor.getTipo());
        }

    }

    public static void mostrar2() {//muestra solo las habitaciones que fueron reservadas
        for (Entry<String, Habitacion> listadehabitaciones : listaDeHabitaciones.entrySet()) {

            String clave = listadehabitaciones.getKey();
            Habitacion valor = listadehabitaciones.getValue();
            if ("reservada".equals(valor.estado)) {
                System.out.println("habitacion " + clave + "       ------       reservada por : " + valor.cliente.nombre);
            }

        }

    }

    public static void cambiarprecioshabitaciones() {//cambia los precios de las habitaciones
        Scanner input = new Scanner(System.in);
        Tipohab t = new Tipohab();
        System.out.println("ingrese el precio de la habitaciones sencillas: ");
        t.setPrecio(input.nextDouble());
        System.out.println("ingrese el precio de las habitaciones dobles");
        t.setPreciodoble(input.nextDouble());

    }

}

