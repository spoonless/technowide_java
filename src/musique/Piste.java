package musique;

import java.util.Objects;

public class Piste {

	private String titre;
	private Duree duree;
	
	public Piste(String titre, Duree duree) {
		this.titre = titre;
		this.duree = duree;
	}

	public Duree getDuree() {
		return duree;
	}
	
	public String getTitre() {
		return titre;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Piste) {
			Piste piste = (Piste) obj;
			return Objects.equals(this.titre, piste.titre) && 
				   Objects.equals(this.duree, piste.duree);
		}
		return false;
	}
	
}
