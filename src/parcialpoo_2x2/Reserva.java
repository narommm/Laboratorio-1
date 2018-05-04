
package parcialpoo_2x2;
import java.util.Calendar;//clase ocupe para el formato de fechas
import java.util.Scanner;

    
 //TEST  
/**
 *
 * @author Mery Acevedo
 */
public class Reserva {

    private Calendar fechaentrada;
    private Calendar fechasalida;
    private String estacion;
    private int precioestacion;

    public Calendar getFechaentrada() {
        return fechaentrada;
    }

    public Calendar getFechasalida() {
        return fechasalida;
    }

    public void Registrarentrada(int annio, int mes, int dia) {
        if (fechaentrada == null) {
            Calendar fechas = Calendar.getInstance();//inicialize un objeto fecha que llevara las fecha de entrada
            Calendar fechaactual = Calendar.getInstance();//objeto que lleva la fecha actual del sistema
            fechas.set(annio, mes, dia);//metodo que agrega la fecha 
            int diaa = fechaactual.get(Calendar.DAY_OF_MONTH);
            int mesa = fechaactual.get(Calendar.MONTH);
            mesa = mesa + 1;//esta parte la agrege porque en mi compu el mes esta atrazado
            int annioa = fechaactual.get(Calendar.YEAR);
            fechaactual.set(annioa, mesa, diaa);
            if (fechas.after(fechaactual)) {
                if (verificar(annio, mes, dia)) {//metodo vericar devuelve un booleano
                    this.fechaentrada = fechas;//aqui lleno la varible privada
                    System.out.println("fecha de ingreso aceptada");
                } else {
                    System.out.println("la fecha es invalida");
                }
            } else {
                System.out.println("enserio, viajaras en el tiempo  O_o");
            }

        }
    }

    private boolean verificar(int annio, int mes, int dia) {//metodo que verifica que las fechas sean validas,por si engresa el mes 52 o algo asi
        if (mes <= 12 && mes > 0) {
            if (mes == 2) {
                if (anniobisiesto(annio)) {
                    if (dia <= 29) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    if (dia <= 28) {
                        return true;
                    } else {
                        return false;
                    }
                }
            } else {
                if (dia <= 31) {

                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public int Registrarsalida(int annio, int mes, int dia) {
        Calendar fechas = Calendar.getInstance();
        fechas.set(annio, mes, dia);
        int algo = 0;
        int diaextra = fechaentrada.get(Calendar.DAY_OF_MONTH);
        int mesentrada = fechaentrada.get(Calendar.MONTH);
        int annioentrada = fechaentrada.get(Calendar.YEAR);
        if (fechas.after(this.fechaentrada)) {
            if (verificar(annio, mes, dia)) {
                if (mes == mesentrada && annio == annioentrada) {
                    for (int i = diaextra; i <= dia; i++) {
                        algo += 1;
                    }
                }else{
                    if(mesentrada==12){
                        if(mes<2){
                        algo=(30-diaextra)+dia;} 
                        else{
                            System.out.println("solo se permite reservar 7 dias");
                        }
                    }else{
                      if(mes==(mesentrada+1)){
                          algo=(30-diaextra)+dia;
                      }
                    }
                }
                if (algo <= 7 && algo>0) {
                    fechasalida = fechas;
                    System.out.println("si!!!!!!!!!!!!!!!!!!!!!!!!! tambien salida te quedaras "+algo+" dias");
                    return algo;
                } 
                else {
                    System.out.println("fecha de salida rechazada solo puede estar un maximo de 7 dias");
                }
            } 
            else {
                System.out.println("la fecha no es valida");
            }
        } 
        else {
            System.out.println("no es posible reservar hacia atras");
        }
        return 0;
    }

    private boolean anniobisiesto(int annio) {
        if ((annio % 4 == 0) && (annio % 100 != 0) || (annio % 400 == 0)) {
            return true;
        }
        return false;

    }
    
    public void det_estacion(int n){
        if(fechaentrada.get(Calendar.MONTH)==12){
            this.estacion="navidad";
            this.precioestacion=n;
        }
        else if(fechaentrada.get(Calendar.MONTH)==8){
            this.estacion="vacaciones agosto";
            this.precioestacion=n;
        }
        
    }
    
    


}
