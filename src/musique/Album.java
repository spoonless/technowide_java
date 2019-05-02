package musique;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Album extends ProductionMusicale implements Comparable<Album>, Iterable<Piste> {
	
	private Integer annee;
	private List<Piste> pistes = new ArrayList<>();
	
	public Album(String titre) {
		this(titre, null);
	}
	
	public Album(String titre, Integer annee) {
		super(titre);
		this.annee = annee;
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

	@Override
	public Duree getDuree() {
		Duree duree = new Duree();
		for (Piste piste : pistes) {
			duree.ajouter(piste.getDuree());
		}
		return duree;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Album) {
			Album album = (Album) obj;
			return super.equals(obj) && Objects.equals(this.annee, album.annee);
		}
		return false;
	}
	
	@Override
	public int compareTo(Album a) {
		int comparaison = this.getTitre().compareTo(a.getTitre());
		if (comparaison == 0) {
			if (this.annee != null && a.annee != null) {
				comparaison = this.annee.compareTo(a.annee);
			}
			else if (this.annee == null) {
				if(a.annee == null) {
					comparaison = 0;
				} else {
					comparaison = -1;
				}
			}
			else {
				comparaison = 1;
			}
		}
		return comparaison;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d", getTitre(), this.annee);
	}

	@Override
	public Iterator<Piste> iterator() {
		return pistes.iterator();
	}
}
