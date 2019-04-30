package musique;

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
}
