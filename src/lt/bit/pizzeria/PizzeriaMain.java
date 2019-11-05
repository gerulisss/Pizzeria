package lt.bit.pizzeria;

public class PizzeriaMain {
    ///Color
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    ///
    public static void main(String[] args) {
        System.out.println(ANSI_YELLOW + "PIZZERIA MENIU " + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Pasirinkite iš meniu sąrašo: " + ANSI_RESET);
        ///Picos
        Food pica1 = new Food("VIŠTIENOS BBQ pica", "Kepta vištiena, sūris, raudonieji svogūnai, špinatai", 32, 6.99);
        Food pica2 = new Food("SOČIOJI pica", "Saliamis, kumpis, svogūnai, konservuotos paprikos, žalieji ankštpipiriai", 32, 6.99);
        Food pica3 = new Food("MEKSIKIETIŠKA pica (aštri)", "Malta mėsa, svogūnai, alyvuogės, kons. paprikos, aštrūs pipirai, aitr. kons. paprikos", 32, 6.99);
//            System.out.println(ANSI_RED + pica1.name + ": " + ANSI_RESET + pica1.size + "cm" + " " + pica1.getPrice() + "; " + ANSI_RED + pica2.name + ": " + ANSI_RESET + pica2.size + "cm" + " " + pica2.getPrice() + "; " + ANSI_RED + pica3.name + ": " + ANSI_RESET + pica3.size + "cm" + " " + pica3.getPrice() + "." );
//            System.out.println(ANSI_RED + pica1.name + ": " + ANSI_RESET   + pica1.ingredients + "; "+ ANSI_RED + pica2.name + ": " + ANSI_RESET  + pica2.ingredients + ";  "+ ANSI_RED + pica3.name + ": " + ANSI_RESET  + pica3.ingredients + ".");
        System.out.println( ANSI_RED + "PICOS" + ": " + ANSI_RESET + pica1.name +  ",  " + pica2.name + ",  " +  pica3.name + ". ");
        ///PADAŽAI
        Sauce sauces1 = new Sauce("Pikantiškas padažas", 1.20);
        Sauce sauces2 = new Sauce("Česnakinis padažas", 1.20);
        Sauce sauces3 = new Sauce("BBQ padažas", 1.20);
        System.out.println( ANSI_RED + "PADAŽAI" + ": " + ANSI_RESET + sauces1.name +  ",  " + sauces2.name + ",  " +  sauces3.name + ". ");
        ///GĖRIMAI
        Drink drinks1 = new Drink("Coca-Cola", 0.3 , 3.50);
        Drink drinks2 = new Drink("Sprite", 0.3, 3.50);
        Drink drinks3 = new Drink("Fanta", 0.3, 3.50);
        System.out.println( ANSI_RED + "GĖRIMAI" + ": " + ANSI_RESET + drinks1.name +  ",  " + drinks2.name + ",  " +  drinks3.name + ". ");
        ///UŽSAKYMAS
        System.out.println( ANSI_RED + "JŪSŲ UŽSAKYMAS" + ": " + ANSI_RESET + pica1.name + ": " + pica1.price +"Eur" +  ",  " + sauces1.name + ": " + sauces1.price + "Eur" + ",  " +  drinks1.name +  ": " + drinks1.price + "Eur" + ". " +  ANSI_RED  + "BENDRA KAINA: " + ANSI_RESET + (pica1.price + sauces1.price + drinks1.price) + "Eur" );


    }

}