package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }

    public void print() {
        if (itemsInStore.isEmpty()) {
            System.out.println("Empty store");
        } else {
            itemsInStore.forEach((item) -> System.out.println(item.toString()));
        }
    }

    public void addMedia(Media media) {
        if (media != null) {
            itemsInStore.add(media);
            System.out.println("Add successfully!");
        } else {
            System.out.println("Error");
        }
    }

    public void removeMedia(Media media) {
        if (media != null) {
            itemsInStore.remove(media);
            System.out.println("Remove successfully!");
        } else {
            System.out.println("Error");
        }
    }
}
