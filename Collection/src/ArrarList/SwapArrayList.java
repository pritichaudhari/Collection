package ArrarList;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer>list2=new ArrayList();
		list2.add(3);
		list2.add(3);
		list2.add(2);
		list2.add(4);
		list2.add(5);
		System.out.println(list2);
		Collections.swap(list2, -1, 2);
		
	}
}
