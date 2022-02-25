import java.util.Scanner;
public class silde24 {
public static void main (String []args){
        Scanner n=new Scanner (System.in);
        try {
            System.out.println("Nhap A = ");
            int a =n.nextInt();
            System.out.println("Nhap B = ");
            int b=n.nextInt();
            while(true)
            {
                if (a>=b)
            {
                System.out.println("Nhap ket qua c = ");
                int c=n.nextInt();
                if (c==a-b) System.out.println("TRUE !");
                else System.out.println("FALSE!");
                break;
            }
                else
                {   System.out.println("Nhap sai! Hay nhap lai ");
                    System.out.println("Nhap lai A = ");
                    a=n.nextInt();
                   System.out.println("Nhap lai B = ");
                    b=n.nextInt();
                }
            }
        } catch(Exception e)
        {
            System.out.println("Loi nhap !!!");
        }
    }

}
