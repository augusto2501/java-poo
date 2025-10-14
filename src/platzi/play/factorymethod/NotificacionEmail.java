package platzi.play.factorymethod;

/**
 * PRODUCTO CONCRETO (Concrete Product) #1
 *
 * Implementación específica de Notificacion para enviar emails.
 */
public class NotificacionEmail extends Notificacion {

    public NotificacionEmail(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("📧 Enviando EMAIL a: " + destinatario);
        System.out.println("   Mensaje: " + mensaje);
        System.out.println("   Usando servidor SMTP...");
    }
}
