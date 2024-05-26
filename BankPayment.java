public class BankPayment implements PaymentStrategy {

    @Override
    public boolean pay(double amount) {
        
        System.out.println(" payment using Bank");
        return true;
    }
}
