package musique;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ChargeurGestionnaireMusique {
	
	public List<Album> charger(Path path) throws IOException {
		List<Album> albums = new ArrayList<Album>();
		
		for (String ligne : Files.readAllLines(path)) {
			String[] colonnes = ligne.split(";");
			if (colonnes.length > 0) {
				if (colonnes[0].equals("A")) {
					albums.add(new Album(colonnes[1]));
				}
			}
		}
		return albums;
	}

}
