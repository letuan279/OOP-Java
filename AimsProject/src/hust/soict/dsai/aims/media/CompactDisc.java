package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public CompactDisc() {

    }

    public CompactDisc(String director, int length, String title, String category, float cost, String artist,
            List<Track> tracks) {
        super(director, length, title, category, cost);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            return;
        }
        System.out.println("This track is already in list");
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            return;
        }
        System.out.println("This track is present in List");
    }

    public int getLength() {
        int sum = 0;
        for (int i = 0; i < tracks.size(); ++i) {
            sum += tracks.get(i).getLength();
        }
        return sum;
    }
}
