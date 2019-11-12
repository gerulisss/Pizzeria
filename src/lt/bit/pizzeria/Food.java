package lt.bit.pizzeria;

public class Food implements MenuItem {
    private String name;
    private String ingredients;
    private int size;
    private double price;


    Food(String name, String ingredients, int size, double price){
        this.name = name;
        this.ingredients = ingredients;
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
