package constructors;

public class Student {
    private String name;
    private int age;
    private String gender;
    private University university;

    protected Student(String name, int age, String gender, University university) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.university = university;
    }

    public University getUniversiry() {
        return university;
    }

    public void setUniversiry(University university) {
        this.university = university;
    }

    protected Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.gender = s.gender;
        this.university = new University(s.getUniversiry().getUniversity(), s.getUniversiry().getUniversity());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
