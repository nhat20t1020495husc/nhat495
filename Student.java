

import java.io.Serializable;



import java.util.Date;


public  class Student extends Person implements Serializable{
  String studentID,major;
  Date enrolledDate;

    public Student() {
    }

    public Student(String studentID, String major, Date enrolledDate) {
        this.studentID = studentID;
        this.major = major;
        this.enrolledDate = enrolledDate;
    }

    public Student(String studentID, String major, Date enrolledDate, String name, Date birthday,String gender) {
        super(name, birthday, gender);
        this.studentID = studentID;
        this.major = major;
        this.enrolledDate = enrolledDate;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Date getEnrolledDate() {
        return enrolledDate;
    }

    public void setEnrolledDate(Date enrolledDate) {
        this.enrolledDate = enrolledDate;
    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", major=" + major + ", enrolledDate=" + enrolledDate + '}';
    }

   

   


  
}
