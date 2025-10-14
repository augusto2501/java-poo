package platzi.play.factorymethod;

/**
 * FACTORY METHOD (Método Fábrica)
 *
 * Esta clase contiene el método factory que encapsula la lógica
 * de creación de objetos. El cliente usa este método en lugar de
 * usar directamente el operador 'new'.
 *
 * VENTAJAS:
 * 1. Encapsula la lógica de creación
 * 2. El cliente no necesita conocer las clases concretas
 * 3. Fácil de extender (agregar nuevos tipos sin modificar código existente)
 * 4. Cumple con el principio Open/Closed (abierto para extensión, cerrado para modificación)
 */
public class NotificacionFactory {

    /**
     * FACTORY METHOD: Crea y retorna una instancia de Notificacion
     * según el tipo solicitado.
     *
     * @param tipo Tipo de notificación ("email", "sms", "push")
     * @param destinatario Destinatario de la notificación
     * @param mensaje Mensaje a enviar
     * @return Instancia de Notificacion del tipo solicitado
     */
    public static Notificacion crearNotificacion(String tipo, String destinatario, String mensaje) {
        // La lógica de decisión está encapsulada aquí
        switch (tipo.toLowerCase()) {
            case "email":
                return new NotificacionEmail(destinatario, mensaje);

            case "sms":
                return new NotificacionSMS(destinatario, mensaje);

            case "push":
                return new NotificacionPush(destinatario, mensaje);

            default:
                throw new IllegalArgumentException("Tipo de notificación no soportado: " + tipo);
        }
    }

    /**
     * Método factory alternativo con validaciones adicionales
     */
    public static Notificacion crearNotificacionSegura(String tipo, String destinatario, String mensaje) {
        // Validaciones antes de crear el objeto
        if (destinatario == null || destinatario.trim().isEmpty()) {
            throw new IllegalArgumentException("El destinatario no puede estar vacío");
        }

        if (mensaje == null || mensaje.trim().isEmpty()) {
            throw new IllegalArgumentException("El mensaje no puede estar vacío");
        }

        return crearNotificacion(tipo, destinatario, mensaje);
    }
}
