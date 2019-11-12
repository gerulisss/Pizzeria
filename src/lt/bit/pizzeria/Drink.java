package lt.bit.pizzeria;

public class Drink implements MenuItem {
    String name;
    double price;
    double size;




    Drink(String name, double size, double price){
        this.name = name;
        this.size = size;
        this.price = price;
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}

