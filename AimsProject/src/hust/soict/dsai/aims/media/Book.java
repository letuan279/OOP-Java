package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();

	public Book() {

	}

	public Book(String title, String category, float cost) {
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
	}

	public void addAuthor(String authorName) {
		if (!authors.contains(authorName)) {
			authors.add(authorName);
			return;
		}
		System.out.println(authorName + " is already in Array");
	}

	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
			return;
		}
		System.out.println(authorName + " is present in Array");
	}

	public String toString() {
		return this.getId() + ".CD - " + this.getTitle() + " - " + this.getCategory() + ": " + this.getCost() + " $";
	}

}
