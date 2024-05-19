package LapPractice;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        System.err.println(Math.max(a, Math.max(b, c)));
    }
}
