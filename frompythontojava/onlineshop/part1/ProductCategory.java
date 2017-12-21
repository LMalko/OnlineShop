package frompythontojava.onlineshop.part1;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class ProductCategory{
    
    private String name;
    private Integer ID;

    private static Integer nextID = 0;
    private Date expirationDate;

    public ProductCategory(){

    }
    
    public ProductCategory(String name){
        this.name = name;
        this.ID = getNextID();
        this.expirationDate = this.assignExpirationDate();

    }
    public String getName(){
        return name;
    }
    public Integer getID(){
        return ID;
    }
    private Integer getNextID() {
        Integer newID = nextID;
        nextID++;
        return newID;
    }
    public Date getExpirationDate(){
        return this.expirationDate;
    }
    private Date assignExpirationDate(){
        Date myDate = new Date();
        String inputString = "01-01-2100";
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try{
            myDate = dateFormat.parse(inputString);
        }
        catch(ParseException e){
        }
        return myDate;
    }
}