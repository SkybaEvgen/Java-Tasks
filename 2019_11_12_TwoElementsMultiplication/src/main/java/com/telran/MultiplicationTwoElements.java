/*
Есть отсортированный массив > 0 int.
Дано число.
Найдется ли 2 элемента из массива таких
что их произведение равно этому числу
*/

package com.telran;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/*
Первый способ решения
Алгоритм решения - проходим по всем элементам из массива до значения sqrt(квадратный корень из n),
далее находим все элементы в массиве, которые делят число n без остатка,
и потом число n делим на эти числа, полученное значение ищем в массиве с помощью метода binarySearch
*/
public class MultiplicationTwoElements {
    public boolean findTwoElementsMultipliers1(int [] array, int n) {
        int indexSqrt = Arrays.binarySearch(array, (int) Math.sqrt(n));
        if (indexSqrt < 0) {
            indexSqrt = indexSqrt * (-1) -1;
        }
        if(indexSqrt > array.length-1) return false;
        else
            for (int i = 0; i < indexSqrt; i++) {
                if (n % array[i] == 0) {
                    int x = n/array[i];
                    int index = Arrays.binarySearch(array, x);
                    if (index > 0) {
                        return true;
                    }
                }
            }
        return false;
    }

/*
Второй способ решения
Алгоритм решения - перекладываем элементы массива в очередь (LinkedList).
В отдельном методе рекурсивным способом решаем задачу (если произведение первого и последнего элементов очереди меньше
n тогда удаляем первый элемент из очереди, если произведение больше - удаляем последний элемент. Если произведение
равно n - задача решена).
*/
    public boolean findTwoElementsMultipliersQueue(int [] array, int n) {
        LinkedList<Integer> linkedArray = new LinkedList<>();
        for (int value : array)
            if (n % value == 0) {
                linkedArray.add(value);
            }
        return find(linkedArray, n);
    }

    private boolean find (LinkedList<Integer> linkedList, int n) {
        if (linkedList.peekFirst() == null || linkedList.peekLast() == null) return false;
        if (linkedList.peekFirst() * linkedList.peekLast() == n) return true;
        if (linkedList.peekFirst() * linkedList.peekLast() < n) {
            linkedList.pollFirst();
        } else linkedList.pollLast();
        return find(linkedList, n);
    }

    /////////////////////////////////////////////////////////////
    // метод решения в классе
    public boolean findTwoElementsMultipliers(int[] array, int number){
        ArrayDeque<Integer> dividerQueue = new ArrayDeque<>();

        for(int member:array) {
            if(number%member == 0)
                dividerQueue.addLast(member);
        }

        while (dividerQueue.size() > 1) {
            int first = dividerQueue.getFirst();
            int last = dividerQueue.getLast();
            int product = first*last;

            if(product == number)
                return true;

            if (product > number) {
                dividerQueue.removeFirst();
                continue;
            }

            dividerQueue.removeFirst();
        }

        return false;
    }
}
