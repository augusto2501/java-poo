package platzi.play.factory;

/**
 * CONCRETE FACTORY (Fábrica Concreta) #2
 *
 * Esta fábrica crea una familia completa de productos FAMILIARES:
 * - VehiculoFamiliar
 * - MotorFamiliar
 *
 * Garantiza que los productos creados sean compatibles entre sí.
 */
public class FamiliarFactory implements VehiculoFactory {

    @Override
    public Vehiculo crearVehiculo() {
        return new VehiculoFamiliar();
    }

    @Override
    public Motor crearMotor() {
        return new MotorFamiliar();
    }
}
