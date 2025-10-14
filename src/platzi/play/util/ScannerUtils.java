package platzi.play.util;

import java.util.Scanner;

public class ScannerUtils {

    public static Scanner scanner = new Scanner(System.in);
    public static final String VERSION = "1.0.1";

    public static String capturarTexto(String mensaje){
        System.out.println(mensaje);  // ⭐ MOSTRAR el mensaje
        System.out.flush();            // ⭐ Forzar que se muestre
        return scanner.nextLine();
    }

    public static int capturarNumero(String mensaje){
        System.out.println(mensaje);   // ⭐ MOSTRAR el mensaje
        System.out.flush();             // ⭐ Forzar que se muestre
        int dato = scanner.nextInt();
        scanner.nextLine();
        return dato;
    }

    public static double capturarDecimal(String mensaje){
        System.out.println(mensaje);   // ⭐ MOSTRAR el mensaje
        System.out.flush();             // ⭐ Forzar que se muestre
        double dato = scanner.nextDouble();
        scanner.nextLine();
        return dato;
    }

    public static void cerrarScanner(){  // ⭐ Corregí el typo "cerraScanner"
        scanner.close();
    }
}