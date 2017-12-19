package frompythontojava.onlineshop.part1;

public class Main {
    
    public static void main(String[] args) {

        Basket basket = new Basket();
        Product product = new Product();
        ProductCategory productCategory = new ProductCategory();

        Float a = 13.5f;
        Float b = 15.5f;
        Float c = 19.5f;

        ProductCategory dyski = new ProductCategory("dyski");
    
        System.out.println("chociaz to");
        Product A = new Product("Maciej", a, dyski);
        Product B = new Product("Pawe³", b, dyski);
        Product C = new Product("Grzegorz", c, dyski);
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
        System.out.println(product.getAllProducts());
        basket.addProduct(A);
        basket.addProduct(B);
        basket.addProduct(C);
        System.out.println(basket.getProductList());
    
        }
    }
    