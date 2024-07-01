public class Main {

    public static void main(String args[]){
        BankingSystem bankingSystem = new BankingSystem();

        bankingSystem.createAccount("12345", "Alice");
        bankingSystem.createAccount("67890", "Bob");

        bankingSystem.depositAmount("12345", 1000);
        bankingSystem.depositAmount("67890", 2000);

        bankingSystem.withdrawAmount("12345", 500);

        bankingSystem.transfer("67890", "12345", 300);

        bankingSystem.printAccounts();
    }
    
}
