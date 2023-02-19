package LinkList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		LinkedList<String>itr=new LinkedList<>();
		itr.add("Java");
		itr.add("Python");
		itr.add("css");
		itr.addFirst("Php");
		itr.addLast("Dotnet");
		System.out.println(itr);
		/*Iterator t1=itr.iterator();
		while(t1.hasNext()) {
			System.out.println(t1.next());
		}*/
		Iterable t2=(Iterable) itr.iterator();
	while(((Iterator<String>) t2).hasNext()) {
		System.out.println(((Iterator<String>) t2).next());
	}
	}
}
	

