package SoftGroupTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * Знаходження К-компліментарної (K-complementary) пари в заданому цілочисловому (integer) масиві.
 Заданий масив A, пара (i, j) є K-компліментарною коли  K = A[i] + A[j];
 */
public class KComplementary {

    private static final int MIN_LENGTH = 2;


    public static Set<Pair> complementaryPairs(int K, int[] numbers) {
        Set<Pair> pairs = null;
        if (numbers != null && numbers.length >= MIN_LENGTH) {
            pairs = new HashSet<>();
            Set<Integer> uniqueNumbers = Arrays.stream(numbers).boxed().collect(Collectors.toSet());

            List<Pair> pairList = uniqueNumbers.parallelStream()
                    .filter(number -> number < K && uniqueNumbers.contains(K - number))
                    .map(number -> new Pair(number, K - number))
                    .collect(Collectors.toList());

            pairs.addAll(pairList);
        }

        return pairs;
    }

}

/**Клас по знаходженню пари K-complementary.
 **/

class Pair {
    private int firstNumber;
    private int secondNumber;

    public Pair(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                '}';
    }
}
