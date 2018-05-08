
package parcialpoo_2x2;

/**
 *
 * @author Eduardo
 */
public class Paquete {

    private String nombre;
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    private int tipo;
    private double precio;
    
    public int getTipo(){
        return tipo;
    }
    public void setTipo(int tipo){
    this.tipo = tipo;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }


}
