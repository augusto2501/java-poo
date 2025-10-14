package platzi.play.factory;

// Producto concreto: Motor Familiar
public class MotorFamiliar implements Motor {

    @Override
    public void encender() {
        System.out.println("✨ Motor híbrido encendiendo suavemente...");
    }

    @Override
    public String getEspecificaciones() {
        return "Motor Híbrido 4 cilindros - 180 HP - Ecológico";
    }
}
