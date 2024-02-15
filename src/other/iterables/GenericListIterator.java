package other.iterables;

import java.util.Iterator;

public class GenericListIterator<T> implements Iterable<T> {

//  * Si mañana se decir cambiar esto a ArrayList, el único lugar a
//  * cambiar es el iterator
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
    //      * El this hace referencia a la instancia actual de la clase GenericListIterator
        return new ListIterator(this);
    }

    //  * Vamos a implementar una clase anidada que implementa las interfaz Iterator
    //  * El Iterator es responsable de proporcionar un medio para iterar
    //  * sobre los elementos de un objeto Iterable
    private class ListIterator implements Iterator<T> {

        private GenericListIterator<T> list;
        private int index;

        public ListIterator(GenericListIterator<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
