package se.jensen.musfik.WebShop;



public class Drinks extends Product {
    private double volume; // in liters

    public Drinks(int articleNumber, String title, double price, String description, double volume) {
        super(articleNumber, title, price, description);
        this.volume = volume;
    }

    public double getVolume() { return volume; }
    public void setVolume(double volume) { this.volume = volume; }

    @Override
    public String category() {
        return "Drink";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Volume: " + volume + "L");
    }
}
