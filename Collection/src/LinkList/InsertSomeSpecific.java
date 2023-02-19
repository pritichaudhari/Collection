package LinkList;

import java.util.LinkedList;

public class InsertSomeSpecific {

	public static void main(String[] args) {
		LinkedList<Integer>itr=new LinkedList<>();
		itr.add(20);
		itr.add(21);
		itr.add(22);
		itr.add(23);
		itr.add(24);
		itr.add (10);
		System.out.println(itr);
		itr.add(0, 10);
		itr.add(3, 34);
		itr.add(5, 56);
		itr.add(7, 67);
		System.out.println(itr);
	}

}
