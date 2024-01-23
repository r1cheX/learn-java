package codecademy.arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class Dog {


    public static void main(String[] args) {
        ArrayList<String> listDogs = new ArrayList<>();

//      Creating

        listDogs.add("Negrita");
        listDogs.add(0, "Canela");
        listDogs.add(1, "Pelada");
        listDogs.add(2, "Another");

        System.out.println(listDogs);

//        Size

        int sizeListDogs = listDogs.size();
        System.out.println(sizeListDogs);

//        Indice

        System.out.println(listDogs.get(2));

//        Changing a value

        listDogs.set(2, "Candy");
        System.out.println(listDogs);

//        remove

//        listDogs.remove("Negrita");
        listDogs.remove(3);
        System.out.println(listDogs);

//        Getting the index of the value

        System.out.println(listDogs.indexOf("Pelada"));

//      Playing
        String[] list = new String[4];  // Array
        ArrayList<String> list2 = new ArrayList<>(); // ArrayList
    }
}
