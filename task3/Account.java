public class Account {
    private double balance;
     private String name;
    public Account() {
        this.balance = 0;
    }

    public Account(double deposit,String name ) {
        if (deposit >= 0) {
            this.balance += deposit;
        } else {
            System.out.println("Deposit can't be negative");
        }

            this.name=name;


    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            if(this.name!=null){
            System.out.println("Deposit successful. Updated balance in "+this.name+"'s account : " + this.balance);
            System.out.println();}
            else{   System.out.println("Deposit successful. Updated balance : " + this.balance);
            System.out.println();}
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
            System.out.println();
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            if(this.name!=null){
            System.out.println("Withdrawal successful. Updated balance in "+this.name+"'s account : " + this.balance);
            System.out.println();}
            else{
                System.out.println("Withdrawal successful. Updated balance : " + this.balance);
                System.out.println();
            }
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
            System.out.println();
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: " + this.balance);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {

        Account account1 = new Account();
        account1.deposit(4235.3);
        account1.withdraw(123.4);
        account1.displayBalance();

        Account account2 = new Account(1000,"Arjun");
        account2.deposit(100);
        account2.withdraw(120.32);
        account2.displayBalance();

    }
}