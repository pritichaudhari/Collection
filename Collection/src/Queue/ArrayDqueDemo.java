package Queue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDqueDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer>aq=new ArrayDeque<>();
		aq.add(33);
		aq.addFirst(11);
		aq.addLast(66);
		aq.add(44);
		aq.offerFirst(22);
		aq.offerLast(89);
		//aq.contains(null);
		//aq.descendingIterator();
		System.out.println(aq);
		Iterator itr=aq.descendingIterator();
		
			
		}
		
	}

}
