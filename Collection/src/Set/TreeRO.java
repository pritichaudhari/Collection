package Set;

import java.util.Comparator;
import java.util.TreeSet;
class ReverseOrder implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		//return o1.compareTo(o2);
		//return -o1.compareTo(o2);
		return o2.compareTo(o1);
	}
	
}

public class TreeRO {

	public static void main(String[] args) {
		TreeSet<String>set=new TreeSet<new ReverseOrder()>
		set.add("Mango");
		set.add("Orange");
		set.add("Apple");
		System.out.println(set);

	}

}
