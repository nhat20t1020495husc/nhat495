import java.util.Scanner;
public class bt5phien5 {
public static void main(String [] args){
        Scanner bt=new Scanner(System.in);
        try
        {  
              System.out.println("Nhap a = ");
              float a=bt.nextFloat();
              System.out.println("Nhap b = ");
              float b=bt.nextFloat();
            if ((a%1000)==(b%1000))
                System.out.println("Bang nhau ");
            else
            System.out.println("Khac nhau ");
        }
        catch(Exception e)
        {
            System.out.println("Loi nhap !!!");
        }
              
}
}