package S06_Loops.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Health {

    private String name;
    private Integer numberOfNegativeThoughts;


    public Health(Integer xd, String a) {
        numberOfNegativeThoughts = xd;
        name = a;
    }

    public boolean verifyMyMentalHealth() {
        for (int i = 0; i < 40; i++) {
            boolean isHealthy = this.numberOfNegativeThoughts.equals(10);

            if (i==20 && isHealthy) {
                return true;
            }
        }

        return false;
    }

    public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {
        for(int i=0; i < lunchBox.size() ; i++){
            if(lunchBox.get(i).equals("ant")){
                lunchBox.remove(i);
                i--;
            }
        }

        return lunchBox;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {

//      ** Loops

//      ?? Se usa para realizar cosas repetitivas muy rápido

//      ?? Un bucle es una herramienta de programación que permite
//      ?? repetir el mismo bloque de código hasta que alguna condición
//      ?? es conocida

//      ** While

//      ?? Este bucle se usa cuando no se conoce el numero de iteraciones
//      ?? que vamos a dar.

//      ! Se ejecutará hasta que la condición sea falsa.

//      ?? Variable Contador o iterador
        int amountOfGoodHabitsOfMentalHealth = 0;
        int amountOfDaysInAYear = 365;

        while (amountOfGoodHabitsOfMentalHealth < amountOfDaysInAYear) {
            amountOfGoodHabitsOfMentalHealth++;
//            System.out.println("Keep doing my bro :D !");
        }

//        System.out.println("I achieved the goal of mental health :D !");

//      ** For

//      Cuando hablamos de iteración en referencia a los bucles,
//      significa que estamos repitiendo el mismo bloque de código.


//      ?? Sintaxis

//      ? i = 0 --> Solo se ejecutará una vez.
//      ? i<=10 --> Se ejecutará hasta que sea falso
//      ? i++ --> Se incrementará en cada iteración

//      ? En total se repitira 10 veces

        ArrayList<Integer> listNumber = new ArrayList<>();
        int[] listNumberPrimitives = new int[30];

        for (int i = 0; i < 10; i++) {
            listNumber.add(i);
            listNumberPrimitives[i] = i ^ 2;
//            System.out.println("Este es un bucle");
        }

//        System.out.println("La cantidad de elementos son: " + listNumber.size() );
//        System.out.println("La lista de primitivos: " + Arrays.toString(listNumberPrimitives));

//      ! Tener en cuenta que si no armamos bien la cabecera del for,
//      ! Nos puede conducir a “off by one” error.


//      ** Iterando sobre Array y ArrayLists

//      ? Un patrón común es iterando sobre los Array, a traves
//      ? de una lista de data y hacer algo con cada item.

//      ? Entonces, podemos usar la variable contador para poder acceder
//      ? al índice del arreglo.

//      ! Recuerda siempre que la cantidad de elementos de un arreglo
//      ! Es igual a una unidad más que su último índice.

//      ! Ojo recuerda que si accedes a un indice que no esta dentro del
//      ! array, te saldra ArrayIndexOutOfBoundsException

//      ? Example

        ArrayList<Double> listCursosPromedios = new ArrayList<>();
        listCursosPromedios.add(2.3);
        listCursosPromedios.add(4.3);
        listCursosPromedios.add(6.5);
        listCursosPromedios.add(7.8);

        int[] listCursosAverages = new int[10];

        for (int i = 1; i < listCursosAverages.length; i++) {
            listCursosAverages[i] = listCursosAverages[i] + i;
//            System.out.println(listCursosAverages[i]);
        }

        int contador = 0;
        while (contador < listCursosPromedios.size()) {
            listCursosPromedios.set(contador, contador * 4.0);
            contador++;
        }

//        System.out.println("Los elementos del curso promedio son: " + listCursosPromedios);


//      ** Break and Continue

//      ? Break va a detener todas las iteraciones

//      ? Example:

        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                break;
            }
//            System.out.println(i);
        }


//      ? Continue se usa para saltar una iteración

//      ? Example

        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                continue;
            }
//            System.out.println("Numeros impares: " + numbers[i]);
        }

//      ?   Usando el keyword "return"

//      ? El return se saldra del bucle

        Health instanceHealth = new Health(10, "Luis");
        boolean isHealthy = instanceHealth.verifyMyMentalHealth();
//        System.out.println("Tu salus mental está: " + (isHealthy ? "Bien" : "Mal"));



//      ** For-each - Enhanced Loop - Loop Mejorado

//      ? A veces necesitamos acceder a los indices de los elementos o
//      ? solo queremos iterar a través de una porción de la lista --> For o While

//      ? Pero, a veces solamente nos interesa más el elemento dentro del arreglo a sí mismo
//      ? Para eso usamos For Each

//      ! Se lee de esta manera: Para cada "itemHealth" en "listHealth", haz algo.


//      ? Example

        ArrayList<Health> listHealth = new ArrayList<Health>();
        Health element1 = new Health(20, "Pepito");
        Health element2 = new Health(10, "Carlitos");
        listHealth.add(element1);
        listHealth.add(element2);


        for( Health itemHealth : listHealth) {
            String StatusMentalHealthMessage = itemHealth.verifyMyMentalHealth() ? "Bien" : "Mal";
//            System.out.println("Me llamo " + itemHealth.name + " y mi salud mental está: " + StatusMentalHealthMessage);
        }


//      ** Removiendo elementos

//      ? Debemos tener cuidado cuando eliminamos elementos de los ArrayLists dentro de un bucle
//      ? while o for

//      ! Ojo no se recomienda de ninguna manera manipular ArrayLists cuando usamos For-each
//      ! Acciones como agregando o removiendo elementos de un ArrayList ocasionará

//      ! ConcurrentModificationException --> Cuando un item es agregado o eliminado durante
//      ! la iteración


//      ? Para el bucle while cuando usas el remove(), no tienes que incrementar la variable
//      ? contador

//      ? En cambio, el bucle for cuando usas el remove(), tienes que decrementar la variable
//      ? contador

//      ? Esto es debido a que el ArrayLists el valor donde ocupaba un indice se desplaza
//      ? a la izquierda lo que haria que disminuya en un indice



//      ? Example


//      ? My Example

        ArrayList<String> lunchContainer = new ArrayList<String>();
        lunchContainer.add("apple");
        lunchContainer.add("ant");
        lunchContainer.add("ant");
        lunchContainer.add("sandwich");
        lunchContainer.add("ant");
        lunchContainer = removeAnts(lunchContainer);

        System.out.println(lunchContainer);

        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        lst.add(10);


//      ? Removiendo con While

        int i = 0; // initialize counter

        while (i < lst.size()) {
            // if value is odd, remove value
            if (lst.get(i) % 2 != 0){
                lst.remove(i);
            } else {
                // if value is even, increment counter
                i++;
            }
        }

        System.out.println("Lista final con while: " + lst);


//      ? Removiendo con For

        for (int j = 0; j < lst.size(); j++) {
            if (lst.get(j) % 2 != 0){
                // ! remove value from ArrayList
                lst.remove(lst.get(j));
                // ! Decrease loop control variable by 1
                j--;
            }
        }

        System.out.println("Lista final con For: " + lst);
    }

}
