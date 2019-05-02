package demo.musique;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import musique.Album;
import musique.ChargeurGestionnaireMusique;

public class DemoChargeurGestionnaireMusique {
	
	public static void main(String[] args) throws IOException {
		
		ChargeurGestionnaireMusique gestionnaireMusique = new ChargeurGestionnaireMusique();
		List<Album> albums = gestionnaireMusique.charger(Paths.get("musique.csv"));
		
		System.out.println("Nombre d'albums chargés : " + albums.size());
		
		for(Album album : albums) {
			System.out.println(album);
			System.out.println(album.getDuree());
		}
		
	}

}
