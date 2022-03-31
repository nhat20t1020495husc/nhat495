
package cau2;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class StudentDS {

    public static void main(String[] args) throws IOException {
       Scanner ds=new Scanner(System.in);
         System.out.println("- Nhap so luong sinh vien :");
         int n=ds.nextInt();
        Student []a=new Student[n];
         System.out.println("\n===\tNhap sinh vien\t===\n");
         
         for (int i=0;i<n;i++)
         {   System.out.println("\tNhap sinh vien thu "+(i+1)+"\t");
             a[i]=new Student();
             a[i].nhapsv();
             System.out.println("\n======\n");
          }
           System.out.println("\n===\tXuat sinh vien\t===\n");
         for (int i=0;i<n;i++)
         {  System.out.println("\tSinh vien thu "+(i+1)+"\t");
             a[i].xuatsv();
             System.out.println("\n------\n");
         }
         
       Arrays.sort(a,(o1, o2) -> o2.compareto(o1));
         System.out.println("\n===\tSau khi sap xep\t===\n");
            for(int i=0;i<n;i++)
            {
                a[i].xuatsv();
                System.out.println("\n------\n");
            }
        for (int i = 0; i < n; i++) {
            FileOutputStream fout=new FileOutputStream("luufile.txt");    
           try (ObjectOutputStream out = new ObjectOutputStream(fout)) {
               out.writeObject(a[i]);
               out.flush();
           }catch(Exception e)    
           {
               System.out.println("success");  
           }
            
        }
    }
    }

