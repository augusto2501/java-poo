package platzi.play;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual es tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre + ", esto es una prueba");

        System.out.println("Cuantos años tienes");
        int edad = scanner.nextInt();
        System.out.println("Esto es otra prueba ");
    }
}
