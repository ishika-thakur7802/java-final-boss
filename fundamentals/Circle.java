class Circle extends Shape{
    double radius;
    Circle(double radius)
    {
        this.radius= radius;
    }

    void area()
    {
        System.out.println("Area="+(22.0/7.0)*this.radius*this.radius);
    }
}