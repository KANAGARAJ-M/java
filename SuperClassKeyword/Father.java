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