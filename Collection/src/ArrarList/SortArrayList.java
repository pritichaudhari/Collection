package ArrarList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<String>list1=new <String>ArrayList();
		list1.add("Priya");
		list1.add("Puja");
		list1.add("Priti");
		list1.add("Prinyka");
		list1.add("Praveen");
   		System.out.println( list1);
   		list1.sort(null);
   		System.out.println(list1);
	}

}
