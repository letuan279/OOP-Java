package hust.soict.dsai.aims.media;

public class Disc extends Media {
    private String director;
    private int length;

    public Disc() {

    }

    public Disc(String director, int length, String title, String category, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
