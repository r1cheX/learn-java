package other.two_collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {


//  * La interfaz Map representa una colección de pares

//  * clave-valor, donde cada clave es única.

//  * Cada elemento en un Map se denomina ENTRADA { CLAVE : VALOR }


    public static void main(String[] args) {

        // * HashMap: No garantiza un orden específico
        // * Ofrece un rendimiento constante en operaciones básicas.

//
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Tercero", 30);
        hashMap.put("Primero", 10);
        hashMap.put("Segundo", 20);
        hashMap.put("cuarto", null);
//      Acá el hashMap cuando ve que se repite la clave,
//      se queda con el último
        hashMap.put("cuarto", 20);

//     * La diferencia es que en replace solo reemplaza cuando existe la
//     * clave que mencioans
        hashMap.replace("xd", 10);

//      * Solo ingresa cuando esa clave no exista dentro del map
        hashMap.putIfAbsent("aea", 30);

        // * TreeMap: Mantiene las claves ordenadas naturalmente
        // * Mayor costo computacional
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Tercero", 30);
        treeMap.put("Primero", 10);
        treeMap.put("Segundo", 20);

        // * LinkedHashMap: Mantiene el orden de inserción de las entradas
        // * Combina características de HashMap y LinkedList
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Tercero", 30);
        linkedHashMap.put("Segundo", 20);
        linkedHashMap.put("Primero", 10);


        // Imprimir los mapas
        System.out.println("Imprimir los mapas: ");
        System.out.println("HashMap: " + hashMap);
        System.out.println("TreeMap: " + treeMap);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Metodos importanteS:

        System.out.println("\nMétodos importantes: ");
        for (Map.Entry<String, Integer> entry: hashMap.entrySet()){
            System.out.println("Clave: " + entry.getKey());
            System.out.println("Valor: " + entry.getValue());
        }

        System.out.println(hashMap.get("Primero"));
        System.out.println(hashMap.containsKey("Primero"));
        System.out.println(hashMap.containsValue("Primero"));




    }
}
