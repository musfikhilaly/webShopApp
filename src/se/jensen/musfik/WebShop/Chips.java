package se.jensen.musfik.WebShop;


//Chips is a subclass here...

public class Chips extends Product {
    private String flavor;

    // constructor in use

    public Chips(int articleNumber, String title, double price, String description, String flavor) {
        super(articleNumber, title, price, description);
        this.flavor = flavor;
    }

    //@Override again

    @Override
    public String category() {
        return "Chips";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Flavor: " + flavor);
    }
}
