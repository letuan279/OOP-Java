package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

public class Track implements Playable {
    private String title;
    private int length;

    public Track() {
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    public void play() throws PlayerException {
    	if(this.getLength() > 0) {
    		System.out.println("Playing a track: " + this.getTitle());
    		System.out.println("Track length: " + this.getLength());    		
    	}else {
    		throw new PlayerException("ERROR: Track length is non-positive");
    	}
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Track) {
            return this.getTitle().equals(((Track) obj).getTitle()) && this.getLength() == ((Track) obj).getLength();
        }
        return false;
    }
}
