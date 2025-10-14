package se.jensen.musfik.WebShop;

//Subclass and Drinks inherits info from Product

public class Drinks extends Product {
    private double volume; // in liters

    public Drinks(int articleNumber, String title, double price, String description, double volume) {
        super(articleNumber, title, price, description);
    }

    //@Override---this method is replacing a method that already exists in parent method...

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
