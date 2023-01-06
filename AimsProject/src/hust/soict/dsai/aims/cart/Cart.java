package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.Collections;

import javax.naming.LimitExceededException;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
    
    public ObservableList<Media> getItemsOrdered() {
    	return itemsOrdered;
    }
 
    public void addMedia(Media input) throws LimitExceededException {
        if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
            throw new LimitExceededException("ERROR: The number of media has reached its limit");
        }
        itemsOrdered.add(input);
    }

    public void removeMedia(Media input) {
    	System.out.print("asjdbas");
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
		int size = itemsOrdered.size();
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i = 0; i < size; i++) {
			System.out.println(itemsOrdered.get(i).toString());

		}
		System.out.println("Total cost:" + totalCost() + "$");
	}

	public void search(int id) {
		boolean hasResults = false;
		int size = itemsOrdered.size();
		for (int i = 0; i < size; i++) {
			if (itemsOrdered.get(i).getId() == id) {
				System.out.println(itemsOrdered.get(i));
				hasResults = true;
			}
		}
		if (!hasResults) {
			System.out.println("No match is found");
		}
	}

	public void search(String title) {
		boolean hasResults = false;
		int size = itemsOrdered.size();

		for (int i = 0; i < size; i++) {
			if (itemsOrdered.get(i).getTitle().equals(title)) {
				System.out.println(itemsOrdered.get(i).toString());
				hasResults = true;
			}
		}
		if (!hasResults) {
			System.out.println("No match is found");
		}
	}

}
