package demo.musique;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import musique.Duree;

public class DemoTriDuree {

	public static void main(String[] args) {
		
		List<Duree> durees = new ArrayList<>();
		
		durees.add(new Duree(2, 13));
		durees.add(new Duree(1, 8));
		durees.add(new Duree(1));
		durees.add(new Duree(10, 24));
		
		System.out.println(durees);
		
		Collections.sort(durees);

		System.out.println(durees);
	}

}
