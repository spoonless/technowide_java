package musique;

import java.util.Comparator;

public class ComparateurAlbumParAnnee implements Comparator<Album> {

	@Override
	public int compare(Album album1, Album album2) {
		int comparaison = 1;
		if (album1.getAnnee() != null && album2.getAnnee() != null) {
			comparaison = album1.getAnnee().compareTo(album2.getAnnee());
		}
		else if (album1.getAnnee() == null) {
			if(album2.getAnnee() == null) {
				comparaison = 0;
			} else {
				comparaison = -1;
			}
		}
		return comparaison;
	}

}
