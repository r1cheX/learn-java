package other.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//  ** Metáfora del control remoto

//  ** Las interfaces que implementamos son como los botones
//  ** de un control remoto, si mañana cambian su logica a nivel interno
//  ** los botones siempre van a estar ahí

//  ** Por eso para resolver de poder iterar sobre una lista sin saber sobre su implementación
//  ** Debemos implementar el Iterable
public class GenericList<T> implements Iterable<T> {

//  ** De manera generica si aca se cambia a oto tipo de colección
//  ** como Set o Queue en items, dara un error en otro lado
//  ** Por eso se tiene que implementar el iterable

    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item){
        items[count++] = item;
    }

    public T get(int index){
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
