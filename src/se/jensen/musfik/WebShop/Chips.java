package se.jensen.musfik.WebShop;


public class Chips extends Product {
    private String flavor;

    public Chips(int articleNumber, String title, double price, String description, String flavor) {
        super(articleNumber, title, price, description);
        this.flavor = flavor;
    }

    public String getFlavor() { return flavor; }
    public void setFlavor(String flavor) { this.flavor = flavor; }

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
