import java.util.Scanner;

public class baichuoi6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
                System.out.println("Nhap vao 1 chuoi ky tu:");
		String s = sc.nextLine();
                System.out.println("Nhap vao ky tu :");
                char d=sc.next().charAt(0);
                char []a=s.toCharArray();
                int sl=0;
		for (int i=0;i<a.length;i++)
                {
                    if (a[i]==d) sl++;
                }
                for (int i=0;i<a.length;i++)
                
                    if (a[i]==d) System.out.println("Vi tri :" +i);
 
       
        System.out.println("So luong  :" +sl );
          System.out.println("Ky tu  :" +d );
}
}