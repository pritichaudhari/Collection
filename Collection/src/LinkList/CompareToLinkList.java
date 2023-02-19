package LinkList;

import java.util.LinkedList;

public class CompareToLinkList {

	public static void main(String[] args) {
		LinkedList<Integer>itr=new LinkedList<>();
		itr.add(20);
		itr.add(21);
		itr.add(22);
		itr.add(23);
		itr.add(24);
		System.out.println(itr);
		LinkedList<Integer>itr1=new LinkedList<>();
		itr1.add(566);
		itr1.add(281);
		itr1.add(262);
		itr1.add(293);
		itr1.add(244);
		itr.equals(itr1);
		System.out.println(itr1);
	}

}
