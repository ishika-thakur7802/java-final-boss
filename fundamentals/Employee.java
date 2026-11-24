//Create an Employee class with a parameterized constructor and
// a method to display employee details.

class Employee{
    String name; int empId; String dept;
    Employee(String name, int empId, String dept)
    {
        this.name= name;
        this.empId= empId;
        this.dept= dept;
    }

    public static void main(String[] args)
    {
        Employee e1= new Employee("Amit", 123, "HR");
        Employee e2= new Employee("Sita", 231, "Operations");
        Employee e3= new Employee("Neelam", 456, "Admin");

        System.out.println("There are 3 employees added.");
        System.out.println("Employee 1 is"+" "+e1.name+" "+"with id="+e1.empId+" "+"in department="+e1.dept);
        System.out.println("Employee 2 is"+" "+e2.name+" "+"with id="+e2.empId+" "+"in department="+e2.dept);
        System.out.println("Employee 3 is"+" "+e3.name+" "+"with id="+e3.empId+" "+"in department="+e3.dept);
    }
}