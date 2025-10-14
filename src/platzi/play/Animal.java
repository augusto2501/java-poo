package platzi.play;

public abstract class Animal {
    //Variables de instancia,
    protected  String nombre;
    protected  int edad;

    //Constructor
    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodo concreto con implementación
    public void dormir(){
        System.out.println(nombre + " está durmiento...");
    }

    //Metodo abstracto (sin implementación - obligatorio implementar en subclase)
    public abstract void hacerSonido();

    //Metodo abstracto
    public abstract void moverse();

    //Metodo concreto
    public String getNombre(){
        return nombre;
    }

}
