package SoftGroupTest;

import java.util.Scanner;

public class Fibonnachi2 {
    public Fibonnachi2() {
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите любое число: ");
        int n = s.nextInt();
        int a = 1;
        int b = 1;
        boolean fib = true;
        int i = 2;
        System.out.println("Фибоначчи числа " + n + ":");
        System.out.print(a + " " + b);

        while(i < n) {
            int var7 = a + b;
            a = b;
            b = var7;
            ++i;
            System.out.print(" " + var7);
        }

    }
}
