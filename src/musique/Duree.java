package musique;

/**
 * Une classe pour représenter une durée.
 * @author david
 * @since 1.0
 */
public class Duree implements Comparable<Duree> {
	
	private static final String FORMAT_CHAINE_CARACTERES = "%1$d:%2$02d";
	private static final int NOMBRE_SECONDES_DANS_UNE_MINUTE = 60;
	private int tempsTotalEnSecondes;
	
	@Override
	public int compareTo(Duree duree) {
		return this.tempsTotalEnSecondes - duree.tempsTotalEnSecondes;
	}
	
	/**
	 * 
	 * @param duree1 première durée
	 * @param duree2 deuxième durée
	 * @return La durée la plus longue des deux
	 */
	public static Duree getLaPlusLongue(Duree duree1, Duree duree2) {
		Duree resultat = null;
		if(duree1.tempsTotalEnSecondes > duree2.tempsTotalEnSecondes) {
			resultat = duree1;
		} else {
			resultat = duree2;
		}
		return resultat;
	}
	
	/**
	 * Une durée de 0 seconde.
	 */
	public Duree() {
	}

	/**
	 * @param secondes Le nombre de secondes de la durée
	 */
	public Duree(int secondes) {
		this(0, secondes);
	}
	
	/**
	 * @param minutes Le nombre de minutes de la durée
	 * @param secondes Le nombre de secondes de la durée
	 */
	public Duree(int minutes, int secondes) {
		this.ajouter(minutes, secondes);
	}

	/**
	 * Crée une durée identique en temps à la durée passée en paramètre
	 * @param duree une durée
	 */
	public Duree(Duree duree) {
		this(0, duree.tempsTotalEnSecondes);
	}

	/**
	 * @param secondesSupplementaires nombre de secondes à ajouter
	 */
	public void ajouter(int secondesSupplementaires) {
		tempsTotalEnSecondes += secondesSupplementaires;
	}

	public void ajouter(int minutes, int secondes) {
		tempsTotalEnSecondes += secondes + NOMBRE_SECONDES_DANS_UNE_MINUTE * minutes;
	}
	
	public void ajouter(Duree premiereDuree, Duree... durees) {
		this.tempsTotalEnSecondes += premiereDuree.tempsTotalEnSecondes;
		for(Duree duree : durees) {
			this.tempsTotalEnSecondes += duree.tempsTotalEnSecondes;
		}
	}
	
	public int getMinutes() {
		return tempsTotalEnSecondes / NOMBRE_SECONDES_DANS_UNE_MINUTE;
	}
	
	public int getSecondes() {
		return tempsTotalEnSecondes % NOMBRE_SECONDES_DANS_UNE_MINUTE;
	}
	
	public int getTempsTotalEnSecondes() {
		return tempsTotalEnSecondes;
	}
	
	@Override
	public String toString() {
		return String.format(FORMAT_CHAINE_CARACTERES, this.getMinutes(), this.getSecondes());	
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Duree) {
			Duree duree = (Duree) obj;
			return duree.tempsTotalEnSecondes == this.tempsTotalEnSecondes;
		}
		return false;
	}

}
