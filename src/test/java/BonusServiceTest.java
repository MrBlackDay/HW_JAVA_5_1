import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {

    @Test
        //Расчёт для зарегистрированного пользователя в рамках лимита
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
        //Расчёт для зарегистрированного пользователя вне рамок лимита
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
//Добавленные тесты в рамках выполнения ДЗ (Шаг 6 Задание 1)

    @Test
        //Расчёт для незарегистрированного пользователя в рамках лимита
    void shouldCalculateForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = false;
        long expected = 10;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
        //Расчёт для незарегистрированного пользователя вне рамок лимита
    void shouldCalculateForUnregisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    //Граничные значения
    @Test
    //Граничные значения при расчёте для незарегистрированного пользователя в рамках лимита
    void BorderValueForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 49_999;
        boolean registered = false;
        long expected = 499;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
        //Граничные значения при расчёте для незарегистрированного пользователя вне рамок лимита
    void BorderValueForUnregisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 50_001;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
        //Граничные значения при расчёте для зарегистрированного пользователя в рамках лимита
    void BorderValueForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 16_666;
        boolean registered = true;
        long expected = 499;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
        //Граничные значения при расчёте для зарегистрированного пользователя вне рамок лимита
    void BorderValueForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 16_667;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}