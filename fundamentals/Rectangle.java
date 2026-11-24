//Create a Rectangle class with length and breadth.
//Implement methods to calculate area and perimeter.
class Rectangle{
    double length;
    double breadth;
    Rectangle(double length, double breadth)
    {
        this.length= length;
        this.breadth= breadth;
    }
    double area()
    {
        return this.length*this.breadth;
    }
    double perimeter()
    {
        return 2*(this.length+this.breadth);
    }

    public static void main(String[] args)
    {
        Rectangle r1= new Rectangle(10, 11);
        Rectangle r2= new Rectangle(5.0, 8.0);

        System.out.println("Area of 1st rectangle="+r1.area());
        System.out.println("Perimeter of 1st rectangle="+r1.perimeter());
        System.out.println("Area of 2nd rectangle="+r2.area());
        System.out.println("Perimeter of 2nd rectangle="+r2.perimeter());
    }
}