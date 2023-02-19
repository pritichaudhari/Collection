package LinkList;

import java.util.LinkedList;

public class ReplaceElement {
	public static void main(String[] args) {
		
	LinkedList<Integer>itr=new LinkedList<>();
	itr.add(20);
	itr.add(21);
	itr.add(22);
	itr.add(23);
	itr.add(24);
	System.out.println(itr);
	itr.set(0, 435);
	System.out.println(itr);
}
}