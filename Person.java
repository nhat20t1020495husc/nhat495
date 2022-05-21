
import java.util.Comparator;
import java.util.Date;


public abstract class Person {
    String name;
    Date birthday;
    String gender;

    public Person() {
    }

    public Person(String name, Date birthday, String gender) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", birthday=" + birthday + ", gender=" + gender + '}';
    }

   
   

    
   

   
}
