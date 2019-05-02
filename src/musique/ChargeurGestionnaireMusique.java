package musique;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ChargeurGestionnaireMusique {
	
	public List<Album> charger(Path path) throws IOException {
		List<Album> albums = new ArrayList<Album>();
		Album albumCourant = null;
		for (String ligne : Files.readAllLines(path)) {
			String[] colonnes = ligne.split(";");
			if (colonnes.length > 0) {
				if (isLigneAlbum(colonnes)) {
					albumCourant = new Album(colonnes[1]);
					albums.add(albumCourant);
				} else if (isLignePiste(colonnes)) {
					Piste piste = new Piste(colonnes[1], Duree.valueOf(colonnes[2]));
					albumCourant.ajouter(piste);
				}

			}
		}
		return albums;
	}

	private boolean isLigneAlbum(String[] colonnes) {
		return colonnes[0].equals("A") && colonnes.length >=2;
	}

	private boolean isLignePiste(String[] colonnes) {
		return colonnes[0].equals("P")  && colonnes.length >=3;
	}
}
