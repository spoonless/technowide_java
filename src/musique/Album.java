package musique;

import java.util.ArrayList;
import java.util.List;

public class Album {
	
	private String titre;
	private Integer annee;
	private Artiste artiste;
	private List<Piste> pistes = new ArrayList<>();
	
	public Album(String titre) {
		this(titre, null);
	}
	
	public Album(String titre, Integer annee) {
		this.titre = titre;
		this.annee = annee;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public boolean isAnneeConnue() {
		return annee == null;
	}
	
	public Integer getAnnee() {
		return annee;
	}
	
	public void ajouter(Piste piste) {
		pistes.add(piste);
	}
	
	public List<Piste> getPistes() {
		return pistes;
	}

	public Duree getDuree() {
		Duree duree = new Duree();
		for (Piste piste : pistes) {
			duree.ajouter(piste.getDuree());
		}
		return duree;
	}
	
	public Artiste getArtiste() {
		return artiste;
	}
	
	public void setArtiste(Artiste artiste) {
		this.artiste = artiste;
	}
}
