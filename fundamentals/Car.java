class Car extends Vehicle{

    void move(){
        System.out.println("The car is moving!");
    }

    public static void main(String[] args)
    {
        Vehicle v1= new Car();
        v1.move();
    }
}