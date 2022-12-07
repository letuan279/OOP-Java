package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        store.print();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Tuan", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King 2", "Anime", "Tuan", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King 3", "Anime", "Tuan", 87, 18.99f);

        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        store.print();

        store.removeDVD(dvd3);

        store.print();
    }
}
