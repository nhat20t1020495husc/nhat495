import java.util.Scanner;
public class lapphien27 {
    
public static void main(String [] args){
        Scanner bt=new Scanner(System.in);
        try
        {  
           int a,s=0;
           do
           {
            System.out.println("Nhap a = ");
             a=bt.nextInt();
           }while (a<0);
           while (a!=0)
           {
             s+=a%10;
             a/=10;
           }
           System.out.println("Tong cac chu so la : "+s);
        } catch(Exception e)
        {
            System.out.println("Loi nhap !!!");
        }
                 
    }
}

