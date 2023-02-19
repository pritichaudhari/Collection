//clone ArrayList.
package ArrarList;

import java.util.ArrayList;

public class CloneArrayList {

	public static void main(String[] args) {
		ArrayList<String>list1=new <String>ArrayList();
		list1.add("Priya");
		list1.add("Puja");
		list1.add("Priti");
		list1.add("Prinka");
		list1.add("Praveen");
		System.out.println(list1);
		System.out.println(list1.clone());
	
	}

}
