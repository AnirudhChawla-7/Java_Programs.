import java.util.Scanner;
public class BankAcc {
    private double balance;

    public BankAcc() {
        this.balance = 0;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println(amount + "deposited successfully");
        }
        else{
            System.out.println("Deposit amount must be > 0");
        }
    }

    protected void withdraw(double amount){
        if(amount > 0){
            balance = balance - amount;
            System.out.println(amount + "withdrawn successfully");
        }
        else{
            System.out.println("Invalid withdrawl amount");
        }
    }

    void checkbalance(){
        System.out.println("Your balance is: "+ balance);
    }

    public static void main(String[] args){
        BankAcc Acc = new BankAcc();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount you want to deposit: ");
        double depositedamount = sc.nextDouble();

        Acc.deposit(depositedamount);

        Acc.checkbalance();

        System.out.println("Enter the amount you want to withdraw");
        double withdrawamount = sc.nextDouble();
        Acc.withdraw(withdrawamount);

        Acc.checkbalance();

        sc.close();
    }
}
