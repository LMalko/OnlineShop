package frompythontojava.onlineshop.part1;

import java.util.ArrayList;

public class Product{

    private String name;
    private Float defaultPrice;
    private ProductCategory productCategory;
    private Integer ID;
    private static ArrayList productList;

    public Product(){

    }
    public Product(String name, Float defaultPrice, ProductCategory productCategory){
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.productCategory = productCategory;

    }
    public String toString(){
        return this.ID.toString() + this.name + this.defaultPrice.toString() + this.productCategory;

    }
    public String toString(String[] args){
        return "FeaturedProductCategory" + this.ID.toString() + this.name +
               this.defaultPrice.toString() + this.productCategory;

    }
    public ArrayList getAllProducts(){
        return productList;

    }
    public ArrayList getAllProductsBy(ProductCategory productCategory){
        return productList;
        /** tutaj daj warunek o product category */

    }
}