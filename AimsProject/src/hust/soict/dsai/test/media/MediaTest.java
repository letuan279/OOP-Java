package hust.soict.dsai.test.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;

public class MediaTest {
    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<>();

        // create cd, dvd, book
        Track track = new Track("The Lion King 3", 12);
        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(track);
        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Tuan", 87, 19.95f);
        CompactDisc cd = new CompactDisc("Le Anh Tuan", 2, "The Lion King 2", "Animation 2", 1.2f, "Tuan Le", tracks);
        Book book = new Book("The Lion King", "Animation", 1.2f);

        mediae.add(dvd);
        mediae.add(cd);
        mediae.add(book);

        for (Media m : mediae) {
            System.out.println(m.toString());
        }
    }
}
