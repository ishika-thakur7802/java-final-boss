//	Create a parent class Shape and child classes Circle, Rectangle and Triangle.
//	Calculate their areas using method overriding.

class Shape{
    void area()
    {
        System.out.println("This function finds area of shape");
    }

    public static void main(String[] args)
    {
        Shape circle= new Circle(5);
        Shape rectangle= new Rectanglee(4.0, 3.0);
        Shape triangle= new Triangle(12.0,3.0);

        circle.area();
        rectangle.area();
        triangle.area();
    }
}