package lt.bit.pizzeria;

public class Food implements MenuItem {

     String name;
     String ingredients;
     int size;
     double price;


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

    public double getPrice() {
        return price;
    }
}

//aaa


//import java.util.Scanner;
//
//class InputOutputMain {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            printMenu();
//            String line = scanner.nextLine();
//            if (line.equals("e")) {
//                break;
//            }
//
//        }
//    }
//
//    private static void printMenu() {
//        System.out.println("Meniu...");
//        System.out.println("e - iseiti");
//        System.out.print("Pasirinkite is meniu: ");
//    }
//}///

