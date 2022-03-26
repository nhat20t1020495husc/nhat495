
package laptrinhhuongdoituong;
public class taxmanagement {

    public static void main(String[] args) {
     
     Student a=new Student("Hoai Nhan","75k1","0341346078","20T1049782@gmail.com","23/10/2001","Nam","O");
     Worker b=new Worker("ChauGiang","47f1","02347899456","giangchau20@gmail.com",4000000,50000,"3/6/2005","Nu","O");
     BusinessPerson c=new BusinessPerson("Nhat Quang","61h2","04567812656","nhatquang45@gmail.com",50000,45000,60000,"8/5/1995","Nam","AB");
     System.out.println("\n===Thong tin hoc sinh===\n");
     System.out.println(a+",Ngay sinh="+a.getNgay()+",Gioi tinh="+a.getSex()+",Nhom mau="+a.getMau()+"}");
     System.out.println("\n===Thong tin nguoi lam viec===\n");   
     System.out.println(b+",Ngay sinh="+b.getNgay()+",Gioi tinh ="+b.getSex()+",Nhom mau="+b.getMau()+"}");
     System.out.println("\nMuc thue phai dong la : "+b.paytax(4000000,2,4));
     System.out.println("\n===Thong tin doanh nhan===\n");
     System.out.println(c+",Ngay sinh="+c.getNgay()+",Gioi tinh ="+c.getSex()+",Nhom mau="+c.getMau()+"}");
     System.out.println("\nMuc thue phai dong la : "+c.paytax(12000000,9,18));

    }
    
}
