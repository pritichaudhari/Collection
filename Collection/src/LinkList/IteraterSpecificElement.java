package LinkList;

import java.util.Iterator;
import java.util.LinkedList;

public class IteraterSpecificElement {

	public static void main(String[] args) {
		LinkedList<Integer>itr=new LinkedList<>();
		itr.add(20);
		itr.add(21);
		itr.add(22);
	    itr.add(23);
		itr.add(24);
		System.out.println(itr);
		System.out.println(itr.get(3));
		Iterator t1=itr.iterator();
		while(t1.hasNext()) {
			System.out.println(t1.next());
			
		}
		
	}

}
