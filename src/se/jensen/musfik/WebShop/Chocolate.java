package se.jensen.musfik.WebShop;


//Chocolate is a subclass ...

public class Chocolate extends Product {
    private int cocoaPercent;


//constructor in use
    public Chocolate(int articleNumber, String title, double price, String description, int cocoaPercent) {
        super(articleNumber, title, price, description);
        this .cocoaPercent = cocoaPercent;
    }
// Override means this method came from parent class
    @Override
    public String category() {
        return "Chocolate";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Cocoa Content: " + cocoaPercent + "%");
    }
}
