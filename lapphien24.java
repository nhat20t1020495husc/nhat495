import java.util.Scanner;
public class lapphien24 {
public static boolean isPrimeNumber(int n) {
        
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
        System.out.println("Nhap n =");
          int n=bt.nextInt();
           for (int i=2;i<=n;i++)
               if (isPrimeNumber(i)) 
               {
                   System.out.print("   "+i);
               }
               
             
    
} catch(Exception e)
    {
        System.out.println("Loi nhap!!");
    }
    
    }
}
