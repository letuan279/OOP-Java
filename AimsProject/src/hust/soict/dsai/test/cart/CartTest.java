package hust.soict.dsai.test.cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Tuan", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King 2", "Anime", "Tuan", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King 3", "Anime", "Tuan", 87, 18.99f);

        cart.addDigitalVideoDisc(dvd1, dvd2, dvd3);

        cart.print();
        printSearchResult(cart.searchById(0));
        printSearchResult(cart.searchById(1));
        printSearchResult(cart.seachByTitle("Lion"));
        printSearchResult(cart.seachByTitle("Liong"));
    }

    public static void printSearchResult(DigitalVideoDisc result) {
        if (result != null) {
            System.out.println(result.toString());
        } else {
            System.out.println("Not found");
        }
        System.out.println("***********************************");
    }

    public static void printSearchResult(ArrayList<DigitalVideoDisc> result) {
        if (result != null) {
            result.forEach((item) -> System.out.println(item.toString()));
        } else {
            System.out.println("Not found");
        }
        System.out.println("***********************************");
    }
}
