
package parcialpoo_2x2;

/**
 *
 * @author Eduardo
 */
public class Paquete {
    private final int basico = 1;
    private final int premium = 0;
    
    private int tipo;
    private double precio;
    
    public void escogerPaquete(int tipo){
    
        if(tipo==0){
            System.out.println("usted escogio premium");
            precio=150;
        }
        else {
            System.out.println("usted escogio el paquete basico");
            precio=0;
        }
        
        
    }

    public double getPrecio() {
        return precio;
    }
    
    
    
}
