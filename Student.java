
package cau1;
import java.util.Scanner;
public class Student  extends Person{
    String ID;
    int nam_nhaphoc;

    public Student() {
    }

    public Student(String ID, int nam_nhaphoc) {
        this.ID = ID;
        this.nam_nhaphoc = nam_nhaphoc;
    }

    public Student(String ID, int nam_nhaphoc, String ten, char gt, int namsinh) {
        super(ten, gt, namsinh);
        this.ID = ID;
        this.nam_nhaphoc = nam_nhaphoc;
    }

    public String getID() {
        return ID;
    }

    public int getNam_nhaphoc() {
        return nam_nhaphoc;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNam_nhaphoc(int nam_nhaphoc) {
        this.nam_nhaphoc = nam_nhaphoc;
    }
    public void nhapHS()
    {  Scanner c1=new Scanner(System.in);
        nhap();
        System.out.println("- Nhap studentID : ");
      ID=c1.nextLine();
      System.out.println("- Nhap nam nhap hoc : ");
      nam_nhaphoc=c1.nextInt();
    }
    public void xuatHS()
    {
        xuat();
        System.out.println("+ StudentID :"+ID);
        System.out.println("+ Nam nhap hoc  :"+nam_nhaphoc);
    }
    public int timkiemtheoten(String a)
    {  
        if (a.equals(this.getTen()))
            return 1;
        else
            return 0;
    }
    public void timkiemnamsinh(int a)
    {
       
        if (a==this.getNamsinh())
            System.out.println(this);
    }
}
