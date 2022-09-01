public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int account = 100;
        int sumAdd = 100;
        int base = 100;
        int bonus = sumAdd / base;

        if(sumAdd > base) {
            System.out.println("Итого на счете: " + (account + sumAdd + bonus) + " рублей");
        } else {
            System.out.println("Итого на счете " + (account + sumAdd) + " рублей");
        }
    }
}