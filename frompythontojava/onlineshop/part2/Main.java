package frompythontojava.onlineshop.part2;

import frompythontojava.onlineshop.part1.TEST;
import frompythontojava.onlineshop.part1.Basket;


public class Main {

    public static void main(String[] args) {


        Basket basket = new TEST().getBasket();
        System.out.println(basket.getBasketProductList());
        System.out.println(basket.getBasketProductList().get(2).getName());
        System.out.println(basket.getBasketProductList().get(2).getProductID());
        System.out.println(basket.getBasketProductList().get(2).getDefaultPrice());
        System.out.println(basket.getBasketProductList().get(2).getProductCategory());
        System.out.println(basket.getBasketProductList().get(2).getProductCategoryID());
        System.out.println(basket.getBasketProductList().get(2).getProductExpirationDate());
        Order dupa = new Order(basket);
        CheckoutProcess checkout = new CheckoutProcess();
        PaymentProcess payment = new PaymentProcess();
        payment.process(dupa);


    }
}
