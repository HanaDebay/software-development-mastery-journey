class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double balance){
        this.ownerName = ownerName;
        this.balance = balance;
    }

    //Deposit Method
    public void deposit(double amount){
        if(amount > 0){
            amount += amount;
            System.out.println(amount + " deposited successfully");
        }else {
            System.out.println("Invalid deposit amount");
        }
    }
    //withdraw method
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println(amount + " withdrawn successfully");
        }else {
            System.out.println("withdrawal failed. insufficient balance");
        }
    }
    //check balance
    public void checkBalance(){
        System.out.println(ownerName +" Current Balance: " +balance);
    }
}

public class Main{
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Hana", 3000);
        BankAccount account2 = new BankAccount("Abel", 4000);

        account1.deposit(3000);
        account2.deposit(2000);
        account1.withdraw(300);
        account2.withdraw(1000);
        account1.checkBalance();
        account2.checkBalance();
    }
}