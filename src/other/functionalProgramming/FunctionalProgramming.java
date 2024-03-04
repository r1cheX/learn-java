package other.functionalProgramming;

import other.interfaces.OperacionMatematica;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

//   * Funcion de orden superior que retorna una función

    public static Function<Integer, Integer> crearFuncionSuma(int numero) {
        return num -> (num + numero);
    }


//  * Paradigma de la programación que trata a las operaciones
//  * computacionales como evaluación de funciones matemáticas

//  * Con funcionas puras y declarativas y se enfoca en el cómo.

    public static void main(String[] args) {

//     * ------------------------------------------------- MODULO 1 -----------------------------------------------------------------------------------------------

//     * 1. Introducción:

        Function<Integer, Integer> multiplicarPorDos = x -> x * 2;

        Integer resultadoSuma = sumar(2, 3);
        Integer resultadoMultiplicacion = multiplicarPorDos.apply(4);

        Integer totalSumando = sumarConTotal(10);

        System.out.println("El resultado de la suma y multiplicación es: " + resultadoSuma + " y " + resultadoMultiplicacion);
        System.out.println("El resultado del incremento del total es: " + totalSumando);

//      * ------------------------------------------------- MODULO 2 -----------------------------------------------------------------------------------------------

//      * 2. Expresiones Lambdas, Interfaces Funcionales y Métodos de referencia

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

        List<Integer> listNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 78);
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

        Consumer<String> imprimirMensaje = System.out::println;

        imprimirMensaje.accept("Hola a todos xd");

//      ? Supplier: Representa una operación que no tiene argumentos y no produce resultado

        Supplier<Integer> generadorAleatorio = () -> (int) (Math.random() * 100);

        int numeroAleatorio = generadorAleatorio.get();

        System.out.println("El número aleatorio es: " + numeroAleatorio);

//     * Métodos de referencia

//     * Proporciona una forma más concisa y legible para expresar tipos comunes

//     * de EXPRESIONES LAMBDAS.

//     * El cual hace referencia a un método.

//     * Los tipos es que pueden hacer referencia a un:

//      * Método estático
//      * Método de instancia de objeto.
//      * Referencia a un constructor --> ClassName::new

        List<String> namesOfDogs = List.of("Canela", "Negrita", "Peladita");


        Consumer<String> referenceMethod = System.out::print;
        namesOfDogs.stream().map(name -> name.concat("\n")).forEach(referenceMethod);


//      Equivale a:
        Consumer<String> lambdaExpressionThatReferenceMethodReplace = name -> System.out.println(name);
        namesOfDogs.stream().map(name -> name.concat("\n")).forEach(lambdaExpressionThatReferenceMethodReplace);


//     * ------------------------------------------------- MODULO 3 -----------------------------------------------------------------------------------------------

//     *  3. FUNCIÓN DE ORDEN SUPERIOR Y STREAMS

//     * Una función de orden superior es una función que:

//     ? --> Recibe una o más funciones como argumentos

//     ? --> Devuelve una función como resultado

//     ! Se puede usar con el framework Collections para realizar operaciones de filtrar, ordenar y mapear.

//     ! Con programación funcional para que sea más conciso y modular.


        Function<Integer, Integer> funcionCuadrado = crearFuncionSuma(4);

        int resultadoFinal = funcionCuadrado.apply(5);
        System.out.println("El resultado final es : " + resultadoFinal);


//      * Introducción a Streams

//      * Representan secuencias de elementos que pueden ser procesados
//      * de manera SECUENCIAL o PARALELA.

//      * Secuencial significa que se procesa uno a la vez en un solo
//      * hilo de ejecución.

//      * Cada operación del Stream espera a que la operación anterior
//      * termine, antes de comenzar.

//      * Paralela significa que se procesa simultáneamente en varios hilos
//      * de ejecución

//      * Las operaciones se dividen en subtareas que pueden ejecutarse de manera
//      * independiente y luego se combinan los resultados.

//      * Un hilo de ejecución se refiere a la secuencia de instrucciones que un
//      * procesador ejecuta de manera consecutiva.

//      * Un hilo es la unidad más pequeña de ejecución de un programa.

//      * Un proceso es un programa de ejecución. Puede contener uno o varios hilos de ejecución

//      * Un proceso puede tener varios hilos de ejecución y estos comparten el mismo espacio
//      * de memoria.

//      ? Proporciona operaciones de alto nivel es decir de mayor abstracción, ya que se enfoca en el
//      ? Qué.

//      ? El cual permite realiazr transformaciones y operaciones en colecciones de manera declarativa.


//      ? Características claves es que son perezosas ( Lazy ), es decir las operaciones de Stream no se ejecutan
//      ? hasta que se llama un método terminal.

//      ? Son INMUTABLES, Los streams no modifican la fuente original de datos.

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);

        int sumaNumeros = numeros.stream()
            .mapToInt(Integer::intValue)
            .sum();

        System.out.println("La fuente original sigue inmutable: " + numeros);
        System.out.println("La suma de numeros es: " + sumaNumeros);


        List<String> nombres = Arrays.asList("Juan", "María", "Carlos", "Ana");

        Stream<String> nombresStream = nombres.stream();

//      ? El Collect sirve para proporcionar un conjunto de operaciones
//      ? que se pueden utilizar con las API de Streams para ACUMULAR
//      ? ELEMENTOS de un FLUJO en una colección.

        List<String> resultadoList = nombres.stream()
            .filter(nombre -> nombre.startsWith("j"))         //  * Operadores intermedios
            .map(String::toUpperCase)                        //  * Operadores intermedios
            .collect(Collectors.toList());                  //  * Operadores terminales

        System.out.println("El resultado de la lista es: " + resultadoList);

//      * Las operacions intermedias más comunes son filter(), map(), sortes() y distinct()

//      * Las operaciones terminales más comunes son forEach(), count(), sum(), min(), max()
//      * y collect

//      * Ver Ejercicios de tu reporsitorio que has hecho forked de amigos code.








    }
}
