package codecademy.encapsulation;

public class CheckingAccount {

//  * Si esto es private, estos campos de instancia solo tendran acceso solamente
//  * hasta la clase donde se declaran

    private String name;
    private int balance;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public CheckingAccount(String inputName, int inputBalance) {
        name = inputName;
        balance = inputBalance;
    }

//  * De igual manera, con los métodos
    private void addFunds(int fundsToAdd) {
        balance += fundsToAdd;
    }



    void getInfo() {
        System.out.println("This checking account belongs to " + name + ". It has " + balance + " dollars in it.");
    }

    public static void main(String[] args) {
        CheckingAccount myAccount = new CheckingAccount("Richard", 8300);

        System.out.println(myAccount.balance);

        myAccount.addFunds(5);
        System.out.println(myAccount.balance);

    }
}
