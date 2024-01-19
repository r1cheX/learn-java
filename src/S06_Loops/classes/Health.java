package S06_Loops.classes;

public class Health {


    public static void main(String[] args) {
//        ** While

//        ?? Este bucle se usa cuando no se conoce el numero de iteraciones
//        ?? que vamos a dar.

        int amountOfGoodHabitsOfMentalHealth = 0;
        int amountOfDaysInAYear = 365;

        while (amountOfGoodHabitsOfMentalHealth < amountOfDaysInAYear) {
            amountOfGoodHabitsOfMentalHealth++;
            System.out.println("Keep doing my bro :D !");
        }

        System.out.println("I achieved the goal of mental health :D !");
    }
}
