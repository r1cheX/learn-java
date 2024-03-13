package practice;

import practice.objects.Persona;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {

    public static Integer sizeOfLista(List<Integer> lista){
        return lista.size();
    }

    public static void main(String[] args) {

        int number = 4;
        char character= 'a';
        double numberDobule = 4.0;

        String cadena = "Holaa como estan";

        cadena.length();

        for (int i=0; i<10 ; i++){
//            System.out.println("El numero: " + i);
        }

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = integerList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("La suma es: " +sum);


        for (Integer item : integerList){
            System.out.println("Impresion: " + item);
        }

        sizeOfLista(integerList);

        Persona personaInstance = new Persona("Richard", 23, true);

        personaInstance.saludar();

        Map<String, Integer> listMaps = new HashMap<>();
        listMaps.put("Richard", 23);
        System.out.println(listMaps.get("Richard"));

    }
}

