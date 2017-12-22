package frompythontojava.onlineshop.part1;

import java.util.Date;

public class FeaturedProductCategory extends ProductCategory{

    private String expirationDate;

    public FeaturedProductCategory(String name, Date expirationDate){
        super(name);
        this.expirationDate = expirationDate.toString();
    }
    
    @Override
    public String getExpirationDateString(){
        return this.expirationDate;
    }
}
