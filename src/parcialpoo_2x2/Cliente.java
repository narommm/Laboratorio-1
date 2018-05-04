package parcialpoo_2x2;

/**
 * Clase que represrant a un clientwe
 * @author andreu
 */
public class Cliente {

    public String nombre;
    private String telefno;
    private String DUI;
    public String numerodeHabitacion;
    public String piso;
    private int tarjetaDeCredito;

    /**
     * Sirve para
     * @param nombre
     * @param telefno
     * @param DUI
     * @param numerodeHabitacion
     * @param piso
     * @param tarjetaDeCredito 
     */
    public Cliente(String nombre, String telefno, String DUI, String numerodeHabitacion, String piso, int tarjetaDeCredito) {
        this.nombre = nombre;
        this.telefno = telefno;
        this.DUI = DUI;
        this.numerodeHabitacion = numerodeHabitacion;
        this.piso = piso;
        this.tarjetaDeCredito = tarjetaDeCredito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefno() {
        return telefno;
    }

    public void setTelefno(String telefno) {
        this.telefno = telefno;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public String getNumerodeHabitacion() {
        return numerodeHabitacion;
    }

    public void setNumerodeHabitacion(String numerodeHabitacion) {
        this.numerodeHabitacion = numerodeHabitacion;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public int getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    public void setTarjetaDeCredito(int tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
    }

}
