package Java.Modulo1.Clase3;

import java.util.Scanner;

public class VariablesTiposDatos {
    
    public static void main(String[] args) {
        var scanner= new Scanner(System.in);

        System.out.println("Ingrese un valor: ");
        var text = scanner.nextLine();
        
        //la cadena o el texto que imprime va a tener unos rreemplazos de datos y se colocan con
        //simbolos de porcentaje 
        System.out.printf("El valor ingresado fue: %s%n", text);

        scanner.close();
    }
}
