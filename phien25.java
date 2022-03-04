import java.util.Scanner;
public class phien25 {
 public static void main(String [] args){
        Scanner bt=new Scanner(System.in);
        try
        {  
        int a,b,c,d;
        
           do
           { System.out.println("- Nhap khoang cach  : ");
           d=bt.nextInt();
            System.out.println("- Nhap so gio  : ");
           a=bt.nextInt();
           System.out.println("- Nhap so phut  : ");
           b=bt.nextInt();
            System.out.println("- Nhap so giay : ");
           c=bt.nextInt();
           } while (a<0 ||b<0||c<0 ||d<0);
           double s=a*3600+b*60+c;
          
           System.out.println("Your speed in meters/second is " +(float)(d/s) );
           System.out.println("Your speed in km/h is " +(float)((d/s)*3.6) );
        } catch(Exception e)
        {
            System.out.println("Loi nhap !!!");
        }
                 
    }
}

