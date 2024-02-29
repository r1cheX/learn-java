package other.functionalProgramming;

import other.interfaces.OperacionMatematica;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalProgramming {

    private static Integer total = 10;

//  * Función pura porque no muta ningún valor
    public static int sumar(int a, int b) {
        return a + b;
    }

//  * Función Impura porque modifica el estado de una variable global

    public static Integer sumarConTotal(Integer a) {
        total += a;
        return total;
    }


//  * Paradigma de la programación que trata a las operaciones
//  * computacionales como evaluación de funciones matemáticas

    public static void main(String[] args) {

//     * 1. Introducción:

        Function<Integer, Integer> multiplicarPorDos = x -> x * 2;

        Integer resultadoSuma = sumar(2, 3);
        Integer resultadoMultiplicacion = multiplicarPorDos.apply(4);

//        Integer totalSumando = sumarConTotal(10);

//        System.out.println("El resultado de la suma y multiplicación es: " + resultadoSuma + " y " + resultadoMultiplicacion);
//        System.out.println("El resultado del incremento del total es: " + totalSumando);

//      * 2. Expresiones Lambdas e Interfaces Funcionales

//      * Una interfaz es un contrato

//      * Una funcion Lambda es un atajo para definir una implementación
//      * de una interfaz funcional

        OperacionMatematica operacionMatematicaLambda = (num1, num2) -> num1 * num2;

        int resultado = operacionMatematicaLambda.calcular(10, 6);
        System.out.println("El resultado es: " + resultado);

//      * Interfaces Funcionales

//      ? Function: Representa una función que toma un argumento
//      ? y produce un resultado

//      ? Metodo asbtracto: R apply(T t)

        Function<Integer, Integer> square = x -> x * x;

        Function<List<Integer>, Integer> longitud = List::size;

        System.out.println("El cuadrado de 5 es: " + square.apply(5));

        List<Integer> listNumbers = Arrays.asList(1,2,3,4,5,6,7,78);
        System.out.println("La longitud del arreglo es: " + longitud.apply(listNumbers));

//      ? Predicate: Representa una condición que evalúa un valor booleano

//      ? Metodo asbtracto: boolean test(T t)

        Predicate<Integer> esPar = x -> x % 2 == 0;

        Predicate<List<Integer>> esVacia = List::isEmpty;

        System.out.println("El numero 5 es" + (esPar.test(5) ? " par" : " impar"));

        System.out.println("La siguiente lista está: " + (esVacia.test(listNumbers) ? " vacía" : " llena"));

//      ? Consumer: Representa una operación que acepta un argumento y no
//      ? produce un resultado

//      ? Metodo asbtracto void accept(T t)

        Consumer<Integer> imprimirNumero = System.out::println;

        Consumer<String> convertToUpperCase = String::toUpperCase;

        imprimirNumero.accept(4);


    }
}
