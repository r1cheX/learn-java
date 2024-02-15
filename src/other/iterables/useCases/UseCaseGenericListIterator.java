package other.iterables.useCases;

import other.iterables.GenericListIterator;

public class UseCaseGenericListIterator {


    public static void main(String[] args){
        var list = new GenericListIterator<String>();
        list.add("Java");
        list.add("Python");
        list.add("Angular");

//      * Ahora gracias a que hemos implementado el Iterable con su Iterator
//      * Podemos recorrer una lista sin la necesidad de conocer su implementación

//      * Tambien podemos recorrer un objeto como objetivo en el for-each

        for (var item : list) {
            System.out.println("El elemento: " + item);
        }

    }
}
