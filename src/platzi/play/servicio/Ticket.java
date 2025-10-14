package platzi.play.servicio;

public class Ticket {

    public static int numero;

    public Ticket(){
        numero ++;
    }

    public static int getNumero(){
        return numero;
    }
}
