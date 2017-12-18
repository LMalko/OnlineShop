package frompythontojava.onlineshop.part1;

public class ProductCategory{

    private String name;
    private Integer ID;

    public ProductCategory(){}
    
    public ProductCategory(String name){
        this.name = name;
        
    }
    public String getName(){
        return name;
    }
    public Integer getID(){
        return ID;
    }
    
}