import java.util.Scanner;

public class AaaaBbbCc {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the input string: ");
        String input= scanner.nextLine();
        String output = NumForString(input);
        System.out.println();
        System.out.println("Compressed string: "+output);
    }

    public static String NumForString(String input){
        StringBuilder result = new StringBuilder();
        int n = input.length();
        for (int i=0;i<n;i++){
            char currentChar=input.charAt(i);
            int count = 1;
            while (i+1<n && input.charAt(i + 1)==currentChar){
                count++;
                i++;
            }
            result.append(currentChar).append(count);
        }
        int n1 = 234;
        while(n1!=0) {
      System.out.println("helllooo");
        n1/=10;}
        return result.toString();
    }
}
