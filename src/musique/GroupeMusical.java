package musique;

import java.util.ArrayList;
import java.util.List;

public class GroupeMusical extends Artiste {
	
	private List<Artiste> artistes = new ArrayList<>();
	
	public GroupeMusical(String nom) {
		super(nom);
	}

	public List<Artiste> getArtistes() {
		return artistes;
	}
}
