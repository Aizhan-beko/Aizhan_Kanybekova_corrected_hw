public class BankAccount
{
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double sum){
        balance+=sum;
        System.out.println("Dear client you have just put  " + sum + "som. Your balance: " + balance + " som"  );
    }
    public void withDraw(double sum)
        throws LimitException{
            if(sum > balance){
                throw new LimitException("Requested balance exceeds current balance",this.balance);
            }
            balance-=sum;
            System.out.println("Withdrawn "+ sum + " som. Remaining balance: " + balance + " som");
        }
    }
