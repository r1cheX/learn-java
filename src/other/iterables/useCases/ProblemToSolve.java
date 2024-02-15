package other.iterables.useCases;

import other.iterables.GenericList;

public class ProblemToSolve {

    public static void main(String[] args){

//      ! El problema a resolver de las clases que implementan
//      ! las interfaces de las colecciones es la siguiente pregunta:

//      ? Como podemos iterar sobre una lista sin saber nada sobre
//      ? su implementación ?

//      * Problem to solve
        var list = new GenericList<String>();

//      * El problema con esto es que para acceder a los items de la lista,
//      * se tiene que hacer public y de esta forma si mañana se cambia la implementacion
//      * a ArrayList va a dar error aca, ya que ArraList tiene get() y size()

//      ! Acá habrá problema ya que se ha cambiado a ArrayList
//        list.items[0] = "a";
//        list.items[1] = "b";
//
//        System.out.println(list.items.length);



    }
}
