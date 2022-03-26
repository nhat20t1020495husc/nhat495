
package laptrinhhuongdoituong;
public abstract class Person {
    String ngay,sex,mau;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" + "ngay=" + ngay + ", sex=" + sex + ", mau=" + mau + '}';
    }

    public Person(String ngay, String sex, String mau) {
        this.ngay = ngay;
        this.sex = sex;
        this.mau = mau;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getNgay() {
        return ngay;
    }

    public String getSex() {
        return sex;
    }

    public String getMau() {
        return mau;
    }
    
}
