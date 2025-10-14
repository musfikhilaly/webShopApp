package se.jensen.musfik.WebShop;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Main application....

public class WebShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //to list a product and making a new empty list with new arrayList
        List<Product> products = new ArrayList<>();


        //choice is creating a value for user choices a number.
        int choice;

        do {
            System.out.println("\n*** SNACK SHOP MENU ***");
            System.out.println("1.  Add Product");
            System.out.println("2.  List All Products");
            System.out.println("3.  Show Product Info");
            System.out.println("4.  Exit");
            System.out.print("Your choice is : ");
            //Integer.parseInt is a built in method to convert String to Int...
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> addProduct(scanner, products);
                case 2 -> listProducts(products);
                case 3 -> showProductInfo(scanner, products);
                case 4 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice, try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void addProduct(Scanner scanner, List<Product> products) {
        System.out.println("\nChoose product type:");
        System.out.println("1. Drink");
        System.out.println("2. Chips");
        System.out.println("3. Chocolate");
        System.out.print("Your choice: ");
        int type = Integer.parseInt(scanner.nextLine());

        System.out.print("Article number: ");
        int articleNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Description: ");
        String description = scanner.nextLine();

        Product product = null;

        switch (type) {
            case 1 -> {
                System.out.print("Volume (liters): ");
                double volume = Double.parseDouble(scanner.nextLine());
                product = new Drinks(articleNumber, title, price, description, volume);
            }
            case 2 -> {
                System.out.print("Flavor: ");
                String flavor = scanner.nextLine();
                product = new Chips(articleNumber, title, price, description, flavor);
            }
            case 3 -> {
                System.out.print("Cocoa percentage: ");
                int cocoa = Integer.parseInt(scanner.nextLine());
                product = new Chocolate(articleNumber, title, price, description, cocoa);
            }
            default -> System.out.println("Invalid product type.");
        }

        if (product != null) {
            products.add(product);
            System.out.println("Product added successfully!");
        }
    }

    private static void listProducts(List<Product> products) {
        System.out.println("\n--- PRODUCT LIST ---");
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product p : products) {
                System.out.println(p.getArticleNumber() + ": " + p.getTitle() + " (" + p.category() + ")");
            }
        }
    }

    private static void showProductInfo(Scanner scanner, List<Product> products) {
        System.out.print("\nEnter article number: ");
        int number = Integer.parseInt(scanner.nextLine());

        boolean found = false;
        for (Product p : products) {
            if (p.getArticleNumber() == number) {
                System.out.println("\n--- PRODUCT INFO ---");
                p.displayInfo();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No product found with this article number.");
        }
    }
}
