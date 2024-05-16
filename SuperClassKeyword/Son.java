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
     //==>   ref(super);//cannot pass (father) class obj like this keyword
    }
}