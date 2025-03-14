package test.programs.classandobjects;

public class Cars{
    private String name;
    private double price;
    private String model;
    private String colour;

    public Cars() {
    }

    public Cars(String name, double price, String model, String colour) {
        this.name = name;
        this.price = price;
        this.model = model;
        this.colour = colour;
    }



    public double getPrice() {
        return price;
    }


    public void setPrice(double price) { this.price = price; }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
