package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable {
    private String director;
    private int length;
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(director, length, title, category, cost);
        this.setId(++nbDigitalVideoDiscs);
    }

    public String getDirector() {
        return this.director;
    }

    public int getLength() {
        return this.length;
    }

    public String toString() {
        return this.getId() + ".DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector()
                + " - " + this.getLength() + ": " + this.getCost() + " $";
    }

    public boolean isMatch(String title) {
        return this.getTitle().contains(title);
    }

    public void play() throws PlayerException {
    	if(this.getLength() > 0) {
    		System.out.println("Playing DVD: " + this.getTitle());
    		System.out.println("DVD length: " + this.getLength());    		
    	}else {
    		throw new PlayerException("ERROR: DVD length is non-positive");
    	}
    }
}
