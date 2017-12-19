package frompythontojava.onlineshop.part1;

import java.util.ArrayList;

public class Product{

    private String name;
    private Float defaultPrice;
    private ProductCategory productCategory;
    private Integer product_id;
    private static ArrayList<Product> productList = new ArrayList<Product>();

    private static Integer nextID = 1000;

    public Product(){
    }

    public Product(String name, Float defaultPrice, ProductCategory productCategory){
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.productCategory = productCategory;
        this.product_id = getNextID();

        productList.add(this);
    }

    public String toString(){
        return String.format("ID: %s, NAME: %s, DEFAULT PRICE: %s, CATEGORY: %s - %s \n",
                             this.product_id.toString(), 
                             this.name,
                             this.defaultPrice.toString(),
                             this.productCategory.getID(),
                             this.productCategory.getName());
    }

    public String toString(FeaturedProductCategory category){
        return  String.format("%s: ID: %s, NAME: %s, DEFAULT PRICE: %s, CATEGORY: ID %s - %s, EXPIRY DATE: %s\n",
                              category.getClass().getSimpleName(),
                              this.product_id.toString(),
                              this.name,
                              this.defaultPrice.toString(),
                              this.productCategory.getID(),
                              this.productCategory.getName(),
                              category.getExpirationDate().toString());
    }

    public ArrayList<Product> getAllProducts(){
        return productList;
    }

    public ArrayList<Product> getAllProductsBy(ProductCategory productCategory){
        ArrayList<Product> result = new ArrayList<Product>();
            for (Product product : productList){
                if(product.productCategory.equals(productCategory)){
                    result.add(product);
                }
            }
        return result;
    }

    public static Integer getNextID() {
        Integer id = nextID;
        nextID++;
        return id;
    }

    public String getName(){
        return this.name;
    }
}