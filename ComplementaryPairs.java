package SoftGroupTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ComplementaryPairs {

    /*public int noOfComplementaryPairs(int arr[], int k) {
        int result = 0;
        for (int i = 0; i <= arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i] + arr[j + 1] == k) {
                    result++;
                }
            }
        }
        return result * 2;
    }*/

    public int noOfComplementaryPairs(int arr[], int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            map.merge(k - arr[i], 1, Integer::sum);
        }
        return Arrays.stream(arr).map(element -> map.getOrDefault(element, 0)).sum();
    }
    public static void main(String[] args) {
        int[] intArray = new int[]{4, 5, 6, 3, 1, 8, -7, -6};
        int k = 1;
        System.out.println("К-компліментарна : " + new ComplementaryPairs().noOfComplementaryPairs(intArray, k));
    }
}
