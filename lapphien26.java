import java.util.Scanner;
public class lapphien26 {
    
public static boolean SNT(int n) {
        
        if (n < 2) {
            return false;
        }
        
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
      Scanner bt=new Scanner (System.in);
       try{ 
           for (int i=10000;i<=99999;i++)
               if (SNT(i)) 
               {
                   System.out.print("  "+i);
               }
               
             
    
} catch(Exception e)
    {
        System.out.println("Loi nhap!!");
    }
    
    }
}
