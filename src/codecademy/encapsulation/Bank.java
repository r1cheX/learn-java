package codecademy.encapsulation;

public class Bank {
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;

    public Bank() {
        accountOne = new CheckingAccount("Zeus", 100);
        accountTwo = new CheckingAccount("Hades", 200);
    }

    public static void main(String[] args) {
        Bank bankOfGods = new Bank();

        CheckingAccount accountOne = new CheckingAccount("Julio", 100);

//        ! Acá no podré acceder a name ya que es privado
//        System.out.println("Imprimiendo account One desde Bank " + accountOne.name);
    }
}
