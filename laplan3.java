import java.util.Scanner;
public class laplan3 {
    public static void main (String []args)
    {   
         long S=0,T=0,M=0;
         int n;
          Scanner bt=new Scanner(System.in);
       do{
         
        System.out.println("Nhap N : ");
         n=bt.nextInt();
       } while(n<0);

        for (int i=1;i<=n;i++)
        {
            if (i%2==0) S+=i;
            else T+=i;
        }
      
        for (int i=1;i<=n;i++)
        {
             M+=1/i;
        }
     System.out.println("Tong cac so chan la : " +S);
        
     System.out.println("Tong cac so le la : " +T);
     
     System.out.println("Tong cac so  la : " +M);
     
    }
}
