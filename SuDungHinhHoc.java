
package InterfaceComparable;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class SuDungHinhHoc {
    public static void main(String[] args) {
     Scanner bt=new Scanner(System.in);
     Random rand=new Random();
       System.out.println("-Nhap so lan lap : ");
         int  n=bt.nextInt();
         double []bk=new double [n];
         double []cd=new double [n];
         double []cr=new double [n];
        Circle []a=new Circle[n];
        Rectangle []b=new Rectangle[n];
        for (int i=0;i<n;i++)
        {  
           bk[i]=rand.nextInt(25);
           cd[i]=rand.nextInt(35);
           cr[i]=rand.nextInt(15);
        }
      
      for(int i=0;i<n;i++)
      {
          a[i]=new Circle(bk[i],"Xanh",true);
          b[i]=new Rectangle(cd[i],cr[i],"Do",false);
      }
      System.out.println("\n\n=====\tHINH TRON\t=====\n\n");
       for(int i=0;i<n;i++)
       {
           bk[i]=a[i].getRadius();
           System.out.println(a[i]);
           System.out.println("Dien tich hinh tron la :" +a[i].getArea());
           System.out.println("Chu vi hinh tron la :" +a[i].getPerimeter());
           System.out.println("\n------\n");
       }
       System.out.println("\n===\tSau khi sap xep\t===\n");
           for(int i=0;i<n-1;i++)
           {
               for(int j=i+1;j<n;j++)
                if (a[i].compareto(a[i])==1)
                {
                    Circle temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                 }         
           }
           System.out.println("\n===\tSau khi sap xep\t===\n");
            for(int i=0;i<n;i++)
               System.out.println(a[i]); 
       System.out.println("\n\n=====\tHINH CHU NHAT\t=====\n\n");
         for(int i=0;i<n;i++)
       {   cd[i]=b[i].getHeight();
           cr[i]=b[i].getWidth();
           System.out.println(b[i]);
           System.out.println("Dien tich hinh chu nhat la :" +b[i].getArea());
           System.out.println("Chu vi hinh chu nhat la :" +b[i].getPerimeter());
           System.out.println("\n+++++++\n");
       }
        
     System.out.println("\n===\tSau khi sap xep\t===\n");
        for(int i=0;i<n-1;i++)
        {
             for(int j=i+1;j<n;j++)
             if (b[i].compareto(b[i])==1)
                {
                    Rectangle temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                 } 
        }
                for(int i=0;i<n;i++)
               System.out.println(b[i]);         
    }
}