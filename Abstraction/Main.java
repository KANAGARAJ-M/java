
(ii)By using interface(100% abstracted) 
==========================================================================
     
  interface one{
    private void one(){
        System.out.println("one");
    }
    // public  void two(){   // ERROR :interface abstract methods cannot have body
    //     System.out.println("two");
    // }
    default void three(){ // java version after 2008 allows 
                              //concrete with default modifiers 
        System.out.println("three");}
    // protected void four(){    //ERROR:   modifier protected not allowed here
    //     System.out.println("Four");
    // }
}
public class Main
{
	public static void main(String[] args) {
	//	one o = new one(); //ERROR : one is abstract; cannot be instantiated
	}
}
  
  
import java.util.*;
interface ATM{
    int AC=2;// property/ variable always public  static final 
    void debit(); // public abstract 
    void balance();// public
    private void cardLess(){
        System.out.println("Cardless withdraw");
    }
    default void Req(){
        cardLess();
    }
}
/*
    class => class = extends
    class => interface => implements
    interface => interface => extends
*/
class SBI implements ATM{
    Scanner sc= new Scanner(System.in);
    int balance=8000;
   public void debit(){ // debit method in interface overridden
       System.out.print("Enter amount to be debited : ");
       int wi= sc.nextInt();
       balance-=wi;
      // System.out.println("debit"+balance);
       balance();
    //AC= 3;//error: cannot assign a value to final variable AC
   } 
   public void balance(){
       System.out.println("balance"+balance);
   }
}
public class Main
{
	public static void main(String[] args) {
		SBI s= new SBI();
		s.debit();
	}
}



interface one{
    void show();
    void display();
}
interface two{
    void show();
    void ans();
}
class three implements one, two{  // Multiple inheritance achieved
   public  void show(){}
   public  void ans(){}
    public  void display(){}
}
interface four extends one{
    
}
public class Main{
    public static void main (String[] args) {
        /* code */
    }
}
    