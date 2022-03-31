
package cau2;

import java.util.Scanner;

public class Student extends Person{
    String ID;
    int nam_nhaphoc;
    float gpa,social_activities;

    public Student() {
    }

    public Student(String ID, int nam_nhaphoc, float gpa, float social_activities) {
        this.ID = ID;
        this.nam_nhaphoc = nam_nhaphoc;
        this.gpa = gpa;
        this.social_activities = social_activities;
    }

    public Student(String ID, int nam_nhaphoc, float gpa, float social_activities, String name, char gender, int namsinh) {
        super(name, gender, namsinh);
        this.ID = ID;
        this.nam_nhaphoc = nam_nhaphoc;
        this.gpa = gpa;
        this.social_activities = social_activities;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNam_nhaphoc(int nam_nhaphoc) {
        this.nam_nhaphoc = nam_nhaphoc;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void setSocial_activities(float social_activities) {
        this.social_activities = social_activities;
    }

    public String getID() {
        return ID;
    }

    public int getNam_nhaphoc() {
        return nam_nhaphoc;
    }

    public float getGpa() {
        return gpa;
    }

    public float getSocial_activities() {
        return social_activities;
    }
    void nhapsv(){
         Scanner bt=new Scanner(System.in);
         nhap();
        System.out.println("- Nhap ma sinh vien : ");
        ID=bt.nextLine();
        System.out.println("- Nhap nam nhap hoc : ");
        nam_nhaphoc=bt.nextInt();
        System.out.println("- Nhap diem trung binh : ");
        gpa=bt.nextFloat();
        System.out.println("- Nhap Social_activities : ");
        social_activities=bt.nextFloat();
        
    }
    void xuatsv(){
        xuat();
         System.out.println("+ Ma sinh vien : "+ID);
        System.out.println("+ Nam nhap hoc : "+nam_nhaphoc);
        System.out.println("+ Diem trung binh : "+gpa);
        System.out.println("+ Socail_activities :"+ social_activities);
    }

    @Override
    public String toString() {
        return "Student{" + "ID=" + ID + ", nam_nhaphoc=" + nam_nhaphoc + ", gpa=" + gpa + ", social_activities=" + social_activities + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
        
    }
    
       public int compareto(Student st){    
       if(gpa==st.gpa && social_activities==st.social_activities)    
         return 0;  
       else
           if (gpa>st.gpa ||(gpa==st.gpa && social_activities>st.social_activities))
              return 1;
          else
              return -1;
      
       
 }   
 }   
    
  

