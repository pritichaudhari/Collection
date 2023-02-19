package ArrarList;

import java.util.ArrayList;

public class InsertArrayList {

	public static void main(String[] args) {
		ArrayList<Float>li=new <Float>ArrayList();
		li.add(89.4f);
		li.add(45.7f);
		li.add(89.3f);
		li.add(90.2f);
		li.add(23.3f);
		li.add(0, 78.4f);
		System.out.println(li);
	}

}
