
package students;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.lang.Cloneable;
import java.io.Serializable;
public class Students implements Cloneable,Comparable<Students>,Serializable{
  String ten,ngay,sex;
  float dtb,thangdiem;

    public Students() {
    }

    public Students(String ten, String ngay, String sex, double dtb, double thangdiem) {
        this.ten = ten;
        this.ngay = ngay;
        this.sex = sex;
        this.dtb = (float) dtb;
        this.thangdiem = (float) thangdiem;
    }

    public String getTen() {
        return ten;
    }

    public String getNgay() {
        return ngay;
    }

    public String getSex() {
        return sex;
    }

    public Float getDtb() {
        return dtb;
    }

    public Float getThangdiem() {
        return thangdiem;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDtb(Float dtb) {
        this.dtb = dtb;
    }

    public void setThangdiem(Float thangdiem) {
        this.thangdiem = thangdiem;
    }

    @Override
    public String toString() {
        return "Students{" + "ten=" + ten + ", ngay=" + ngay + ", sex=" + sex + ", dtb=" + dtb + ", thangdiem=" + thangdiem + '}';
    }
     
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
    public int compareto(Students st){    
       if(dtb==st.dtb &&thangdiem==st.thangdiem)    
         return 0;    
       else 
           if(dtb>st.dtb ||(dtb==st.dtb && thangdiem>st.thangdiem))    
                return 1;    
           else    
                return -1;    
 }   
    
    public static void main(String[] args)throws CloneNotSupportedException, IOException{
        Students a=new Students("Nhat","20/3/2001","nam",8.6,3.0);
        System.out.println(a);
        Students b=(Students) a.clone();
        System.out.println(b.ten +"\t||" +b.ngay+ "\t||" +b.sex+ "\t||"+ b.dtb+ "\t||"+ b.thangdiem);
        System.out.println(a.compareto(b));
        FileOutputStream fout=new FileOutputStream("f.txt");    
     ObjectOutputStream out=new ObjectOutputStream(fout);    
      out.writeObject(a);    
         out.flush();       
         out.close();    
  System.out.println("success");  
    }

    @Override
    public int compareTo(Students t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

  
}
