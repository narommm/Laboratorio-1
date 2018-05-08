
package parcialpoo_2x2;

/**
 *
 * @author ronald
 */
public class Habitacion {
    public String piso;
    public String numeroDeHabitacion;
    public String tipo;
    public Paquete paquete;
    public String estado;
    public double precio=0;
    public Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Habitacion(){}
 
    public Habitacion(String piso, String numeroDeHabitacion,String tipo, Paquete paquete, String estado, double precio) {
        this.piso = piso;
        this.numeroDeHabitacion = numeroDeHabitacion;
        this.tipo = tipo;
        this.paquete = paquete;
        this.estado = estado;
        this.precio = precio;
    }
    
    public Habitacion(String piso, String numeroDeHabitacion,  String estado) {
        this.piso = piso;
        this.numeroDeHabitacion = numeroDeHabitacion;
       
        this.estado = estado;
        
    }
    //----------------------------------------------------------------------------------------------------------------------------------
    public String getPiso() {
        return piso;
    }
    public void setPiso(String piso) {
        this.piso = piso;
    }
    public String getNumeroDeHabitacion() {
        return numeroDeHabitacion;
    }
    public void setNumeroDeHabitacion(String numeroDeHabitacion) {
        this.numeroDeHabitacion = numeroDeHabitacion;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public Paquete getPaquete() {
        return paquete;
    }
    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }
    public String Estado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio += precio;
    }
    //---------------------------------------------------------------------------------------------------------------------------------------
    
     public void agregarpaquete(int i){
        Paquete p=new Paquete();
        if (i==0){
            p.setNombre("premiun");
            p.setTipo(i);
            p.setPrecio(150);
        }else{
            p.setNombre("basico");
            p.setTipo(i);
            p.setPrecio(10);
        }
        paquete=p;
    }
    
    //-------------------------------------------------------------------------------------------------------------------------------------------
   
}

    



