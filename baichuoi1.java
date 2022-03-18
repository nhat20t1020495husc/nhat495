import java.util.Scanner;
public class baichuoi1 {
    public static void main(String []args){
        Scanner bt=new Scanner(System.in);
        System.out.println(" - Nhap chuoi : ");
        String s=bt.nextLine();
        
        s=s.replaceAll(" ","");
        System.out.println(" - Chuoi sau khi xoa het khoang trong : ");
        System.out.println(s);
    }
}
