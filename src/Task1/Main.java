package Task1;

public class Main {
    public static void main(String[] args) {
        //Creating a Driver and a Car
        Driver d1 = new Driver("Sander", 20);
        Car c1 = new Car("Porsche","GT3 Touring","2022", "Cabriolet");
        Car c2 = new Car("Ferrari", "F8 Tributo","2020", "Coupe");

        //Assigning the driver
        c1.setDriver("Sander");
        c2.getDriver();

        //Printing Car #1 and Driver #1
        System.out.println(c1.toString());
        System.out.println(d1.toString());
        //Printing Car #2 and Driver #1
        System.out.println(c2);
        System.out.println(d1);


    }
}