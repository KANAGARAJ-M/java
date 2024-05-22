package LabPractice2;

import java.util.Scanner;

public class MaxOf2Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.print("Enter n value : ");
        int n = scanner.nextInt();
        int largest = Integer.MIN_VALUE; // highest val
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            // System.err.print("Add numbers: ");
            int num = scanner.nextInt();
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        scanner.close();
        System.out.println(largest + " " + secondLargest);
    }
}
