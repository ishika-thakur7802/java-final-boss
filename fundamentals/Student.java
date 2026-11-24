//Create a Student class with name, age and marks.
//Create three objects and print their details.

class Student {
    String name;
    int age;
    double marks;

    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Raj", 13, 78.0);
        Student s2 = new Student("Rita", 14, 88.0);
        Student s3 = new Student("Maria", 17, 98);

        System.out.println("The names of students are" + " " + s1.name + " " + s2.name + " "+s3.name);
        System.out.println("The ages are" + " " + s1.age + " " + s2.age + " " + s3.age);
        System.out.println("The marks are" + " " + s1.marks + " " + s2.marks + " " + s3.marks);
    }
}