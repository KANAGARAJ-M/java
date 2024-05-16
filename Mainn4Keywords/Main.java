Keywords:
    this 
public class Main
{    	public static void main(String[] args) {
		One o = new One(12,234,23);
		System.out.println(o);
		One t = o.ref();
		System.out.println(t);	 }    }
class One{
    int a , b ,c;
    One(){
    this(12,34,23); // calling current class constructor
     a= 12;
     b=13;
     c=14;
     System.out.println("default constructor");            }
    One(int a , int b, int c){
      System.out.println("3 parameter constructor");
        this.a=a;// refering current class properties
        this.b=b;
        this.c=c;
        this.display();// calling current class method  
         }
    One ref(){
        return this; // returns current class Object refernce    
  }
    void display(){        System.out.println(a+" "+b+" "+c);    }   }  
   
   
   
   super 
   =====================>    onlinegdb.com/Uplw6SaPV
  class Father{
    int a,b,c;
    Father(){
        System.out.println("Father constructor");
        a=12;
        b=13;
        c=41;
    }
    Father(int a , int b ,int c){
        System.out.println("Father 3 parameter constructor");
        this.a = a;
        this.b= b;
        this.c= c;
    }
    void show(){
        System.out.println(a+" "+b+" "+c);
    }
}
class Son extends Father{
    String a,b,c;
    Son(){
         super(98,97,96);// calls immediate parent class constructor
        System.out.println("Son constructor");
      a="Hi";
      b="Hello";
      c="welcome";
    }
    void show(){
       System.out.println(a+" "+b+" "+c);
        super.show(); // calls immediate parent cass method
        System.out.println(super.a);// gets immediate parent class property
        ref(super);//cannot pass (father) class obj like this keyword
    }
    void ref(Father o){
    o.show();  
    }
}
public class Main
{
	public static void main(String[] args) {
	Son s= new Son();
	s.show();
	s.ref();
	}
}
 
   
     final
     
final class Father{ // to restrict a class from inheritance
    int ab,bb,cb;
    Father(){
        System.out.println("Father constructor");
        ab=12;           bb=13;              cb=41;       }
   final void show(){  // to restrict method Override 
        System.out.println(ab+" "+bb+" "+cb);    } }
class Son extends Father{ // Error :cannot inherit from final Father
  final String a,b,c;// to make a property as a constant 
    Son(){
        System.out.println("Son constructor");
      a="Hi";           b="Hello";          c="welcome";     }
//   void show(){  //Error: overridden method is final
//       System.out.println(a+" "+b+" "+c);
//       }   
}
public class Main
{	public static void main(String[] args) {
	Son s= new Son();   s.show();
//s.a= "Hello World";//Error : cannot assign a value to final variable a
	} }

    static

   public class Main{
   public static void main (String[] args) {
      Data user1= new Data(12,"Abi"); 
      Data user2= new Data(13,"bob"); 
      Data user3= new Data(14,"alice"); 
      Data.show();
   } 
}
class Data{
    int roll;
   String name;// each time memory allocation
static  String clgName="VSB";//one time memory allocation till the end
   
    Data(int r , String n){
        roll=r;
       name = n;
    }
    void show(){
      System.out.println(roll+"\n"+name+"\n"+clgName);
    }
    Data(){}
}

public class Main{
    int h=12;
   public static void main (String[] args) {
   one o = new one();
   o.show();// non static method need object creation to invoke them
   two.dis();// static method wont ask for object to invoke
int c=two.a;//static property/variable wont ask for object to invoke
int req= h; // static method only access another static method/ variable
   } 
}
class one{
     void show(){
        System.out.println("Hello");
    }
}
class two{
 static  String a= "World";
    static void dis(){ 
        System.out.println("Hi"+ a);
    }
}