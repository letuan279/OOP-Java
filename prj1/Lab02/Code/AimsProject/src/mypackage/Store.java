package mypackage;

import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();

    public void print() {
        if (itemsInStore.isEmpty()) {
            System.out.println("Empty store");
        } else {
            itemsInStore.forEach((item) -> System.out.println(item.toString()));
        }
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (dvd != null) {
            itemsInStore.add(dvd);
            System.out.println("Add successfully!");
        } else {
            System.out.println("Error");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        if (dvd != null) {
            itemsInStore.remove(dvd);
            System.out.println("Remove successfully!");
        } else {
            System.out.println("Error");
        }
    }
}
