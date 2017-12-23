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
        createInitialProductsAndCategories();
        applicationFlowStart();
    }

    private void applicationFlowStart(){
        this.view.clearScreen();
        initiateUserMenuChoice();
    }

    private void initiateUserMenuChoice(){
        Boolean programRun = true;
        while(programRun){
            this.view.displayMenu();
            this.view.displayText("Choose option");
            String userChoice = this.view.takeUserInput();
            this.view.clearScreen();

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
                programRun = false;
                this.view.clearScreen();
            }else{
                this.view.displayText("No such choice.");
            }
            this.view.clearScreen();
        }
    }

    private void createInitialProductsAndCategories(){
        String initDate1 = "01-02-2018";
        String initDate2 = "11-05-2018";
        String initDate3 = "21-11-2020";
        Float defaultPriceA = 3.5f;
        Float defaultPriceB = 10.5f;
        Float defaultPriceC = 15.5f;
        Float defaultPriceD = 86.5f;

        FeaturedProductCategory fruits = new FeaturedProductCategory("Fruits", createInitDate(initDate1));
        this.productCategories.add(fruits);
        Product banany = new Product("Banany", defaultPriceA, fruits);

        ProductCategory drinks = new ProductCategory("Drinks");
        this.productCategories.add(drinks);
        Product sokZBrzozy = new Product("Sok z brzozy", defaultPriceB, drinks);

        FeaturedProductCategory sweets = new FeaturedProductCategory("Sweets", createInitDate(initDate2));
        this.productCategories.add(sweets);
        Product snickers = new Product("Snickers", defaultPriceC, sweets);

        FeaturedProductCategory meat = new FeaturedProductCategory("Meat", createInitDate(initDate3));
        this.productCategories.add(meat);
        Product kura = new Product("Kura", defaultPriceD, meat);
    }

    private void createNewProduct(){
        this.view.displayText("\nChoose name:");
        String newProductName = this.view.takeUserInput();

        Float newProductDefaultPrice;
        while(true){
            this.view.displayText("\nChoose default price: ");
            String price = this.view.takeUserInput();
            try{
                newProductDefaultPrice = Float.parseFloat(price);
                break;
            }catch(NumberFormatException exception){
                continue;
            }
        }

        this.view.displayText("\nCategories: ");
        displayProductsCategories();

        FeaturedProductCategory featuredProductcategory = createNewFeaturedProductCategory();
        Product newProduct = new Product(newProductName.substring(0, 1).toUpperCase() +
                                         newProductName.substring(1),
                                         newProductDefaultPrice,
                                         featuredProductcategory);
    }

    private ProductCategory createNewProductCategory(){
        this.view.displayText("Choose category name: ");
        String productCategoryName = this.view.takeUserInput();

        ProductCategory productCategory = new ProductCategory(productCategoryName.substring(0, 1).toUpperCase() +
                                                              productCategoryName.substring(1));
        this.productCategories.add(productCategory);

        return productCategory;
    }

    private FeaturedProductCategory createNewFeaturedProductCategory(){
        this.view.displayText("Choose category name: ");
        String categoryName = this.view.takeUserInput();

        this.view.displayText("Choose expiry date, format dd-mm-yyyy: ");
        Date categoryDate = createDateFromUser();

        FeaturedProductCategory category = new FeaturedProductCategory(categoryName.substring(0, 1).toUpperCase() +
                                                                       categoryName.substring(1),
                                                                       categoryDate);
        this.productCategories.add(category);

        return category;
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
        this.view.displayText("\n\n\n\n\n\n\n\n\n");
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
        Boolean isDateCorrect = false;
        Date date = new Date();
        while(!isDateCorrect){
            String inputString = this.view.takeUserInput();
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            try{
                date = dateFormat.parse(inputString);
                isDateCorrect = true;
            }
            catch(ParseException e){
                this.view.displayText("Wrong format.");
            }
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
    private void displayProductsCategories(){
        for(int i = 0; i < this.productCategories.size(); i++){
            this.view.displayText(this.productCategories.get(i).getName());
        }
        this.view.displayText("\n\n\n\n\n");
    }
}
