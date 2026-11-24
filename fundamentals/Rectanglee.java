class Rectanglee extends Shape{
    double length;
    double breadth;
    Rectanglee(double length, double breadth)
    {
        this.length= length;
        this.breadth= breadth;
    }


    void area()
    {
        System.out.println("Area="+this.length*this.breadth);
    }
}