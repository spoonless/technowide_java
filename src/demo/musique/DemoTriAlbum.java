package demo.musique;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import musique.Album;
import musique.ComparateurAlbumParAnnee;

public class DemoTriAlbum {

	public static void main(String[] args) {
		
		List<Album> albums = new ArrayList<>();
		
		albums.add(new Album("Z"));
		albums.add(new Album("a", 2019));
		albums.add(new Album("a", 1978));
		albums.add(new Album("b"));
		
		System.out.println(albums);
		
		Collections.sort(albums, new ComparateurAlbumParAnnee());

		System.out.println(albums);
	}

}
