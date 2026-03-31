public class BankAccount {
    private  double balance;

//deposit money
    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited:" + amount);
        }
        else{
            System.out.println("invalid deposit amount");
        }
    }//withdraw money
    public void Withdrawal(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("withdrawn: " + amount);
        }else{
            System.out.println("you don't have enough money to withdraw");
        }
    }public double getBalance(){
        return balance;
    }
}
