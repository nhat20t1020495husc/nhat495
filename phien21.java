import java.util.Scanner;
public class phien21 {
 public static void main(String [] args){
        Scanner bt=new Scanner(System.in);
        try
        {  
            double  fahrenheit; 
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("Nhap vao do fahrenheit can doi : ");
    fahrenheit = scanner.nextDouble();
         
    
    double celsius = (double) 5/9 * (fahrenheit -32);
    System.out.println(fahrenheit + " do F = " + celsius + " do C"); 
        } catch(Exception e)
        {
            System.out.println("Loi nhap !!!");
        }
                 
    }
}
