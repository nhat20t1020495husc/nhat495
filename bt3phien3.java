import java.util.Scanner;
public class bt3phien3 {
     public static void main(String [] args){
        Scanner bt=new Scanner(System.in);
        try
        {  
            System.out.println("Nhap so : ");
            float a=bt.nextFloat();
            if (a==0) System.out.print("ZERO");
            else 
                if (a<0) System.out.print("Negative Number ");
                else
                    System.out.print("Positive Number ");
            if (Math.abs(a)<1) System.out.print("- Small ");
            if (Math.abs(a)>1000000) System.out.print("- Large ");
        }
        catch(Exception e)
        {
            System.out.println("Loi nhap !!!");
        }
              
}
}
