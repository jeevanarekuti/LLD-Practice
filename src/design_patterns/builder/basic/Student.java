package design_patterns.builder.basic;

public class Student {
     String name;
     float gpa;
     String major;
     boolean placed;
     String university;
     long phoneNumber;
     int age;
     String gender;

    public Student(Helper helper) throws Exception {

        if(helper.age < 18){
            throw new Exception("Age must be above 18");
        }

        this.age = helper.age;
        this.name = helper.name;
        this.gender = helper.gender;
        this.university = helper.university;
        this.placed = helper.placed;
        this.major = helper.major;
        this.phoneNumber = helper.phoneNumber;
        this.gpa = helper.gpa;
    }
}
