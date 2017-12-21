package frompythontojava.onlineshop.part3;

import frompythontojava.onlineshop.part1.*;
import frompythontojava.onlineshop.part2.*;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        Basket basket = new TEST().getBasket();
        System.out.println(basket.getBasketProductList());
    }
}