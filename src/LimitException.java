public class LimitException extends RuntimeException{

    private double remainingBalance;

    public LimitException(String message, double remainingBalance) {
        super(message);
        this.remainingBalance = remainingBalance;


    }

    public double getRemainingBalance() {
        return remainingBalance;
    }
}
