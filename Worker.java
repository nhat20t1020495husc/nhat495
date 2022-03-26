
package laptrinhhuongdoituong;

public class Worker extends Person {
   String name,citizenID,phone,email;
   double luong,order_income;

    public Worker(String name, String citizenID, String phone, String email, double luong, double order_income) {
        this.name = name;
        this.citizenID = citizenID;
        this.phone = phone;
        this.email = email;
        this.luong = luong;
        this.order_income = order_income;
    }

    public Worker(String name, String citizenID, String phone, String email, double luong, double order_income, String ngay, String sex, String mau) {
        super(ngay, sex, mau);
        this.name = name;
        this.citizenID = citizenID;
        this.phone = phone;
        this.email = email;
        this.luong = luong;
        this.order_income = order_income;
    }

    public String getName() {
        return name;
    }

    public String getCitizenID() {
        return citizenID;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public double getLuong() {
        return luong;
    }

    public double getOrder_income() {
        return order_income;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCitizenID(String citizenID) {
        this.citizenID = citizenID;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void setOrder_income(double order_income) {
        this.order_income = order_income;
    }

    @Override
    public String toString() {
        return "Worker{" + "name=" + name + ", citizenID=" + citizenID + ", phone=" + phone + ", email=" + email + ", luong=" + luong + ", order_income=" + order_income + '}';
    }

    public Worker() {
    }
    public double paytax(double a,int start,int end)
    {
        if (a>150) return 0.01*a*(end-start);
        return 0;
    }
}
