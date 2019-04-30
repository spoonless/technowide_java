package musique;

import java.util.Objects;

public abstract class ProductionMusicale {
	
	private String titre;
	private Artiste artiste;
	
	public ProductionMusicale(String titre) {
		this.titre = titre;
	}
	
	public abstract Duree getDuree();

	public String getTitre() {
		return titre;
	}
	
	public Artiste getArtiste() {
		return artiste;
	}
	
	public void setArtiste(Artiste artiste) {
		this.artiste = artiste;
	}
	
	public boolean isArtisteConnu() {
		return this.artiste != null;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ProductionMusicale) {
			ProductionMusicale productionMusicale = (ProductionMusicale) obj;
			return Objects.equals(this.titre, productionMusicale.titre) &&
				   Objects.equals(this.artiste, productionMusicale.artiste) &&
				   Objects.equals(this.getDuree(), productionMusicale.getDuree());
		}
		return false;
	}
}
