public class Student {
    int age;
    String name;
    String designation;
    Student (int age, String name, String designation)
    {
        this.age= age;
        this.name= name;
        this.designation=designation;
    }
    public static void main(String[] args) {
        Student s1 = new Student(24, "Ishika", "Engineer");
        //printing just s1 will print the memory address of the object
        System.out.println(s1.name + "is of age" + " "+s1.age +"and is an"+" "+s1.designation);
    }

    }

