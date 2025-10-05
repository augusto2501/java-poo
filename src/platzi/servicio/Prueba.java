package platzi.servicio;

public class Prueba {
    String nombre;
    int edad;

    public Prueba(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Prueba{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}'; 
        
    }
}
