package frompythontojava.onlineshop.part1;

import java.util.ArrayList;

public class Basket{

    private ProductIterator iterator;
    private ArrayList<Product> productList;

    public Iterator getIterator() {
        return iterator;
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public Boolean removeProduct(Product product){
        Boolean result;
        if(productList.contains(product)){
            productList.remove(product);
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }

    public ArrayList getProductList(){
        return productList;
    }

    private class ProductIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            
               if(index < productList.size()){
                  return true;
               }
               return false;
            }
        
        @Override
        public Object next() {
               if(this.hasNext()){
                  return productList.get(index++);
               }
               return null;
            }	
    }
}
