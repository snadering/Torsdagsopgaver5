package Task1;

public class Car {

    private String make;
    private String model;
    private String year;
    private String bodyStyle;
    private Driver driver;
    public Car(String make, String model, String year, String bodyStyle){

        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car \n" +
                "Make: " + make + "\n" +
                "Model: " + model + '\n' +
                "Year: " + year + '\n' +
                "BodyStyle: " + bodyStyle;
    }
}
