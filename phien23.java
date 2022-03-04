import java.util.Scanner;
public class phien23 {
 public static void main(String [] args){
        Scanner bt=new Scanner(System.in);
        try
        {   
            int a,b;
           do
           {
            System.out.println("- Nhap a = ");
           a=bt.nextInt();
            b=a;
           } while (a<0 || a>1000);
           int s=0;
           while (a!=0)
           {
               s+=a%10;
               a/=10;
           }
           System.out.println("Tong cac chu so cua  " +b+ " la " +s);
        } catch(Exception e)
        {
            System.out.println("Loi nhap !!!");
        }
                 
    }
}
