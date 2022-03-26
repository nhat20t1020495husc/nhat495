
package laptrinhhuongdoituong;
public class Student extends Person {
    String ten,ID,phone,email;

    public Student(String ten, String ID, String phone, String email, String ngay, String sex, String mau) {
        super(ngay, sex, mau);
        this.ten = ten;
        this.ID = ID;
        this.phone = phone;
        this.email = email;
    }

    public Student() {
    }

    public Student(String ten, String ID, String phone, String email) {
        this.ten = ten;
        this.ID = ID;
        this.phone = phone;
        this.email = email;
    }

    public String getTen() {
        return ten;
    }

    public String getID() {
        return ID;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" + "ten=" + ten + ", ID=" + ID + ", phone=" + phone + ", email=" + email ;
    }
    public double paytax(double a,int b,int c)
    {
        if (a>=11000000)
         return (float) (0.5/100)*a*(c-b);
        return 0;
    }   
}
