package platzi.play.factory;

// Producto concreto: Motor Deportivo
public class MotorDeportivo implements Motor {

    @Override
    public void encender() {
        System.out.println("🔥 Motor V8 rugiendo... ¡VROOOM!");
    }

    @Override
    public String getEspecificaciones() {
        return "Motor V8 Biturbo - 600 HP - 8000 RPM";
    }
}
