import java.util.Scanner;
public class bt4phien4 {
 public static void main(String [] args){
        Scanner bt=new Scanner(System.in);
        try
        {  int a;
            do
            {
              System.out.println("Nhap a : ");
               a=bt.nextInt();
            }while (a<0);
            int d=a%7;
             switch(d)
            {
                case 1:  System.out.println("Thu hai") ;
                break;
                case 2:  System.out.println("Thu ba") ;
                break;
                case 3:  System.out.println("Thu tu") ;
                break;
                case 4:  System.out.println("Thu nam") ;
                break;
                case 5:  System.out.println("Thu sau") ;
                break;
                case 6:  System.out.println("Thu bay") ;        
                break;
                case 0:  System.out.println("Chu nhat") ;
                break;
                
                
            }
        }
        catch(Exception e)
        {
            System.out.println("Loi nhap !!!");
        }
              
}
}
