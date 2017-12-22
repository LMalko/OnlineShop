package frompythontojava.onlineshop.part3;


import java.util.HashMap;
import java.util.Date;
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import frompythontojava.onlineshop.part1.*;
import frompythontojava.onlineshop.part2.*;

public class Application {

    private View view;
    private Basket basket;
    private Order order;
    private HashMap<String, Object> menuChoices;
    private ArrayList<ProductCategory> productCategories = new ArrayList<ProductCategory>();

    public void startApp(){
        this.view = new View();
        this.basket = new Basket();
        initiateMenuChoices();
        initiateDefaultProducts();
        initiateDefaultProductCategories();
        applicationFlow();
    }

    private void applicationFlow(){
        this.view.clearScreen();
        this.view.displayMenu();
        this.view.displayMessage("Choose option");
        String input = this.view.takeUserInput();
        this.menuChoices.get(input);
    }

    private void initiateMenuChoices(){
        this.menuChoices.put("1", createNewProduct());
        this.menuChoices.put("2", createNewProductCategory());
        this.menuChoices.put("3", createNewFeaturedProductCategory());
        this.menuChoices.put("4", addProductsToBasket());
        this.menuChoices.put("5", displayBasket());
        this.menuChoices.put("6", removeFromBasket());
        this.menuChoices.put("7", displayProducts());
        this.menuChoices.put("8", displayProductsByGivenCategory());
        this.menuChoices.put("9", checkIfProductExists());
        this.menuChoices.put("10", checkOutAndPay());
    }

    private void initiateDefaultProducts(){
        productCategories

    }
    private String initiateDefaultProductCategories(){
        return "Dupa.";
    }
    private String createNewProduct(){
        return "Dupa.";
    }
    private String createNewProductCategory(){
        return "Dupa.";
    }
    private String createNewFeaturedProductCategory(){
        return "Dupa.";
    }
    private String addProductsToBasket(){
        return "Dupa.";
    }
    private String displayBasket(){
        return "Dupa.";
    }
    private String removeFromBasket(){
        return "Dupa.";
    }
    private String displayProducts(){
        return "Dupa.";
    }
    private String displayProductsByGivenCategory(){
        return "Dupa.";
    }
    private String checkIfProductExists(){
        return "Dupa.";
    }
    private String checkOutAndPay(){
        return "Dupa.";
    }
    private Date getDateFromUser(){
        Date myDate = new Date();
        String inputString = this.view.takeUserInput();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try{
            myDate = dateFormat.parse(inputString);
        }
        catch(ParseException e){
        }
        return myDate;
    }
}
