package se.jensen.musfik.WebShop;


public class Chocolate extends Product {
    private int cocoaPercent;

    public Chocolate(int articleNumber, String title, double price, String description, int cocoaPercent) {
        super(articleNumber, title, price, description);
        this.cocoaPercent = cocoaPercent;
    }

    public int getCocoaPercent() { return cocoaPercent; }
    public void setCocoaPercent(int cocoaPercent) { this.cocoaPercent = cocoaPercent; }

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
