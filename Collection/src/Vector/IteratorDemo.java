package Vector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(11);
		l.add("Priya");
		l.add(44);
		l.add("Priti");
		ListIterator li=l.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("----------------------");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
	}

}
