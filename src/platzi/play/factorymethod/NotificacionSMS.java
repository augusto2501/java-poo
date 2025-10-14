package platzi.play.factorymethod;

/**
 * PRODUCTO CONCRETO (Concrete Product) #2
 *
 * Implementación específica de Notificacion para enviar SMS.
 */
public class NotificacionSMS extends Notificacion {

    public NotificacionSMS(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("📱 Enviando SMS al número: " + destinatario);
        System.out.println("   Mensaje: " + mensaje);
        System.out.println("   Usando gateway de telecomunicaciones...");
    }
}
