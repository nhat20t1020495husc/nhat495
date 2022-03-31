
package cau2;


import java.util.Scanner;
import java.io.Serializable;

public class Person implements Serializable,Comparable<Person>,Cloneable{
    String name;
    char gender;
    int namsinh;

    @Override
    public int compareTo(Person o) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public Person() {
    }

    public Person(String name, char gender, int namsinh) {
        this.name = name;
        this.gender = gender;
        this.namsinh = namsinh;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
    void nhap(){
     Scanner bt=new Scanner(System.in);
        System.out.println("- Nhap ten : ");
        name=bt.nextLine();
        System.out.println("- Nhap gioi tinh(1-Nam ,2-Nu): ");
        gender=bt.next().charAt(gender);
        System.out.println("- Nhap nam sinh : ");
        namsinh=bt.nextInt();
    }
    void xuat(){
        System.out.println("+ Ten : "+name);
        if(gender=='1') System.out.println("- Gioi tinh : Nam ");
        else 
           System.out.println("+ Gioi tinh : Nu ");
        
        System.out.println("+ Nam sinh : "+namsinh);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", gender=" + gender + ", namsinh=" + namsinh + '}';
    }
    
}

