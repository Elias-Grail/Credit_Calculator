public class CreditPaymentService {
    public double calculate(double s, double p, double n){

        // s = сумма кредита, p = ежемесячная ставка по процентам, n = срок кредита в месяцах.

        double month = n * 12;
        double perMonth = p / 12 / 100;
        double monthlyPayment = s * (perMonth * (Math.pow(1 + perMonth, month)) / (Math.pow(1 + perMonth, month) - 1));


        return monthlyPayment;


    }
}
