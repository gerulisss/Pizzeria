package lt.bit.pizzeria;

import java.util.Scanner;
public class PizzeriaMain  {

///Color
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    ///
    public static void main(String[] args) {
        //    Pizzeria Scanner code starts here___________________________________________________
        //        Kintamieji________________________________________________________
        int picos;
        int padazas;
        int gerimas;
        String sauceName = "neužsakyta";
        String drinkName = "neužsakyta";
        double deliveryCost = 1.50;
        String clientName;
        String delivery;
        //        Kintamieji________________________________________________________

        Scanner OrderSelect = new Scanner(System.in);
//        System.out.println(ANSI_YELLOW + "PIZZERIA MENIU " + ANSI_RESET);
//        System.out.println(ANSI_YELLOW + "Pasirinkite iš meniu sąrašo: " + ANSI_RESET);
//        Picos
        Food pica1 = new Food("VIŠTIENOS BBQ pica", "Kepta vištiena, sūris, raudonieji svogūnai, špinatai", 32, 6.99);
        Food pica2 = new Food("SOČIOJI pica", "Saliamis, kumpis, svogūnai, konservuotos paprikos, žalieji ankštpipiriai", 32, 6.99);
        Food pica3 = new Food("MEKSIKIETIŠKA pica (aštri)", "Malta mėsa, svogūnai, alyvuogės, kons. paprikos, aštrūs pipirai, aitr. kons. paprikos", 32, 6.99);
//            System.out.println(ANSI_RED + pica1.getName() + ": " + ANSI_RESET + pica1.size + "cm" + " " + pica1.getPrice() + "€ "+ "; " + ANSI_RED + pica2.getName() + ": " + ANSI_RESET + pica2.size + "cm" + " " + pica2.getPrice() + "; " + ANSI_RED + pica3.getName() + ": " + ANSI_RESET + pica3.size + "cm" + " " + pica3.getPrice() + "." );
//            System.out.println(ANSI_RED + pica1.name + ": " + ANSI_RESET   + pica1.ingredients + "; "+ ANSI_RED + pica2.name + ": " + ANSI_RESET  + pica2.ingredients + ";  "+ ANSI_RED + pica3.name + ": " + ANSI_RESET  + pica3.ingredients + ".");
//        System.out.println(ANSI_RED + "PICOS" + ": " + ANSI_RESET + pica1.name + ",  " + pica2.name + ",  " + pica3.name + ". ");
//        PADAŽAI
//

//        System.out.println(ANSI_RED + "PADAŽAI" + ": " + ANSI_RESET + sauces1.name + ",  " + sauces2.name + ",  " + sauces3.name + ". ");
//        GĖRIMAI
        Drink drinks1 = new Drink("Coca-Cola", 0.3, 3.50);
        Drink drinks2 = new Drink("Sprite", 0.3, 3.50);
        Drink drinks3 = new Drink("Fanta", 0.3, 3.50);
//        System.out.println(ANSI_RED + "GĖRIMAI" + ": " + ANSI_RESET + drinks1.name + ",  " + drinks2.name + ",  " + drinks3.name + ". ");
//        UŽSAKYMAS
//        System.out.println(ANSI_RED + "JŪSŲ UŽSAKYMAS" + ": " + ANSI_RESET + pica1.name + ": " + pica1.price + "Eur" + ",  " + sauces1.name + ": " + sauces1.price + "Eur" + ",  " + drinks1.name + ": " + drinks1.price + "Eur" + ". " + ANSI_RED + "BENDRA KAINA: " + ANSI_RESET + (pica1.price + sauces1.price + drinks1.price) + "Eur");

//        System.out.println("p1" + drinks2);

        System.out.println("Kuo jūs vardu?");
        clientName = OrderSelect.nextLine();
        System.out.println("Labas " + clientName + ", kokia picą norėtumėte užsisakyti?\n1:" + pica1.getName() + " " + pica1.getPrice() + "€" +
                "\n2:" + pica2.getName() + " " + pica2.getPrice() + "€" + "\n3:" + pica3.getName() + " " + pica3.getPrice() + "€");
        picos = Integer.parseInt(OrderSelect.nextLine());

        if (picos == 1) {
            pica1.getName();
            pica1.getPrice();
        } else if (picos == 2) {
            pica2.getName();
            pica2.getPrice();
        } else if (picos == 3) {
            pica3.getName();
            pica3.getPrice();
        }
        do {
            System.out.println("Kokio padažo prie picos norėsite? Siūlome šiuos padažus:  \n1: " + Sauce.SWEET.getName() + " " + Sauce.SWEET.getPrice() + "€" +
                    "  \n2: " + Sauce.STRONG.getName() + " " + Sauce.STRONG.getPrice() + "€" + "\n3:" + Sauce.BBQ.getName() + " " + Sauce.BBQ.getPrice() + "€" +
                    "  \n4: Nereikia padažo");
            padazas = Integer.parseInt(OrderSelect.nextLine());

            if (padazas == 1) {
                Sauce.SWEET.getName();
                Sauce.SWEET.getPrice();
            } else if (padazas == 2) {
                Sauce.STRONG.getName();
                Sauce.STRONG.getPrice();
            } else if (padazas == 3) {
                Sauce.BBQ.getName();
                Sauce.BBQ.getPrice();
            }
        }while (padazas < 4);

        System.out.println("Pasirinkite gėrimą:  \n1: " + drinks1.getName() + " " + drinks1.getPrice() + "€" +
                "  \n2: " + drinks2.getName() + " " + drinks2.getPrice() + "€" + "\n3: " + drinks3.getName() + " " + drinks3.getPrice() + "€" +
                "  \n4: Nereikia gėrimo");
        gerimas = Integer.parseInt(OrderSelect.nextLine());

        if (gerimas == 1) {
            drinks1.getName();
            drinks1.getPrice();
        } else if (gerimas == 2) {
            drinks2.getName();
            drinks2.getPrice();
        } else if (gerimas == 3) {
            drinks3.getName();
            drinks3.getPrice();
        } while (gerimas < 4);

//        double ordercost = pica.getPrice + Sauce.getPrice + drink.getPrice;
//        double totalCostD = pica.getPrice + Sauce.getPrice + drink.getPrice + deliverycost;
//        System.out.println("Ar reikalingas picos pristatymas?\n Įveskite taip arba ne");
//        delivery = OrderSelect.nextLine();
//
//
//        if (delivery.equals("taip")) {
//            System.out.println("Ačiū, " + clientName + ", jūsų užsakymą sudaro:" + "\n pica: " + pica.getName + ": " + pica.getPrice +
//                    "\npadažas: " + Sauce.getName + ": " + Sauce.getPrice +
//                    "\ngėrimas: " + drink.getName + ": " + drink.getPrice +
//                    "\npristatymas 1.50 "
//                    + "\nViso užsakymo kaina  ");
//        }
//
//        if (delivery.equals("ne")) {
//            System.out.println("Ačiū " + clientName + ", čia jūsų užsakymas:" + "\nPica: " + pica.getName + ": " + pica.getPrice +
//                    "\npadažas: " + Sauce.getName + ": " + Sauce.getPrice +
//                    "\nGėrimas: " + drink.getName + ": " + drink.getPrice +
//                    "\nViso kaina: ");
//        }
    }
}
