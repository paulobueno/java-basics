public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John");
        BankAccount account2 = new BankAccount("Jorge", 100);

        printBankAccountInfos(account1);
        printBankAccountInfos(account2);
        
        System.out.println("Deposit 100 to " + account1.getOwner());
        account1.deposit(100);
        printBankAccountInfos(account1);
        System.out.println("Deposit -100 to " + account1.getOwner());
        account1.deposit(-100);
        System.out.println("Withdraw 110 to " + account1.getOwner());
        account1.withdraw(110);
        System.out.println("Withdraw -10 to " + account1.getOwner());
        account1.withdraw(-10);
        System.out.println("Withdraw 10 to " + account1.getOwner());
        account1.withdraw(10);
        printBankAccountInfos(account1);

    }

    public static void printBankAccountInfos(BankAccount bankAccount) {
        System.out.println("\n ======= Bank Account Infos ======= ");
        System.out.println(">>> Owner: " + bankAccount.getOwner());
        System.out.println(">>> Balance: " + bankAccount.getBalance());
        System.out.println(" ================================== \n");
    }

}
