public class Main {
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setStudentId(1234);
        s1.setAge(22);
        s1.setName("Nilothpal");
        s1.setGrade('A');

        s2.setStudentId(3214);
        s2.setAge(21);
        s2.setName("Nil");
        s2.setGrade('B');

        s3.setStudentId(4321);
        s3.setAge(20);
        s3.setName("Aryan");
        s3.setGrade('C');

        s1.display();
        System.out.println();
        s2.display();
        System.out.println();
        s3.display();



    }
}