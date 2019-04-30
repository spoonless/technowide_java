package musique;

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
	
}
