import java.util.ArrayList;

public class Basket{

    private Iterator iterator;
    private ArrayList<Product> productList;

    private class ProductIterator implements Iterator{

        @Override
        public boolean hasNext() {
            
               if(index < names.length){
                  return true;
               }
               return false;
            }
        
        @Override
        public Object next() {
            
               if(this.hasNext()){
                  return names[index++];
               }
               return null;
            }	

    }
    
}
