package other.iterables.useCases;

import other.iterables.GenericListImplemented;

public class UseCaseGenericListImplemented {

    public static void main(String[] args){

        var list = new GenericListImplemented<String>();
        var iterator = list.iterator();

//      * El foreach utiliza internamente un iterador
//      * si observamos el byte code, nos daremos cuenta
        for ( var item: list){
            System.out.println(item);
        }

//        while(iterator.hasNext()){
//            var currentObject = iterator.next();
//            System.out.println(currentObject);
//        }


    }
}
