package other.interfaces;

// ** Recuerda que una interfaz es como un contrato
// ** que cualquier clase que lo implemente

// ** tendra que implementar los métodos asbtractos
// ** que tenía dicha interfaz.

// ** Una FunctionalInterface es aquella interfaz
// ** que solo tiene un método abstracto

// ** Agregar la anotación FunctionalInterface es
// ** una buena práctica

// ** Entonces cuando tengas interfaces es mejor
// ** implementarlo con las funciones Lambda

// ** Funciones Lambda es como un ATAJO
// ** para definir una implementación
// ** de una interfaz funcional


@FunctionalInterface
public interface OperacionMatematica {

    int calcular(int num1, int num2);
}
