class Triangle extends Shape{
    double height;
    double breadth;
    Triangle(double height, double breadth)
    {
        this.height= height;
        this.breadth= breadth;
    }


    void area()
    {
        System.out.println("Area="+0.5*this.height*this.breadth);
    }
}