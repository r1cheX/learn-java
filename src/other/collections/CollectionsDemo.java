package other.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {

//  * Collection se refiere a un conjunto de interfaces
//  * y clases que proporcionan estructuras de datos
//  * para almacenar y organizar grupos de objetos

//  * Una interfaz son metodos abstractos, abstracto
//  * hace referencia a que no se especifica su implementación
    public static void main(String args[]){
        Collection<String> collection = new ArrayList<>();
//        collection.add("a");
//        collection.add("b");
//        collection.add("c");

//      * Tambien se puede agregar de una sola

        Collections.addAll(collection, "a", "b", "c");

        collection.remove("a");

        System.out.println(collection);
        System.out.println(collection.size());

        collection.clear();

        System.out.println(collection);
        for (String item: collection){
            System.out.println(item);
        }

//        * Contains

        var hasLetterA = collection.contains("a");
        System.out.println(hasLetterA);

//     * Convertir a array con tamaño fijo

//        var objectArray = collection.toArray();
//        var stringArray = collection.toArray(new String[0]);

//     * Igualar colecciones

        Collection<String> other = new ArrayList<>();
//      Tenemos otra ubicacion en memoria
        other.addAll(collection);

//      Aca nos dara false porque el operador de == , tambien compara
//      la ubicación en memoria
        System.out.println(collection == other);

//      Si queremos saber si entre colecciones tenemos el mismo contenido
//      ahi nos dara true
        System.out.println(collection.equals(other));


    }
}
