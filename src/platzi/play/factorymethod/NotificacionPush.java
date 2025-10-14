package platzi.play.factorymethod;

/**
 * PRODUCTO CONCRETO (Concrete Product) #3
 *
 * Implementación específica de Notificacion para enviar push notifications.
 */
public class NotificacionPush extends Notificacion {

    public NotificacionPush(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("🔔 Enviando PUSH NOTIFICATION al dispositivo: " + destinatario);
        System.out.println("   Mensaje: " + mensaje);
        System.out.println("   Usando Firebase Cloud Messaging...");
    }
}
