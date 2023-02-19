package Map;

import java.util.HashMap;

public class MapDemo {

	public MapDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		HashMap<Integer, String>hs=new HashMap<>();
		hs.put(1, "ABC");
		hs.put(2, "XYZ");
		hs.put(3, "MNO");
		hs.put(4, "PQR");
		hs.put(1, "EFG");
		//System.out.println(hs);
		//hs.get(3);
		//System.out.println(hs.get(2));
		//System.out.println(hs.isEmpty());
		//System.out.println(hs.remove(2));
		//System.out.println(hs);
		//System.out.println(hs.containsValue("MNO"));
		//System.out.println(hs.putIfAbsent(2, "XYZ"));
		//System.out.println(hs.replace(2, "PQR"));
		//System.out.println(hs);
		//System.out.println(hs.hashCode());
		//System.out.println(hs.replace(2, "EFG", null));
		//System.out.println(hs.size());
		//System.out.println(hs.clone());
		//System.out.println(hs.entrySet(Integer))
		//System.out.println(hs.values());
		//System.out.println(hs.toString());
		//hs.clear();
		//System.out.println(hs.getOrDefault(3, "Ohg"));
		System.out.println(hs);
	}

}
