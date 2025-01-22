package constructors;

public class University {
    private String university;
    private String location;

    public University(String university, String location) {
        this.university = university;
        this.location = location;
    }

    public String getUniversity() {
        return university;
    }

    public University setUniversity(String university) {
        this.university = university;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
