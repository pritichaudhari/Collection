package Set;

import java.util.Comparator;
import java.util.TreeSet;
class ReverseOrder1 implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length()<o2.length())
			return -1;
			else if(o1.length()>o2.length())
				return 1;
			else
				return o1.compareTo(o2);
	}
	
}

public class StringReverse {

	public static void main(String[] args) {
		TreeSet<String>set=new TreeSet<>();
		set.add("ABCD");
		set.add("A");
		set.add("CD");
		set.add("BCD");
		set.add("AB");
		System.out.println(set);

	}

}
