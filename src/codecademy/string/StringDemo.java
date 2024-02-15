package codecademy.string;


//  * String no es un wrapper ya que no envuelve
//  * a ningún primitivo en Java, es un objeto.

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

//  * Es un objeto que representa una secuencia
//  * de caracteres
public class StringDemo {

    public static void main(String[] args){
        System.out.println("-----------------\nLength()");
//     * Length

//     ? Retorna el tamaño o número total de caracteres.

        String name = "Richard";

        for (char letter: name.toCharArray()){
            System.out.println("Letra : " + letter);

        }

//        System.out.println("Mi nombre es: " + name);
//        System.out.println("El tamaño es: " + name.length());

        System.out.println("-----------------\nConcat()");
//      * Concat

//      ? Es la operación de unir dos strings

        String surname = "Braul";

        surname = surname.concat(" Porras");

        System.out.println(surname);

//      ? Recordar que String son INMUTABLES
//      ? Entonces, de hecho concat() no cambia a
//      ? un objeto String.

        String code = "Code";

        code.concat("cademy");

//      ? No se cambia porque es inmutable.
        System.out.println(code);

//      ? Como funciona la concatenación por dentro

//      ? Al concatenar una cadena con otro objeto
//      ? Java utiliza el resultado del metodo toString() de ese método

//      ! Así que tener en cuenta que no estamos agregando su dirección de memoria

        Ejemplo objetoEjemplo = new Ejemplo();

        System.out.println(objetoEjemplo.toString());

        System.out.println("-----------------\nEquals()");

//      * Equals

//      * Con objetos como String, no podemos usar el operador
//      * de igual primitiva ==, para verificar la igualdad
//      * entre 2 strings.

//      * Usamos equals()

        String word1 = "Hola";
        String word2 = "Hola";

//      * Esta igualdad no siempre se va a dar.
//      * Ya que tambien compara la dirección de memoria
//      * Es decir, si ambos operandos se refieren
//      * al mismo objeto en la MEMORIA.

        System.out.println(word1 == word2);

//      * Para eso, se tiene que usar el metodo .equals()
        System.out.println(word1.equals(word2));

//      * Ahora para comparar dos cadenas según su orden

//      * lexicográfico ( por caracter unicode )

//      *

        String s1 = "Mango";
        String s2 = "Peach";

        int differenceBetweenUnicodeCharacters = s1.compareTo(s2);


        if ( differenceBetweenUnicodeCharacters == 0){
            System.out.println("Son iguales");
        } else if (differenceBetweenUnicodeCharacters > 0) {
            System.out.println(s1 + " es lexicográficamente  mayor a " + s2);
        } else {
            System.out.println(s1 + " es lexicográficamente menor a " + s2 );
        }

        System.out.println("-----------------\nIndexOf()");

//      * Recuerda que los índices en java comienzan en 0
        String letters = "ABCDEFGHIJ";

        int indexOfW = letters.indexOf("E");
        int indexOfEFG = letters.indexOf("FG");
        System.out.println(indexOfW);
        System.out.println(indexOfEFG);

        System.out.println("-----------------\nCharAt()");

        String names = "Richard Robert";

        System.out.println(names.charAt(4));

        System.out.println("-----------------\nSubstring()");

//      * Cuando queremos una parte del String

        String testing = "Esta es una prueba de substring";
        System.out.println(testing.substring(5));

//      ? El endIndex es exclusivo ya que solamente llegará hasta índice 8
        System.out.println(testing.substring(4, 9));

        System.out.println("-----------------\nMayuscula y Minuscula()");

        String dog = "Negrita";
        System.out.println(dog.toUpperCase());




    }




}

class Ejemplo {

    @Override
    public String toString() {
        return "Clase ejemplo";
    }
}
