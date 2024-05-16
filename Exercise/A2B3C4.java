import java.util.Scanner;

public class A2B3C4 {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the input string: ");
        String StrValue=scanner.nextLine();
        String output =expandString(StrValue);
        System.out.println();
        System.out.println("Expanded string: "+output);
        System.out.println();
    }

    public static String expandString(String StrValue){
        StringBuilder result=new StringBuilder();
        for (int i=0;i<StrValue.length();i+=2) {
            char letter=StrValue.charAt(i);
            int count =Character.getNumericValue(StrValue.charAt(i+1));
            for (int j = 0;j<count; j++){
                result.append(letter);
            }
        }
        return result.toString();
    }
}
