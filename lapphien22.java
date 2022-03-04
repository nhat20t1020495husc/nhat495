import java.util.Scanner;
public class lapphien22 {
    
public static void main(String [] args){
        Scanner bt=new Scanner(System.in);
        try
        {  
            System.out.println("Nhap a = ");
            int a=bt.nextInt();
            double s=1;
           for (int i=1;i<=a;i++)
           {
               s*=i;
            if (i<a)   System.out.print(i+"*");
            if (i==a) System.out.print(i);
           }
            System.out.println(" = "+s);
        } catch(Exception e)
        {
            System.out.println("Loi nhap !!!");
        }
                 
    }
}

