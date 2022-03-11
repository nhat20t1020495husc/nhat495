
import java.util.Scanner;
import java.util.Random;
public class bt4 {
    public static void b4a(int a[],int n)
    {
         Random rand=new Random();
        for (int i=0;i<n;i++)
        {  
           a[i]=rand.nextInt(50);
         }
        for (int i=0;i<n;i++)
        System.out.println("Gia tri a["+i+"] = "+a[i]);
    }
        
    public static void b4b(int a[],int n)
     {
         Scanner bt=new Scanner(System.in);
        for (int i=0;i<n;i++)
        {  
            System.out.println("Nhap gia tri a["+i+"] = ");
            a[i]=bt.nextInt();
         }
       
     }
    public static void b4c(int a[],int n){
        
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
    
      public static void b4d(int a[],int n){
          
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
       public static int b4e(int a[],int n,int so)
     {
         for (int i=0;i<n;i++)
         {
             if (a[i]==so)
                 return i+1;
         }
         return -1;
     }
          public static void b4f(int a[],int n,int so)
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
       
 
        b4a(a,n);
        b4b(a,n);
        System.out.println("==Bai 4b==");
         xuatmang(a,n);
         System.out.println("==Bai 4c=="); 
         b4c(a,n);
         System.out.println("==Bai 4d=="); 
         b4d(a,n);
         System.out.println("==Bai 4e=="); 
         System.out.println("Gia tri can tim kiem : ");
        int b=bt.nextInt();
        System.out.println("Vi tri dau tien la :"+b4e(a,n,b));
        System.out.println("==Bai 4f=="); 
         System.out.println("Gia tri can tim kiem : ");
        int d=bt.nextInt();
        b4f(a,n,d/*);*/
         
    }
   
}


/*
