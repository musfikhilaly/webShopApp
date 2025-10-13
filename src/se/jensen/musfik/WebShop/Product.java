package se.jensen.musfik.WebShop;


// abstract class

public abstract class Product {
    private int articleNumber;
    private String title;
    private double price;
    private String description;

    // Constructor
    public Product(int articleNumber, String title, double price, String description) {
        this.articleNumber = articleNumber;
        this.title = title;
        this.price = price;
        this.description = description;
    }

    // Getters and Setters
    public int getArticleNumber() { return articleNumber; }
    public void setArticleNumber(int articleNumber) { this.articleNumber = articleNumber; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    // Abstract method (must be implemented by subclasses)
    public abstract String category();

    // Display common info for all products
    public void displayInfo() {
        System.out.println("Article Number: " + articleNumber);
        System.out.println("Title: " + title);
        System.out.println("Price: sek " + price);
        System.out.println("Description: " + description);
        System.out.println("Category: " + category());
    }
}
