package LinkList;

import java.util.LinkedList;

public class Join {

	public static void main(String[] args) {
		LinkedList<String>itr=new LinkedList<>();
		itr.add("Priya");
		itr.add("Manisha");
		itr.add("Baharti");
		itr.add("Priti");
		itr.add("Ganesh");
		System.out.println(itr);
		LinkedList<String>itr1=new LinkedList<>();
		itr1.add("Apple");
		itr1.add("Mango");
		itr1.add("Banana");
		itr1.add("Graps");
		itr1.add("Orange");
		System.out.println(itr1);
		LinkedList<String>st=new LinkedList<>();
		st.addAll(itr1);
		st.addAll(itr);
		System.out.print(st);
	}

}
