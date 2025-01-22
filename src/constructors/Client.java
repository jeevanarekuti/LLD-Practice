package constructors;


public class Client {
    public static void main(String[] args) throws Exception {
        University university = new University("KU","Lawrence");
        Student student = new Student("Jeevan",25,"Male", university);
        Student student2 = new Student(student);

//        For primitive DataTypes their is no need for copying the address but
//        for non primitive data types we must allocate new memory


        System.out.println(student.getName());
        System.out.println(student2);
        student2.setName("Gopi");
        System.out.println(student);
        System.out.println(student.getName());
        System.out.println(student2.getUniversiry().getUniversity());
        student2.getUniversiry().setUniversity("KLU");
        System.out.println(student.getUniversiry());
        System.out.println(student.getUniversiry().getUniversity());

        System.out.println(student2.getUniversiry().getUniversity());

    }
}
