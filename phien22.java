import java.util.Scanner;
public class phien22 {
public static void main(String [] args){
        Scanner bt=new Scanner(System.in);
        try
        {  
            double  inch; 
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("Nhap so inch can doi : ");
    inch = scanner.nextDouble();
         
    
    double met = (double) inch*2.54*0.01;
    System.out.println(inch + " inch= " + met+ " m"); 
        } catch(Exception e)
        {
            System.out.println("Loi nhap !!!");
        }
                 
    }
}