
import java.util.Scanner;
import java.util.Random;
public class bt3 {
    public static void b3a(int a[],int n)
    {
         Random rand=new Random();
        for (int i=0;i<n;i++)
        {  
           a[i]=rand.nextInt(50);
         }
        for (int i=0;i<n;i++)
        System.out.println("Gia tri a["+i+"] = "+a[i]);
    }
        
    public static void b3b(int a[],int n)
     {
         Scanner bt=new Scanner(System.in);
        for (int i=0;i<n;i++)
        {  
            System.out.println("Nhap gia tri a["+i+"] = ");
            a[i]=bt.nextInt();
         }
       
     }
    public static void b3c(int a[],int n){
        
        for (int i=0;i<n-1;i++)
             for (int j=i+1;j<n;j++)
                 if (a[i]>a[j])
                 {
                   int  temp=a[i];
                     a[i]=a[j];
                    a[j]=temp;
                 }
        xuatmang(a,n);
    }
    public static void xuatmang(int a[],int n)
    {
         for (int i=0;i<n;i++)
        System.out.println("Gia tri a["+i+"] = "+a[i]);
        
    }
    
      public static void b3d(int a[],int n){
          
        for (int i=0;i<n-1;i++)
             for (int j=i+1;j<n;j++)
                 if (a[i]<a[j])
                 {
                      int temp=a[i];
                     a[i]=a[j];
                     a[j]=temp;
                 }
        xuatmang(a,n);
    }
            
    
    public static void main(String []args)
    {
        
        Scanner bt=new Scanner(System.in);
        System.out.println("Nhap so luong phan tu : ");
        int n=bt.nextInt();
        int a[]=new int [n];
       
 
        b3a(a,n);
        b3b(a,n);
        System.out.println("==Bai 3b==");
         xuatmang(a,n);
         System.out.println("==Bai 3c=="); 
         b3c(a,n);
         System.out.println("==Bai 3d=="); 
         b3d(a,n);
         
    }
   
}


/*
