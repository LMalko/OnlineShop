package frompythontojava.onlineshop.part1;

public class ProductCategory{
    
        private String name;
        private Integer ID;

        private static Integer nextID = 0;
    
        public ProductCategory(){}
        
        public ProductCategory(String name){
            this.name = name;
            this.ID = getNextID();
        }
        public String getName(){
            return name;
        }
        public Integer getID(){
            return ID;
        }
        public static Integer getNextID() {
            Integer id = nextID;
            nextID++;
            return id;
        }
    }