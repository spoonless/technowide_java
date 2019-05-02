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
				if (colonnes[0].equals("A") && colonnes.length >=2) {
					albumCourant = new Album(colonnes[1]);
					albums.add(albumCourant);
				} else if (colonnes[0].equals("P")  && colonnes.length >=3) {
					Piste piste = new Piste(colonnes[1], toDuree(colonnes[2]));
					albumCourant.ajouter(piste);
				}

			}
		}
		return albums;
	}

	private Duree toDuree(String valeur) {
		String[] minutesSecondes = valeur.split(":", 2);
		if (minutesSecondes.length == 1) {
			int secondes = Integer.valueOf(minutesSecondes[0]);
			return new Duree(secondes);
		} else if (minutesSecondes.length == 2) {
			int minutes = Integer.valueOf(minutesSecondes[0]);
			int secondes = Integer.valueOf(minutesSecondes[1]);
			return new Duree(minutes, secondes);
		}
		return null;
	}

}
