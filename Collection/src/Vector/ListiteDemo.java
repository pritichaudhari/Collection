package Vector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListiteDemo {

	public static void main(String[] args) {
		List<String> l=new ArrayList();
		l.add("Apple");
		l.add("Mango");
		l.add("Orange");
		l.add("Banana");
	   Iterator itr=l.iterator();
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());
	   }
	   
		
	}

}
