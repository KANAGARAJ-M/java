import java.util.*;

class Laptop{
    int port,ram,usb,power,ethernet,typec;
    String processor,graphics,graphics_type,display;
    
    Laptop(String pro,String gra,String grat,String disp){
        processor =pro;
        graphics = gra;
        graphics_type=grat;
        display = disp;
    }
    Laptop(){
        ram=34;
        usb =2;
        power=2;
        ethernet=1;
        typec=3;
    }
    Laptop(String pr,String gr,String gar,String dis, int r,int u,int p, int e, int tc){
        processor=pr;
        graphics=gr;
        graphics_type=gar;
        display = dis;
        ram=r;
        usb=u;
        power=p;
        ethernet=e;
        typec=tc;
    }
    
    void about(){
        System.out.println("We have "+processor+" Processor");
        System.out.println("Ram :"+ram);
        System.out.println("Graphics :"+graphics);
        System.out.println("Graphics Card :"+graphics_type);
        System.out.println("Display :"+display);
        System.out.println("Usb Ports :"+usb);
        System.out.println("Power Port :"+power);
        System.out.println("Ethernet Port :"+ethernet);
        System.out.println("Type - C Port :"+typec);
        
    }
}