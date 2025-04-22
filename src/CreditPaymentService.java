public class CreditPaymentService {
    public int calculate(double sum, double creditRate, int period) {
        int month = period * 12; // Период в месяцах
        double creditRateMonth = creditRate / 12 / 100; // Месячная процентная ставка
        int pay = (int) (sum * creditRateMonth * Math.pow((1 + creditRateMonth), month) / (Math.pow((1 + creditRateMonth), month) - 1));
        return pay;
    }
}