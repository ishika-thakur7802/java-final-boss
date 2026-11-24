//	Override a method in a child class and demonstrate runtime polymorphism.
class Cow extends Animal{
    void speak()
    {
        System.out.println("The cow moos!");
    }

    public static void main(String[] args)
    {
        Animal cow = new Cow();
        cow.speak();
    }
}