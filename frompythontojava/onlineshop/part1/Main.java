package frompythontojava.onlineshop.part1;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    
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
        
        ProductCategory dyski = new ProductCategory("dyski");
        ProductCategory tv = new ProductCategory("tv");
        FeaturedProductCategory mp3 = new FeaturedProductCategory("mp3", myDate);
    

        Product A = new Product("Maciej", a, dyski);
        Product B = new Product("Pawel", b, tv);
        Product C = new Product("Grzegorz", c, mp3);
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString(mp3));
        System.out.println(product.getAllProducts());
        basket.addProduct(A);
        basket.addProduct(B);
        basket.addProduct(C);
        for(int i = 0; i < basket.getBasketProductList().size(); i++){
            System.out.println(basket.getBasketProductList().get(i));
        }
        System.out.println(product.getAllProductsBy(dyski));
        }
    }
    