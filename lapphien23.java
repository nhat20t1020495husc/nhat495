import java.util.Scanner;
public class lapphien23 {
    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
 
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }

    public static void main(String[] args) {
     Scanner bt=new Scanner (System.in);
       try{ 
          System.out.println("Nhap n = ");
          int n=bt.nextInt();
           for (int i=0;i<=n;i++)
             System.out.println(fibonacci(i)) ;
               
             
    
} catch(Exception e)
    {
        System.out.println("Loi nhap!!");
    }
    
    }
    
}
