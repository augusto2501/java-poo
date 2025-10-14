package platzi.play;

import platzi.play.factory.*;
import platzi.play.factorymethod.*;
import platzi.play.servicio.Pelicula;
import platzi.play.servicio.Ticket;
import platzi.play.util.ScannerUtils;

public class Main {
    public static void main(String[] args) {

        // ========================================
        // EJEMPLO: PATRÓN ABSTRACT FACTORY
        // ========================================
        System.out.println("\n=== PATRÓN ABSTRACT FACTORY ===\n");

        // El cliente trabaja con la interfaz abstracta VehiculoFactory
        // sin conocer las clases concretas

        System.out.println("--- Cliente solicita un vehículo DEPORTIVO ---");
        VehiculoFactory factoryDeportivo = new DeportivoFactory();
        fabricarYMostrar(factoryDeportivo);

        System.out.println("\n--- Cliente solicita un vehículo FAMILIAR ---");
        VehiculoFactory factoryFamiliar = new FamiliarFactory();
        fabricarYMostrar(factoryFamiliar);

        System.out.println("\n=== FIN DEL EJEMPLO ===\n");


        // ========================================
        // EJEMPLO: PATRÓN FACTORY METHOD
        // ========================================
        System.out.println("\n=== PATRÓN FACTORY METHOD ===\n");

        // SIN Factory Method: El cliente debe conocer las clases concretas
        // NotificacionEmail email = new NotificacionEmail("user@mail.com", "Hola");
        // NotificacionSMS sms = new NotificacionSMS("+123456789", "Hola");

        // CON Factory Method: El cliente solo conoce la interfaz y usa el factory
        System.out.println("--- Enviando notificaciones usando Factory Method ---\n");

        // Crear diferentes tipos de notificaciones usando el factory
        Notificacion notif1 = NotificacionFactory.crearNotificacion("email",
                                                                     "usuario@platzi.com",
                                                                     "¡Bienvenido a Platzi!");
        notif1.enviar();
        notif1.confirmar();

        System.out.println();

        Notificacion notif2 = NotificacionFactory.crearNotificacion("sms",
                                                                     "+52-555-1234",
                                                                     "Tu código de verificación es: 12345");
        notif2.enviar();
        notif2.confirmar();

        System.out.println();

        Notificacion notif3 = NotificacionFactory.crearNotificacion("push",
                                                                     "device_token_abc123",
                                                                     "Tienes una nueva clase disponible");
        notif3.enviar();
        notif3.confirmar();

        System.out.println("\n=== FIN DEL EJEMPLO ===\n");


        // ========================================
        // CÓDIGO ANTERIOR (comentado)
        // ========================================

//    String titulo = ScannerUtils.capturarTexto("Cual es el nombre de la pelicula");
//    int duracion = ScannerUtils.capturarNumero("Cual es la duración");
//    String genero = ScannerUtils.capturarTexto("Cual es el genero");
//
//    Pelicula pelicula = new Pelicula(titulo,duracion,genero);

//        System.out.println(Ticket.getNumero());
//
//        Ticket ticket1 = new Ticket();
//        Ticket ticket2 = new Ticket();
//        Ticket ticket3 = new Ticket();
//        Ticket ticket4 = new Ticket();
//
//        System.out.println(Ticket.getNumero());

    //ScannerUtils.cerrarScanner();

    }

    /**
     * Este método demuestra el patrón Abstract Factory en acción.
     *
     * VENTAJA CLAVE: Este método no necesita saber qué tipo específico
     * de vehículo o motor está creando. Solo trabaja con las interfaces
     * Vehiculo y Motor, y la fábrica se encarga de crear los objetos compatibles.
     *
     * @param factory La fábrica que creará los productos
     */
    private static void fabricarYMostrar(VehiculoFactory factory) {
        // La fábrica crea una familia completa de productos relacionados
        Vehiculo vehiculo = factory.crearVehiculo();
        Motor motor = factory.crearMotor();

        // Usamos los productos sin conocer sus tipos concretos
        vehiculo.mostrarInfo();
        System.out.println("Motor: " + motor.getEspecificaciones());
        motor.encender();
    }
}
