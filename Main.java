import java.util.*;
import Laptop.*;

public class Main{
    public static void main(String[] args){
        
        Laptop acer = new Laptop("I5 12th Gen","Nvidia","GTX2090","OLED 144HZ");
        acer.ram=16;
        acer.usb=1;
        acer.power=1;
        acer.ethernet=0;
        acer.typec=0;
        Laptop asus = new Laptop("AMD RYZEN 7 7200Series","Nvidia","RTX4080","OLED 240HZ",42,4,3,1,2);
        Laptop default1=new Laptop();
        System.out.println("------------------*------------------");
        System.out.println();
        System.out.println("Acer");
        System.out.println();
        System.out.println("------------------*------------------");
        acer.about();
        
        System.out.println("------------------*------------------");
        System.out.println();
        System.out.println("ASUS");
        System.out.println();
        System.out.println("------------------*------------------");
        asus.about();

        System.out.println("------------------*------------------");
        System.out.println();
        System.out.println("DEFAULT");
        System.out.println();
        System.out.println("------------------*------------------");
        default1.about();
        
    }
}



