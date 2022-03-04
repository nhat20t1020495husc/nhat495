import java.util.Scanner;
public class bt2phien2 {
    public static void main(String [] args){
        Scanner bt=new Scanner(System.in);
        try
        {  
            System.out.println("- Nhap so thu nhat :   ");
            int a=bt.nextInt();
            System.out.println("- Nhap so thu hai :   ");
            int b=bt.nextInt();
            System.out.println("- Nhap so thu ba :   ");
            int c=bt.nextInt();
            int max=a;
            if (b>=a&& b>=c) max=b;
            else 
                if (c>b && c>a) max=c;
            
            System.out.println("So lon nhat la " +max);
}catch(Exception e)
        {
            System.out.println("Loi nhap !!!");
        }
                
    }
}
