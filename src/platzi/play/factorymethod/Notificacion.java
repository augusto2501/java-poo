package platzi.play.factorymethod;

/**
 * PRODUCTO (Product)
 *
 * Clase base abstracta que define la interfaz común para todos
 * los productos que creará el Factory Method.
 */
public abstract class Notificacion {

    protected String destinatario;
    protected String mensaje;

    public Notificacion(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    // Método abstracto que cada tipo de notificación debe implementar
    public abstract void enviar();

    // Método concreto compartido por todas las notificaciones
    public void confirmar() {
        System.out.println("✓ Notificación confirmada para: " + destinatario);
    }
}
