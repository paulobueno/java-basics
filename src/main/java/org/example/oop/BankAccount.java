public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0;
    }

    public BankAccount(String owner, int balance) {
        if (balance < 0) {
            System.out.println("Balance cant be negative.\n");
            return;
        }
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount < 0) {
            System.out.println("Amount must be positive.\n");
        } else {
            balance += amount;
        }
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Amount cant be greater than current balance.\n");
        } else if (amount < 0) {
            System.out.println("Amount must be positive.\n");
        } else {
            balance -= amount;
        }
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }
    
}
