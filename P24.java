class NotSufficientFundException extends Exception {
    public NotSufficientFundException(String message) {
        super(message);
    }
}

class BankAccount {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws NotSufficientFundException {
        if (amount > balance)
            throw new NotSufficientFundException("Not Sufficient Fund! Available Balance:  " + balance);
        balance -= amount;
        System.out.println(amount + " after this Your Balance Is :- " + balance);
    }

}

public class Banking {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount(25000);
        try {
            user1.withdraw(20000);
            user1.withdraw(4000);
            user1.withdraw(2000);
        } catch (NotSufficientFundException error) {
            System.out.println(error.getMessage());
        }
    }
}