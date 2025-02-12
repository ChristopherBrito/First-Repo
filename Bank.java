public class Bank {
    private double amount;  
    private double[] interactions; 
    private int transactionCount;  

    public Bank() {
        this.amount = 0.0;  
        this.interactions = new double[100]; 
        this.transactionCount = 0; 
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.amount += amount;
            interactions[transactionCount] = amount;  
            transactionCount++;  
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && this.amount >= amount) {
            this.amount -= amount;
            interactions[transactionCount] = -amount; 
            transactionCount++;  
        } else {
            System.out.println("Not enough money to withdraw.");
        }
    }

    
    public void listInteractions() {
        System.out.println("List of deposits and withdrawals:");
        for (int i = 0; i < transactionCount; i++) {
            if (interactions[i] > 0) {
                System.out.println("Deposit: $" + interactions[i]);
            } else {
                System.out.println("Withdrawal: $" + Math.abs(interactions[i]));
            }
        }
    }

    public double getBalance() {
        return amount;
    }

    public static void main(String[] args) {
        Bank bankAccount = new Bank();
        bankAccount.deposit(100.0);
        bankAccount.deposit(200.0);
        bankAccount.withdraw(50.0);
        bankAccount.listInteractions();
        System.out.println("Current Balance: $" + bankAccount.getBalance());
    }
}
