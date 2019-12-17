/*  Есть число int n > 0.
    Разбить число n на сумму различных натуральных чисел так,
    чтобы количество чисел было максимальным.
    6 = 1 + 2 + 3;
    8 = 1 + 2 + 5;
 */

import java.util.ArrayList;
import java.util.List;

public class SplitNumbers {
    public List<Integer> splitByTheSumOfVariousNaturalNumbers (int n) {
        List<Integer> splitNumbers = new ArrayList<>();
        int lastNumber = n;
        for (int i = 1; i < n; i++) {
            n = n - i;
            if (n > 0 && n > i) {
                splitNumbers.add(i);
                lastNumber = lastNumber-i;
            }
        }
        splitNumbers.add(lastNumber);
        return splitNumbers;
    }
}
