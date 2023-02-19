package LinkList;

import java.util.LinkedList;

public class DisplayElement {

	public static void main(String[] args) {
		LinkedList<Integer>itr=new LinkedList<>();
		itr.add(20);
		itr.add(21);
		itr.add(22);
		itr.add(23);
		itr.add(24);
		itr.add( 10);
		System.out.println(itr);
		for(int i=0;i<itr.size();i++) {
			System.out.println(itr.get(i));
		}
	}

}
