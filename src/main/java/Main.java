// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BonusService bonus = new BonusService();

        int expectedResulted = 12; // Ожидаемый результат расчета бонуса зарегистрированного пользователя
        long actualResult = bonus.calculate(400, true);

        System.out.println(expectedResulted + "==?==" + actualResult);
    }
}