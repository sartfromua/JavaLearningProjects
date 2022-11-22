package CW_9;

import java.util.ArrayList;

public class Payment {
    ArrayList<Purchase> goods = new ArrayList<Purchase>();

    public boolean addPurchase(String product, int price) {
        return goods.add(new Purchase(product, price));
    }

    public int getTotalPrice() {
        int price = 0;
        for (Purchase p: goods) {
            price += p.price;
        }
        return price;
    }

    public void printListOfGoods() {
        for (Purchase p: goods) {
            System.out.println(p.product + " - " + p.price);
        }
    }

    public static class Purchase {
        String product;
        int price;
        int date;

        public Purchase(String product, int price) {
            this.product = product;
            this.price = price;
        }

        public Purchase() {}
    }

    public static void main(String[] args) {
        Payment shopping = new Payment();
        shopping.addPurchase("bananas", 6);
        shopping.addPurchase("milk", 8);
        shopping.addPurchase("pint of beer", 12);

        shopping.printListOfGoods();
        System.out.println("Total price: " + shopping.getTotalPrice());
    }
}
