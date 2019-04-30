package musique;

public class Piste extends ProductionMusicale {

	private Duree duree;
	
	public Piste(String titre, Duree duree) {
		super(titre);
		this.duree = duree;
	}

	@Override
	public Duree getDuree() {
		return duree;
	}
	
}
