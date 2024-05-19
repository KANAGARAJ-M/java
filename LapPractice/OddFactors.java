package LapPractice;

import java.util.Scanner;

public class OddFactors {

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i <= number; ++i) {
            if ((number % i == 0) && (i % 2 == 1)) {
                System.out.print(i + " ");
            }
        }
    }

}
