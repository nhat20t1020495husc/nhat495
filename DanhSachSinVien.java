
package cau1;
import java.util.Scanner;

public class DanhSachSinVien {

    public static void main(String[] args) {
       Scanner ds=new Scanner(System.in);
        
         System.out.println("- Nhap so luong sinh vien :");
         int n=ds.nextInt();
         int y;
         
         Student []a=new Student[n];
         System.out.println("\n===\tNhap sinh vien\t===\n");
         
         for (int i=0;i<n;i++)
         {   System.out.println("\tNhap sinh vien thu "+(i+1)+"\t");
             a[i]=new Student();
             a[i].nhapHS();
             System.out.println("\n======\n");
         }
          System.out.println("\n===\tXuat sinh vien\t===\n");
         for (int i=0;i<n;i++)
         {  System.out.println("\tSinh vien thu "+(i+1)+"\t");
             a[i].xuatHS();
             System.out.println("\n------\n");
         }
         
           System.out.println("\n===\tTim kiem theo ten\t===");
           System.out.println("- Nhap ten can tim kiem ");
            
            ds.nextLine ();
          String s = ds.nextLine ();
           for (int i=0;i<n;i++)
           {
               if (a[i].timkiemtheoten(s)==1)
                   a[i].xuatHS();
           }
            System.out.println("\n===\tTim kiem theo nam sinh\t===\n");
            System.out.println("- Nhap nam sinh can tim kiem ")  ;
         y=ds.nextInt();
           for (int i=0;i<n;i++)
           {
               a[i].timkiemnamsinh(y);
           }
    }
    
}
