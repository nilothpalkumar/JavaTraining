public class Student
{
    private int studentId;
    private String name;
    private int age;
    private char grade;

    public int getStudentId()
    {
        return studentId;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public int getGrade()
    {
        return grade;
    }

    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setGrade(char grade)
    {
        this.grade = grade;
    }

    public void display()
    {
        System.out.println(studentId);
        System.out.println(name);
        System.out.println(age);
        System.out.println(grade);

    }
}
