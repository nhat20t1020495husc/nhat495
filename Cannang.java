import java.util.Scanner;
public class Cannang {
    public static void main(String []args){
        Scanner bmi= new Scanner  (System.in);
        try{
            System.out.println("Nhap can nang : ");
            float a=bmi.nextFloat();
            if (0<a && a<18.5) System.out.println(" Underweight");
            else if (18.5<=a && a<25) System.out.println(" Normal");
            else if (25<=a && a<30) System.out.println(" Overweight");
            else System.out.println(" Obese");
        } catch(Exception e)
        {
            System.out.println("Loi nhap !!!");
        }
    }
}
