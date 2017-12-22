package frompythontojava.onlineshop.part3;

import frompythontojava.onlineshop.part1.Basket;
import frompythontojava.onlineshop.part1.Iterator;
import java.util.Scanner;

public class View {

    private Basket basket = new Basket();
    private Iterator basketIterator;

    public View(){
        this.basketIterator = basket.getIterator();
    }

    public void displayMenu(){
        System.out.println("MALPKA EXPRESS ONLINE\n\n" +
                           "1.  Create new product.\n" +
                           "2.  Create new product category.\n" +
                           "3.  Create new featured product category.\n" +
                           "4.  Add products to basket.\n" +
                           "5.  See all products in basket.\n" +
                           "6.  Remove product from basket.\n" +
                           "7.  Get list of available products.\n" +
                           "8.  Get list of available products by given category.\n" +
                           "9.  Check availability of product.\n" +
                           "10. Checkout and pay.");
    }

    public String takeUserInput(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public void displayMessage(String message){
        System.out.println(message);
    }

    public void clearScreen(){  
        for(int clear = 0; clear < 50; clear++){
           System.out.println("\b");
        }
    }
}