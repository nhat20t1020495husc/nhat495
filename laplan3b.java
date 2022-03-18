import java.util.Scanner;
public class laplan3b {
    public static void main (String []args)
    {   
         long S=1,T=1;
         int n;
          Scanner bt=new Scanner(System.in);
       do{

        System.out.println("Nhap N : ");
         n=bt.nextInt();
       } while(n<0);
        if(n%2==0)
        for (int i=2;i<=n;i=i+2)
        {
             S*=i;  
        }
        else
        for (int i=1;i<=n;i=i+2)
        {
            T*=i;
        }
     System.out.println("Tich cac so chan la : " +S);
        
     System.out.println("Tich  cac so le la : " +T);
     
    
     
    }
}
