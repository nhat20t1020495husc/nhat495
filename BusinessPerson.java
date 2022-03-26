
package laptrinhhuongdoituong;
public class BusinessPerson extends Person{
    String name,citizenID,phone,email;
    double luong,business_income,other_income;

    public BusinessPerson() {
    }

    public BusinessPerson(String name, String citizenID, String phone, String email, double luong, double business_income, double other_income) {
        this.name = name;
        this.citizenID = citizenID;
        this.phone = phone;
        this.email = email;
        this.luong = luong;
        this.business_income = business_income;
        this.other_income = other_income;
    }

    public BusinessPerson(String name, String citizenID, String phone, String email, double luong, double business_income, double other_income, String ngay, String sex, String mau) {
        super(ngay, sex, mau);
        this.name = name;
        this.citizenID = citizenID;
        this.phone = phone;
        this.email = email;
        this.luong = luong;
        this.business_income = business_income;
        this.other_income = other_income;
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

    public double getBusiness_income() {
        return business_income;
    }

    public double getOther_income() {
        return other_income;
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

    public void setBusiness_income(double business_income) {
        this.business_income = business_income;
    }

    public void setOther_income(double other_income) {
        this.other_income = other_income;
    }
    public double paytax(double a,int b,int c)
    {
        if (a>500) return  0.03*a*(c-b);
        else
            if (a>100) return 0.02*a*(c-b);
            else return 0;
    }

    @Override
    public String toString() {
        return "BusinessPerson{" + "name=" + name + ", citizenID=" + citizenID + ", phone=" + phone + ", email=" + email + ", luong=" + luong + ", business_income=" + business_income + ", other_income=" + other_income + '}';
    }
    
}
