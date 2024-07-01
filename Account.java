import java.util.Objects;

public class Account implements Comparable<Account>{

    private String accountHolderName;
    private String accountNumber;
    private double accountBalanace;

    public Account(String name, String accountNumber){
        this.accountNumber = accountNumber;
        this.accountHolderName = name;
        this.accountBalanace = 0.0;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getAccountBal(){
        return accountBalanace;
    }

    @Override
    public int compareTo(Account other){
        return this.accountNumber.compareTo(other.accountNumber);

    }

    public void deposit(double amount){
        if(amount > 0){
            accountBalanace = accountBalanace + amount;
        }else{
            System.out.println("Incorrect amount");
        }
    }

    public void withDraw(double amount){
        if(accountBalanace >= amount){
            accountBalanace = accountBalanace - amount;
        }else{
            System.out.println("Incorrect withdraw amount, insufficient funds");
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Account account = (Account) obj;
        return Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + accountBalanace +
                '}';
    }
    
}
