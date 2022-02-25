
import java.util.Scanner;
public class baitap10 {
    public static void main(String []args) {
        Scanner bt=new Scanner(System.in);
       try 
       {
           System.out.println("Nhap ten nguoi dung : ");
           String a=bt.nextLine();
           System.out.println("Nhap mat khau : ");
           String b=bt.nextLine();
           
           if ("HuyHoang".equals(a) && "2021".equals(b) ) {
               System.out.println("Dang nhap thanh cong !");
           }
           else
           {
               if (!"HuyHoang".equals(a)) System.out.println("Sai ten nguoi dung !!");
               if ("HuyHoang".equals(a) && !"2021".equals(b)) System.out.println("Sai mat khau !");
           }
       }catch(Exception e)
       {
           System.out.println("Loi sai !!");
       }
    }
       
}