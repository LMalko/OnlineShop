package frompythontojava.onlineshop.part1;

import java.sql.Date;

public class FeaturedProductCategory extends ProductCategory{

    private Date expirationDate;

    public FeaturedProductCategory(String name, Date expirationDate){
        super(name);
        this.expirationDate = expirationDate;
    }

    public Date getExpirationDate(){
        return expirationDate;
    }
}