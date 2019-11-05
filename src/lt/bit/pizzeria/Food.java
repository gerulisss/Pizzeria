package lt.bit.pizzeria;

//public interface Food {
public class Food {
    String name;
    String ingredients;
    int size;
    double price;

    public String getPrice() {
        return price+"eur ";
    }

    Food(String name, String ingredients, int size, double price){
        this.name = name;
        this.ingredients = ingredients;
        this.size = size;
        this.price = price;
    }
}
//    }
