package other.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {


    public static void main(String[] args){
        //  * Set es una colección que:

        //  * No permite elementos duplicados
        //  * No tiene un orden definido

        //  * Con respecto a la implementación de HashSet

        //  * Se dice que es un conjunto de Hash, se refiere a
        //  * un algoritmo de conversión de datos en un valor
        //  * entero único - Tabla Hash

        Set<String> conjuntoHash = new HashSet<>();

        conjuntoHash.add("z");
        conjuntoHash.add("b");
        conjuntoHash.add("f");
        conjuntoHash.add("e");
        conjuntoHash.add("q");
        conjuntoHash.add("q");
        conjuntoHash.add("c");
        conjuntoHash.add("z");
        conjuntoHash.add("a");

        System.out.println(conjuntoHash);

        boolean isThereLetterZ = conjuntoHash.contains("z");
        System.out.println(isThereLetterZ);


//      * Implementacion TreeSet

//      * Mantiene un orden ascendente - menor a mayor -  de manera natural tanto alfabetico
//      * como numérico

        Set<String> conjuntoTree = new TreeSet<>();

        conjuntoTree.add("a");
        conjuntoTree.add("z");
        conjuntoTree.add("b");
        conjuntoTree.add("f");
        conjuntoTree.add("e");
        conjuntoTree.add("q");
        conjuntoTree.add("q");
        conjuntoTree.add("c");
        conjuntoTree.add("z");
        conjuntoTree.add("a");
        conjuntoTree.add("a");

//      * Se va a ordenar
        System.out.println(conjuntoTree);


//      * Implementacion LinkedHashSet

//      * Es similar a un List

//      * Pero, los elementos del conjunto se encuentran en el orden
//      * que se insertan y no admite duplicados.

        Set<String> conjuntoLinked = new LinkedHashSet<>();

        conjuntoLinked.add("a");
        conjuntoLinked.add("z");
        conjuntoLinked.add("b");
        conjuntoLinked.add("c");
        conjuntoLinked.add("c");

        System.out.println(conjuntoLinked);


    }
}
