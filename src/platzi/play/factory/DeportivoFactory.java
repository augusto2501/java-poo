package platzi.play.factory;

/**
 * CONCRETE FACTORY (Fábrica Concreta) #1
 *
 * Esta fábrica crea una familia completa de productos DEPORTIVOS:
 * - VehiculoDeportivo
 * - MotorDeportivo
 *
 * Garantiza que los productos creados sean compatibles entre sí.
 */
public class DeportivoFactory implements VehiculoFactory {

    @Override
    public Vehiculo crearVehiculo() {
        return new VehiculoDeportivo();
    }

    @Override
    public Motor crearMotor() {
        return new MotorDeportivo();
    }
}
