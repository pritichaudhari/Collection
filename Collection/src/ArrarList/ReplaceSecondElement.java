package ArrarList;

import java.util.ArrayList;

public class ReplaceSecondElement {

	public static void main(String[] args) {
		ArrayList<String>list1=new <String>ArrayList();
		list1.add("Priya");
		list1.add("Rachita");
		list1.add("Rani");
		list1.add("komal");
		list1.add("kiran");
		list1.add("divya");
		list1.add("mona");
		System.out.println(list1);
		list1.set(2, "Pavan");
		System.out.println(list1);
	}

}
