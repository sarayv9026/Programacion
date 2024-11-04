package Java.Modulo1.Clase3;

public class Ejercicio1 {
    public static void main(String[] args) {
        var resultado= 6 / 2 *(1+2);
        System.out.println(resultado);

        var resultadoMalo=6/(2*(1+2));
        System.out.println(resultadoMalo);

        //El reusltado correcto es 9 en la otra calculadora dio 1 debio a que 
        //este modelo tenia asignado que primero realizaba la multiplicaivónn y luego la división;
    }
}
