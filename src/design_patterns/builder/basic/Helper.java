package design_patterns.builder.basic;

public class Helper {
     String name;
     int age;
     String gender;
     String university;
     String major;
     float gpa;
     boolean placed;
     long phoneNumber;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void setPlaced(boolean placed) {
        this.placed = placed;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
