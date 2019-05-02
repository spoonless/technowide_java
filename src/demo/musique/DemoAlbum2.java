package demo.musique;

import musique.Album;
import musique.Artiste;
import musique.GroupeMusical;

public class DemoAlbum2 {

	public static void main(String[] args) {
		
		GroupeMusical groupeMusical = new GroupeMusical("Pink Floyd");
		groupeMusical.getArtistes().add(new Artiste("David Gilmour"));
		groupeMusical.getArtistes().add(new Artiste("Roger Waters"));
		groupeMusical.getArtistes().add(new Artiste("Nick Mason"));

		Album album = new Album("The Wall");
		album.setArtiste(groupeMusical);
	}
}
