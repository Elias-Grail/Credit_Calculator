public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        double result1 = service.calculate(1_000_000, 9.99, 1);
        System.out.println();
        System.out.println("Ваш ежемесячный платёж составляет: " + (int)result1 + " рублей.");

        double result2 = service.calculate(1_000_000, 9.99, 2);
        System.out.println();
        System.out.println("Ваш ежемесячный платёж составляет: " + (int)result2 + " рублей.");

        double result3 = service.calculate(1_000_000, 9.99, 3);
        System.out.println();
        System.out.println("Ваш ежемесячный платёж составляет: " + (int)result3 + " рублей.");
    }
}