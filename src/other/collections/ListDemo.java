package other.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {


//  * List es parte del framework de colecciones

//  * Representa una:
//  * Colección ordenada
//  * Puede contener duplicados
//  * Acceso mediante índices (posiciones)

    public static void main(String[] args){
//      * La razón por la cual se está usando un ArrayList
//      * es porque como es una interfaz, no puede ser instanciada
//      * directamente.

//      * Por tanto se necesita usar una implementación concreta
//      * para crear una instancia

        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0, "firstElement");

        System.out.println(list);

//      Agregar multiples items
        Collections.addAll(list, "a", "b", "c");

//      Obtener items
        String secondList = list.get(2);
        System.out.println(secondList);

//      Setear items
        list.set(0, "🤡");
        System.out.println(list);

//      Removiendo

        list.remove(2);
        System.out.println(list);

//      Obtener index

        int indexClown = list.indexOf("🤡");
        int lastIndexOfA = list.lastIndexOf("a");
        System.out.println(indexClown);

//      Obtener una parte del list

        List<String> newList = list.subList(2, 5);
        System.out.println(newList);

//      * Ejercicio:

//        * Crea una lista de números enteros y luego:
//
//        * Ordena la lista de menor a mayor.
//        * Imprime la lista ordenada.

        List<Integer> listIntegers = new ArrayList<>();

        Collections.addAll(listIntegers, 1,9,2,20,4,8);

        System.out.println(listIntegers);

        for (int i=0; i < listIntegers.size(); i++){
            for(int j=i+1; j< listIntegers.size(); j++){
                if (listIntegers.get(i) > listIntegers.get(j)){
                    int temp = listIntegers.get(i);
                    listIntegers.set(i, listIntegers.get(j));
                    listIntegers.set(j, temp);
                }
            }
        }

//        Collections.sort(listIntegers);


        System.out.println(listIntegers);

    }

}
