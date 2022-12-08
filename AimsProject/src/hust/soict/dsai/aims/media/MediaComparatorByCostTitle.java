package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

    @Override
    public int compare(Media o1, Media o2) {
        if (o1.getCost() > o2.getCost()) {
            return 1;
        } else if (o1.getCost() < o2.getCost()) {
            return 0;
        } else {
            int compare = o1.getTitle().compareTo(o2.getTitle());
            if (compare < 0) {
                return 1;
            } else if (compare > 0) {
                return -1;
            } else
                return 0;
        }
    }

}
