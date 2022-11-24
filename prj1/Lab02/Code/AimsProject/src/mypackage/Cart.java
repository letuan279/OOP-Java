package mypackage;

import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full");
            return;
        }

        itemsOrdered[qtyOrdered++] = disc;
        System.out.println("The disc has been added");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
        if (qtyOrdered + dvdList.length >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full");
            return;
        }

        for (int i = 0; i < dvdList.length; ++i) {
            itemsOrdered[qtyOrdered++] = dvdList[i];
        }
        System.out.println("The list of disc has been added");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                if (i == qtyOrdered - 1) {
                    itemsOrdered[i] = null;
                    qtyOrdered--;
                    break;
                }
                for (int j = i; j < qtyOrdered - 1; ++j) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                qtyOrdered--;
                break;
            }
        }
        System.out.println("Remove succeeded");
    }

    public float totalCost() {
        float ans = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            ans += itemsOrdered[i].getCost();
        }
        return ans;
    }

    public void print() {
        float total = 0;
        System.out.println("***********************CART***********************");
        for (int i = 0; i < qtyOrdered; ++i) {
            System.out.println(itemsOrdered[i].toString());
            total += itemsOrdered[i].getCost();
        }
        System.out.println("Total cost: " + total);
        System.out.println("***************************************************");
    }

    public DigitalVideoDisc searchById(int id) {
        for (int i = 0; i < qtyOrdered; ++i) {
            if (itemsOrdered[i].getId() == id) {
                return itemsOrdered[i];
            }
        }
        return null;
    }

    public ArrayList<DigitalVideoDisc> seachByTitle(String title) {
        ArrayList<DigitalVideoDisc> ans = new ArrayList<DigitalVideoDisc>();
        for (int i = 0; i < qtyOrdered; ++i) {
            if (itemsOrdered[i].isMatch(title))
                ans.add(itemsOrdered[i]);
        }
        if (ans.isEmpty()) {
            return null;
        }
        return ans;
    }

}
