import java.util.*;

public class ReverseNumber{
    public static int reverseNumber(int num){
        int reversedNum=0;
        while (num!=0) {
            int digit=num% 10;
            reversedNum =reversedNum *10+ digit;
            num /=10;
        }
        return reversedNum;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number =scanner.nextInt();
        int reversedNumber= reverseNumber(number);
        System.out.println("Reversed number: "+reversedNumber);
        
    }
}
