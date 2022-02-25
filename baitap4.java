import java.util.Scanner;
public class baitap4 {
    public static void main(String []args){
        Scanner bt=new Scanner(System.in);
        try {
            System.out.println("Nhap ban kinh R = ");
            float a=bt.nextFloat();
            System.out.println("Chu vi hinh tron la : " +(2*a*3.14));
        }
        catch(Exception e) {
            System.out.println("Loi sai !!");
        }
    }
}
