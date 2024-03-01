package practice.objects;

public class Persona {
    String nombre;
    Integer edad;

    boolean esAlto;

    public Persona(
        String nombre,
        Integer edad
    ){
        this.nombre = nombre;
        this.edad = edad;
    };

    public Persona(
        String nombre,
        Integer edad,
        boolean esAlto
    ){
        this.nombre = nombre;
        this.edad = edad;
        this.esAlto = esAlto;
    }

    public void saludar(){
        System.out.println("Hola a todos, sera increíble hoy día :D");
    }


}
