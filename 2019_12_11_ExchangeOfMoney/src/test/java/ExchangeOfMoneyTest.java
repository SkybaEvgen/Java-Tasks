import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExchangeOfMoneyTest {
    private ExchangeOfMoney exchangeMoney;

    @Before
    public void init() {
        exchangeMoney = new ExchangeOfMoney();
    }

    @Test
    public void testExchangeOfMoney1() {
        int[] money = {10, 5, 1};
        assertEquals(6, exchangeMoney.findMinNumbersOfBanknotes(money, 28));
    }

    @Test
    public void testExchangeOfMoney2() {
        int[] money = {10, 5, 1};
        assertEquals(4, exchangeMoney.findMinNumbersOfBanknotes(money, 8));
    }

    @Test
    public void testExchangeOfMoney3() {
        int[] money = {10, 5, 1};
        assertEquals(3, exchangeMoney.findMinNumbersOfBanknotes(money, 3));
        System.out.println(exchangeMoney.findMinNumbersOfBanknotes(money, 3));
    }

    @Test
    public void testExchangeOfMoney4() {
        int[] money = {10, 5, 1};
        assertEquals(1, exchangeMoney.findMinNumbersOfBanknotes(money, 1));
    }

    @Test
    public void testExchangeOfMoney5() {
        int[] money = {10, 5, 1};
        assertEquals(19, exchangeMoney.findMinNumbersOfBanknotes(money, 149));
    }

    @Test
    public void testExchangeOfMoney6() {
        int[] money = {10, 5, 1};
        assertEquals(149059655, exchangeMoney.findMinNumbersOfBanknotes(money, 1490596545));
//        System.out.println(exchangeMoney.findMinNumbersOfBanknotes(money, 1490596545));
    }
}
