import java.util.Scanner;
public class baichuoi7 {
    public static void main(String[] args)
    {
    Scanner input=new Scanner(System.in);
     System.out.println("Nhap vao 1 chuoi ky tu:");
     String s=input.next();
     char []c=s.toCharArray();
     for (int i=c.length-1;i>=0;i--)
     {
         System.out.print(c[i]);
     }
     
    }
}

