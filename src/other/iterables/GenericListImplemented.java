package other.iterables;

import java.util.Iterator;

//  ** Metáfora del control remoto

//  ** Las interfaces que implementamos son como los botones
//  ** de un control remoto, si mañana cambian su logica a nivel interno
//  ** los botones siempre van a estar ahí

//  ** Por eso para resolver de poder iterar sobre una lista sin saber sobre su implementación
//  ** Debemos implementar el Iterable
public class GenericListImplemented<T> implements Iterable<T> {

//   * Es Iterable es una interfaz que nos permite que un objeto
//   * sea utilizado como objetivo en el for-each.

//   * El beneficio de usar un Iterable es poder iterar sobre un
//   * objeto sin la necesidad de saber  su implementación interna.

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
