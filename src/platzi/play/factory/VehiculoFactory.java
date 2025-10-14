package platzi.play.factory;

/**
 * ABSTRACT FACTORY (Fábrica Abstracta)
 *
 * Esta es la interfaz principal que define los métodos para crear
 * familias de objetos relacionados sin especificar sus clases concretas.
 */
public interface VehiculoFactory {

    // Método para crear un vehículo
    Vehiculo crearVehiculo();

    // Método para crear un motor compatible
    Motor crearMotor();
}
