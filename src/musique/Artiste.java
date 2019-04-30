package musique;

import java.util.Objects;

public class Artiste extends Object {
	
	private String nom;
	
	public Artiste(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Artiste) {
			Artiste artiste = (Artiste) obj;
			return Objects.equals(this.nom, artiste.nom);
		}
		return false;
	}
}
