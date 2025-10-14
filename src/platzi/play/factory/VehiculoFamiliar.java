package platzi.play.factory;

// Producto concreto: Vehiculo Familiar
public class VehiculoFamiliar implements Vehiculo {

    @Override
    public void mostrarInfo() {
        System.out.println("🚙 Vehículo Familiar espacioso y cómodo");
        System.out.println("   - Capacidad: 7 pasajeros");
        System.out.println("   - Consumo eficiente: 6L/100km");
    }

    @Override
    public String getTipo() {
        return "Familiar";
    }
}
