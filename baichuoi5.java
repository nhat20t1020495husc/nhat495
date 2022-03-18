import java.util.Scanner;
public class baichuoi5 {
  public static void Demkytu(String str)
    {
        int counter[] = new int[256];
        int len = str.length();
        for (int i = 0; i < len; i++)
            counter[str.charAt(i)]++;
        char array[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            array[i] = str.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == array[j])
                    flag++;
            }
            if (flag == 1)
                System.out.println("So lan xuat hien " + str.charAt(i)
                        + " trong chuoi:" + counter[str.charAt(i)]);
        }
    }
    public static void main(String[] args)
    {
    Scanner input=new Scanner(System.in);
     System.out.println("Nhap vao 1 chuoi ky tu:");
     String s=input.next();
     System.out.println("Chuoi la : "+ s);
     Demkytu(s);
    }
}