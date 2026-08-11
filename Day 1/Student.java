public class Student {
    int age;
    String name;
    String designation;
    Student (age, name, designation)
    {
        this.age= age;
        this.name= name;
        this.designation=designation;
    }
    public static void main(String[] args) {
        Student s1 = new Student(24, "Ishika", "Engineer");
        System.out.println(s1);
    }
}
