package demo.collection;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
	
	public static void main(String[] args) {
		
		Map<String, Integer> mapNombre = new HashMap<>();
		mapNombre.put("un", 1);
		mapNombre.put("deux", 2);
		mapNombre.put("trois", 3);
		
		for(Map.Entry<String, Integer> entree : mapNombre.entrySet()) {
			System.out.println(entree.getKey());
			System.out.println(entree.getValue());
		}
		
	}

}
