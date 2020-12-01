import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        // подготовка данных
        long amount = 1000_00;
        boolean registered = true;
        long expected = 30; // ожидаемый результат

        // вызов целевого метода
        long actual = service.calculate(amount, registered);

        // производим проверку
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        // подготовка данных
        long amount = 1000_000_00;
        boolean registered = true;
        long expected = 500; // ожидаемый результат

        // вызов целевого метода
        long actual = service.calculate(amount, registered);

        // производим проверку
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();
        // подготовка данных
        long amount = 45_000_00;
        boolean registered = false;
        long expected = 450; // ожидаемый результат

        // вызов целевого метода
        long actual = service.calculate(amount, registered);

        // производим проверку
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateUnregisteredAndOverLimit() {
        BonusService service = new BonusService();
        // подготовка данных
        long amount = 55_000_00;
        boolean registered = false;
        long expected = 500; // ожидаемый результат

        // вызов целевого метода
        long actual = service.calculate(amount, registered);

        // производим проверку
        assertEquals(expected, actual);

    }
}