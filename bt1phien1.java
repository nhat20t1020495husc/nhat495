import java.util.Scanner;
public class bt1phien1 {
    public static void main(String [] args){
        Scanner bt=new Scanner(System.in);
        try
        {  
            System.out.println("Nhap so can xet :   ");
            int a=bt.nextInt();
            if (a>0) System.out.println(" Number is positive ");
            else 
                if (a<0) System.out.println(" Number is negative ");
                else 
                    System.out.println(" Number is not a positive integer, is not a positive integer ");
        } catch(Exception e)
        {
            System.out.println("Loi nhap !!!");
        }
                 
    }
}
