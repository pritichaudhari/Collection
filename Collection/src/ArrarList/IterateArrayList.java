package ArrarList;

import java.util.ArrayList;
import java.util.ListIterator;

public class IterateArrayList {

	public static void main(String[] args) {
		ArrayList<String>list1=new <String>ArrayList();
		list1.add("Priya");
		list1.add("Puja");
		list1.add("Priti");
		list1.add("Prinka");
		list1.add("Praveen");
		System.out.println(list1);
		//list iteration with iterator
		ListIterator<String>name=list1.listIterator();
		while(name.hasNext());
		{
			System.out.println(name.next());
		}
		System.out.println("Pra");
		ListIterator<String>namelist=list1.listIterator(1);
		while(namelist.hasNext());
		{
		  System.out.println(namelist.next());
		}
		System.out.println("Pu");
		//iterate simple for loop
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
	}

}
