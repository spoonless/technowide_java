package musique;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChargeurGestionnaireMusique {

	private Map<String, Artiste> artistesMap = new HashMap<>();
	private List<Album> albums = new ArrayList<Album>();
	
	public List<Album> getAlbums() {
		return albums;
	}
	
	public void charger(Path path) throws IOException {
		Album albumCourant = null;
		for (String ligne : Files.readAllLines(path)) {
			String[] colonnes = ligne.split(";");
			if (colonnes.length > 0) {
				if (isLigneAlbum(colonnes)) {
					albumCourant = creerAlbum(colonnes);
				} else if (isLignePiste(colonnes)) {
					creerPiste(albumCourant, colonnes);
				}

			}
		}
	}

	private void creerPiste(Album albumCourant, String[] colonnes) {
		Piste piste = new Piste(colonnes[1], Duree.valueOf(colonnes[2]));
		albumCourant.ajouter(piste);
	}

	private Album creerAlbum(String[] colonnes) {
		Album albumCourant;
		albumCourant = new Album(colonnes[1]);
		albums.add(albumCourant);
		if (colonnes.length >= 3) {
			String nomArtiste = colonnes[2];
			Artiste artiste = creerArtiste(nomArtiste);
			albumCourant.setArtiste(artiste);
		}
		return albumCourant;
	}

	private Artiste creerArtiste(String nomArtiste) {
		Artiste artiste = null;
		if (artistesMap.containsKey(nomArtiste)) {
			artiste = artistesMap.get(nomArtiste);
		} else {
			artiste = new Artiste(nomArtiste);
			artistesMap.put(nomArtiste, artiste);
		}
		return artiste;
	}

	private boolean isLigneAlbum(String[] colonnes) {
		return colonnes[0].equals("A") && colonnes.length >=2;
	}

	private boolean isLignePiste(String[] colonnes) {
		return colonnes[0].equals("P")  && colonnes.length >=3;
	}
}
