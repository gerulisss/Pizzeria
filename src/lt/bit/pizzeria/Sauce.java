package lt.bit.pizzeria;



public enum Sauce implements MenuItem {

        SWEET("Pikantiškas",1.20),
        STRONG("Česnakinis",1.20),
        BBQ("BBQ",1.20);


         String name;
         double price;

    Sauce(String name, double price) {
        this.name = name;
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


