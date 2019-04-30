package musique;

public class AffichageDuree {
	
	public static void main(String[] args) {
		Duree maDuree = new Duree();
		
		Duree autreDuree = new Duree(20);
		
		maDuree.ajouter(autreDuree, autreDuree, autreDuree, autreDuree);
		
		System.out.println(maDuree);
	}

}
