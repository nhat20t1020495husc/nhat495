
import java.util.Scanner;
import java.util.Random;
public class bt2 {
    public static void b2a(int a[],int n)
    {
         Random rand=new Random();
        for (int i=0;i<n;i++)
        {  
           a[i]=rand.nextInt(50);
         }
        for (int i=0;i<n;i++)
        System.out.println("Gia tri a["+i+"] = "+a[i]);
    }
        
    public static void b2b(int a[],int n,int so)
     {  int c=0;
         for (int i=0;i<n;i++)
         {
             if (a[i]==so)
             {
                 System.out.println("Vi tri  :"+(i+1) );
                 c++;
             }       
         }
        if  (c==0) System.out.println("K tim thay so ");
             
     }
    public static void main(String []args)
    {
        Scanner bt=new Scanner(System.in);
        System.out.println("Nhap so luong phan tu : ");
        int n=bt.nextInt();
        int a[]=new int [n];

        b2a(a,n);
        System.out.println("Gia tri can tim kiem : ");
        int b=bt.nextInt();
        b2b(a,n,b);
    }
}


