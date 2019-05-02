package demo.musique;

import musique.Duree;
import musique.Piste;

public class DemoPiste {

	public static void main(String[] args) {
		Piste premierePiste = new Piste("Hello", new Duree(1, 32));
		Piste deuxiemePiste = new Piste("Hello", new Duree(1, 32));
		
		Object o = premierePiste;
		
		if (o.equals(deuxiemePiste)) {
			System.out.println("C'est gagné !");
		} else {
			System.err.println("C'est perdu !");
		}
	}
}
