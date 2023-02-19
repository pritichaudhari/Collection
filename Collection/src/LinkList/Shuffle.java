package LinkList;

import java.util.Collections;
import java.util.LinkedList;

public class Shuffle {

	public static void main(String[] args) {
		LinkedList<Integer>itr=new LinkedList<>();
		itr.add(20);
		itr.add(21);
		itr.add(22);
		itr.add(23);
		itr.add(24);
		Collections.shuffle(itr);
		System.out.println(itr);
	}

}
