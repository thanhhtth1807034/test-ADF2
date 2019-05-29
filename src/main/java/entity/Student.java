package entity;

public class Student {
    private String EnrolID;
    private String FirstName;
    private String LastName;
    private  int Age;

    public Student() {
    }

    public Student(String enrolID, String firstName, String lastName, int age) {
        EnrolID = enrolID;
        FirstName = firstName;
        LastName = lastName;
        Age = age;
    }

    public String getEnrolID() {
        return EnrolID;
    }

    public void setEnrolID(String enrolID) {
        EnrolID = enrolID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
