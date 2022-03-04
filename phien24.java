import java.util.Scanner;
public class phien24 {
public static void main(String [] args){
        Scanner bt=new Scanner(System.in);
        try
        {  
        int a;
           do
           {
            System.out.println("- Nhap so phut can doi : ");
           a=bt.nextInt();
          
           } while (a<0);
          
           System.out.println(a+" minutes is approximately "+a/(24*60*365)+" years and "+(a/(24*60))%365    +" days"  );
        } catch(Exception e)
        {
            System.out.println("Loi nhap !!!");
        }
                 
    }
}
