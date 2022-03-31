
package cau1;
import java.util.Scanner;
public class Person {
    String ten;
    char gt;
    int namsinh;

    public Person() {
    }

    public Person(String ten, char gt, int namsinh) {
        this.ten = ten;
        this.gt = gt;
        this.namsinh = namsinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGt(char gt) {
        this.gt = gt;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public char getGt() {
        return gt;
    }

    public int getNamsinh() {
        return namsinh;
    }

    @Override
    public String toString() {
        return "Person{" + "ten=" + ten + ", gt=" + gt + ", namsinh=" + namsinh + '}';
    }
    public void nhap()
    {
      Scanner c1=new Scanner(System.in);
      System.out.println("- Nhap ten : ");
      ten=c1.nextLine();
      System.out.println("- Nhap gioi tinh(1-Nam ,2-Nu): ");
      gt=c1.next().charAt(gt);
      System.out.println("- Nhap nam sinh : ");
      namsinh=c1.nextInt();
      
    }
    public void xuat()
    {  
        System.out.println("+ Ten :"+ten);
       if(gt=='1') System.out.println("- Gioi tinh : Nam ");
       else 
           System.out.println("+ Gioi tinh : Nu ");
        System.out.println("+ Nam sinh :"+namsinh);
    }
            
}
