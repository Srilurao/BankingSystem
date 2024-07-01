import java.util.HashMap;
import java.util.TreeSet;

public class BankingSystem {

    private HashMap<String,Account> accountDetails;
    private TreeSet<Account> accountSet;

    public BankingSystem(){
        accountDetails = new HashMap<>();
        accountSet = new TreeSet<>();
    }

    public void createAccount(String accountNumber, String accountHolderName){
        if(accountDetails.containsKey(accountNumber)){
            System.out.println("Account already exists");
        }else{
            Account account = new Account(accountNumber, accountHolderName);
            accountDetails.put(accountNumber,account);
            accountSet.add(account);
            System.out.println("account created and account number is: "+accountNumber);
        }

    }

    public void depositAmount(String accountNumber, double amount){
        Account account = accountDetails.get(accountNumber);
        if(account != null){
            account.deposit(amount);
            System.out.println("deposited amount: "+amount);
        }else{
            System.out.println("Unsucessful deposit");
        }

    }

    public void withdrawAmount(String accountNumber, double amount){
        Account account = accountDetails.get(accountNumber);
        if(account != null){
            account.deposit(amount);
            System.out.println("withdrwan amount: "+amount);
        }else{
            System.out.println("Unsucessful widrawal");
        }

    }

    public void transfer(String fromAccountNumber, String toAccountNumber, double amount) {
        Account fromAccount = accountDetails.get(fromAccountNumber);
        Account toAccount = accountDetails.get(toAccountNumber);
        if (fromAccount != null && toAccount != null) {
            if (fromAccount.getAccountBal() >= amount) {
                fromAccount.withDraw(amount);
                toAccount.deposit(amount);
                System.out.println("Amount transferred successfully.");
            } else {
                System.out.println("Insufficient balance in the source account.");
            }
        } else {
            System.out.println("One or both accounts not found.");
        }
    }

    public void printAccounts() {
        for (Account account : accountSet) {
            System.out.println("Account is:"+account);
        }
    }
    
}
