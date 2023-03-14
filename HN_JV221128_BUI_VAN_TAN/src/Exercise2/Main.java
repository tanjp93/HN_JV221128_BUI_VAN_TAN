package Exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int integerN;
        int sum = 0;
        do {
            System.out.println("Input a positive integer : ");
            integerN = sc.nextInt();
            if (integerN <= 0) {
                System.out.println("Your input number is not available! Please input try again ! ");
            }
        } while (integerN <= 0);
            for (int i = 0; i < integerN; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        System.out.println("Sum of numbers divisible by from 0 ~ n is : " + sum);
}
}
