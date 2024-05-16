import java.util.*;

public class HighestDigit{
    public static int findHighestDigit(int num){
        int highestDigit =0;
        while (num != 0){
            int digit= num%10;
            highestDigit =Math.max(highestDigit,digit);
            num /=10;
        }
        return highestDigit;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int highestDigit = findHighestDigit(number);
        System.out.println("Highest digit: "+highestDigit);
    }
}
