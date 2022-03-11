
import java.util.Scanner;
import java.util.Random;
public class bt1 {
    public static void b1a(int a[],int n)
    {
         Random rand=new Random();
        for (int i=0;i<n;i++)
        {  
           a[i]=rand.nextInt(50);
         }
        for (int i=0;i<n;i++)
        System.out.println("Gia tri a["+i+"] = "+a[i]);
    }
        
    public static int b1b(int a[],int n,int so)
     {
         for (int i=0;i<n;i++)
         {
             if (a[i]==so)
                 return i+1;
         }
         return -1;
     }
    public static void main(String []args)
    {
        Scanner bt=new Scanner(System.in);
        System.out.println("Nhap so luong phan tu : ");
        int n=bt.nextInt();
        int a[]=new int [n];

        b1a(a,n);
        System.out.println("Gia tri can tim kiem : ");
        int b=bt.nextInt();
         System.out.println("Gia tri can tim kiem  nam o vi tri  : "+b1b(a,n,b));
    }
}


