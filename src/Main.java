public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(15000);
        System.out.println("Dear client in your account 15000 som.Would you like to withdraw cash?");
        System.out.println();

        try{
            while(true) {
                account.withDraw(6000);
                System.out.println("Dear client you have just withdrawn 6000 som, your current balance:" + account.getBalance() + " som");
                System.out.println();
            }
            } catch(LimitException e){
            double remainingBalance = e.getRemainingBalance();
            System.out.println ("Remaining balance:" + remainingBalance + "som");
            System.out.println("Remainder is zero.Program has completed!!!");
        }
}
}