package design_patterns.builder.basic;

public class Client {
    public static void main(String[] args) {
        Helper helper = new Helper();
        helper.setAge(17);
        helper.setGender("male");
        helper.setName("John");
        helper.setMajor("Computer Science");
        helper.setPlaced(true);
        try{
            Student s1 = new Student(helper);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        helper.setAge(18);
        try{
            Student s2 = new Student(helper);
            System.out.println(s2.age);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
