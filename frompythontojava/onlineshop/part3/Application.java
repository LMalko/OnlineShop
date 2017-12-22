package frompythontojava.onlineshop.part3;

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
    private ArrayList<ProductCategory> productCategories = new ArrayList<ProductCategory>();
    private Product product;

    public void startApp(){
        this.view = new View();
        this.basket = new Basket();
        this.product = new Product();
        createInitialProductAndCategories();
        applicationFlow();
    }

    private void applicationFlow(){
        this.view.clearScreen();
        this.view.displayMenu();
        this.view.displayText("Choose option");
        String input = this.view.takeUserInput();
        this.view.clearScreen();
        initiateMenuChoice(input);
    }

    private void initiateMenuChoice(String userChoice){
        if(userChoice.equals("1")){
            createNewProduct();
        }else if(userChoice.equals("2")){
            createNewProductCategory();
        }else if(userChoice.equals("3")){
            createNewFeaturedProductCategory();
        }else if(userChoice.equals("4")){
            addProductsToBasket();
        }else if(userChoice.equals("5")){
            displayBasket();
        }else if(userChoice.equals("6")){
            removeFromBasket();
        }else if(userChoice.equals("7")){
            displayProducts();
        }else if(userChoice.equals("8")){
            displayProductsByGivenCategory();
        }else if(userChoice.equals("9")){
            checkIfProductExists();
        }else if(userChoice.equals("10")){
            checkOutAndPay();
        }else if(userChoice.equals("0")){
            System.exit(0);
        }else{
            this.view.displayText("No such choice.");
        }
    }

    private void createInitialProductAndCategories(){
        String initDate1 = "01-02-2018";
        String initDate2 = "11-05-2018";
        String initDate3 = "21-11-2020";
        Float defaultPriceA = 3.5f;
        Float defaultPriceB = 10.5f;
        Float defaultPriceC = 15.5f;
        Float defaultPriceD = 86.5f;

        FeaturedProductCategory fruits = new FeaturedProductCategory("Fruits", createInitDate(initDate1));
        this.productCategories.add(fruits);
        Product Banany = new Product("Banany", defaultPriceA, fruits);

        ProductCategory drinks = new ProductCategory("Drinks");
        this.productCategories.add(drinks);
        Product SokZBrzozy = new Product("Sok z brzozy", defaultPriceB, drinks);

        FeaturedProductCategory sweets = new FeaturedProductCategory("Sweets", createInitDate(initDate2));
        this.productCategories.add(sweets);
        Product Snickers = new Product("Snickers", defaultPriceC, sweets);

        FeaturedProductCategory meat = new FeaturedProductCategory("Meat", createInitDate(initDate3));
        this.productCategories.add(meat);
        Product Kura = new Product("Kura", defaultPriceD, meat);
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
    private void displayProducts(){
        for(int i = 0; i < this.product.getAllProducts().size(); i++){
            this.view.displayText(this.product.getAllProducts().get(i).toString());
        }
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
    private Date createDateFromUser(){
        Date date = new Date();
        String inputString = this.view.takeUserInput();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try{
            date = dateFormat.parse(inputString);
        }
        catch(ParseException e){
        }
        return date;
    }
    private Date createInitDate(String initDate){
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try{
            date = dateFormat.parse(initDate);
        }
        catch(ParseException e){
        }
        return date;
    }
}
