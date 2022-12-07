package hust.soict.dsai.aims.cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>(MAX_NUMBERS_ORDERED);

    public void addMedia(Media input) {
        if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
            System.out.println("Full");
            return;
        }
        itemsOrdered.add(input);
    }

    public void removeMedia(Media input) {
        if (itemsOrdered.contains(input)) {
            itemsOrdered.remove(input);
            return;
        }
        System.out.println("Not found");
    }

    public float totalCost() {
        float ans = 0.0f;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            ans += itemsOrdered.get(i).getCost();
        }
        return ans;
    }

    public void print() {
        float total = 0;
        System.out.println("***********************CART***********************");
        for (int i = 0; i < itemsOrdered.size(); ++i) {
            System.out.println(itemsOrdered.get(i).toString());
            total += itemsOrdered.get(i).getCost();
        }
        System.out.println("Total cost: " + total);
        System.out.println("***************************************************");
    }

    public Media searchById(int id) {
        for (int i = 0; i < itemsOrdered.size(); ++i) {
            if (itemsOrdered.get(i).getId() == id) {
                return itemsOrdered.get(i);
            }
        }
        return null;
    }

    public ArrayList<DigitalVideoDisc> seachByTitle(String title) {
        ArrayList<DigitalVideoDisc> ans = new ArrayList<DigitalVideoDisc>();
        for (int i = 0; i < itemsOrdered.size(); ++i) {
            if (itemsOrdered.get(i) instanceof DigitalVideoDisc) {
                DigitalVideoDisc curr = (DigitalVideoDisc) itemsOrdered.get(i);
                if (curr.isMatch(title))
                    ans.add(curr);
            }
        }
        if (ans.isEmpty()) {
            return null;
        }
        return ans;
    }

}
