/*  Есть купюры 10, 5, 1.
    Дана сумма денег n.
    Найти минимальное количество купюр, необходимых для получения n.
    28 = 10 + 10 + 5 + 1 + 1 + 1, ответ 6.
 */

import java.util.ArrayList;
import java.util.List;

public class ExchangeOfMoney {
    public int findMinNumbersOfBanknotes (int[] money, int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int value : money)
            if (n >= value) {
                numbers.add(n / value);
                n = n % value;
            }
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
