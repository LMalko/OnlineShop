package frompythontojava.onlineshop.part1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TEST {
    
    public static void main(String[] args) {

        Basket basket = new Basket();
        Product product = new Product();

        Float a = 13.5f;
        Float b = 15.5f;
        Float c = 19.5f;

        Date myDate = new Date();
        String inputString = "11-11-2020";
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try{
            myDate = dateFormat.parse(inputString);
        }
        catch(ParseException e){

        }
        FeaturedProductCategory dyski = new FeaturedProductCategory("dyski", myDate);

        myDate = new Date();
        inputString = "12-12-2034";
        dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try{
            myDate = dateFormat.parse(inputString);
        }
        catch(ParseException e){

        }

        ProductCategory tv = new ProductCategory("tv");
        FeaturedProductCategory mp3 = new FeaturedProductCategory("mp3", myDate);
    

        Product A = new Product("Maciej", a, dyski);
        Product B = new Product("Pawel", b, tv);
        Product C = new Product("Grzegorz", c, mp3);
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
        System.out.println(product.getAllProducts());
        basket.addProduct(A);
        basket.addProduct(B);
        basket.addProduct(C);

        iterallo(basket);
        System.out.println(product.getAllProductsBy(dyski));
        System.out.println("dupa");
        basket.removeProduct(B);
        iterallo(basket);


        System.out.println("dupa");
        }
    private static void iterallo(Basket basket){
        Iterator basketIterator = basket.getIterator();
        while(basketIterator.hasNext()) {
			String basketObj = basketIterator.next().toString();
			System.out.println(basketObj);
        }
    }
    public Basket getBasket(){

            Basket basket = new Basket();
    
            Float a = 13.5f;
            Float b = 15.5f;
            Float c = 19.5f;
    
            Date myDate = new Date();
            String inputString = "11-11-2020";
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            try{
                myDate = dateFormat.parse(inputString);
            }
            catch(ParseException e){
    
            }
            FeaturedProductCategory dyski = new FeaturedProductCategory("dyski", myDate);

            myDate = new Date();
            inputString = "12-12-2034";
            dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            try{
                myDate = dateFormat.parse(inputString);
            }
            catch(ParseException e){
    
            }
            
            ProductCategory tv = new ProductCategory("tv");
            FeaturedProductCategory mp3 = new FeaturedProductCategory("mp3", myDate);
        
    
            Product A = new Product("Maciej", a, dyski);
            Product B = new Product("Pawel", b, tv);
            Product C = new Product("Grzegorz", c, mp3);
            basket.addProduct(A);
            basket.addProduct(B);
            basket.addProduct(C);
    
            return basket;
            }
    }
    
