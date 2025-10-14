package platzi.play.servicio;

import java.time.LocalDate;

public class Pelicula {
    public String titulo;
    public String descripcion;
    public int duracion;
    public String genero;
    public LocalDate fechaEstreno;
    public double calificacion;
    public boolean disponible;

    public Pelicula(String titulo, int duracion, String genero){
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
    }
}


