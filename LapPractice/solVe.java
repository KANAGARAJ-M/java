import java.util.*;
class solVe{
    public static void main(String []VK){
        Scanner sc= new Scanner(System.in);
        long a= sc.nextLong();
        int evenCount=0,oddCount=0;
        while(a!=0){
            int last = (int)(a%10); 
            if(last % 2  ==0  ){
                evenCount++;
            }
            else oddCount++;
            a/=10;
        }
       System.out.println(oddCount==evenCount);
    }
}
/* i/p:
       357919736895138
   o/p:     false  */
       
