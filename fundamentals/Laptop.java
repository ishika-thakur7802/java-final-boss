//Create a class with private fields and public getter/setter methods.
class Laptop{
    private String model;
    String colour;
    int yearOfPurchase;
    Laptop(String model, String colour, int yearOfPurchase)
    {
        this.model=model;
        this.colour=colour;
        this.yearOfPurchase=yearOfPurchase;
    }

    //getters
    String getModel()
    {
        return this.model;
    }
    String getColour()
    {
        return this.colour;
    }

    int getYearOfPurchase()
    {
        return this.yearOfPurchase;
    }

    //setters

//    void setModel(String model)
//    {
//        this.model=model;
//    } can't set model- its PRIVATE

    void setColour(String colour)
    {
        this.colour=colour;
    }

    void setYearOfPurchase(int yearOfPurchase)
    {
        this.yearOfPurchase= yearOfPurchase;
    }

    public static void main(String[] args)
    {
        Laptop l1= new Laptop("SM123", "blue", 2024);
        l1.setColour("red");

        System.out.println("Laptop is of model="+l1.getModel());
        System.out.println("Laptops color="+l1.getColour());
        System.out.println("Laptop was bought in="+l1.getYearOfPurchase());
    }
}