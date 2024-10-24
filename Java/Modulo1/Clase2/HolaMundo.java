package Java.Modulo1.Clase2;

import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Funciona!!!!!!!!!");

        var scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        var entero= scanner.nextLine();

        System.out.println(entero);
        scanner.close();
    }
}