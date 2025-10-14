package platzi.play.factory;

// Producto concreto: Vehiculo Deportivo
public class VehiculoDeportivo implements Vehiculo {

    @Override
    public void mostrarInfo() {
        System.out.println("🏎️  Vehículo Deportivo de alto rendimiento");
        System.out.println("   - Velocidad máxima: 300 km/h");
        System.out.println("   - 0-100 km/h: 3.5 segundos");
    }

    @Override
    public String getTipo() {
        return "Deportivo";
    }
}
