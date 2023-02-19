package Vector;

import java.util.Iterator;

public class Stack {

	public static void main(String[] args) {
	java.util.Stack<String>st=new java.util.Stack<>();
	st.push("Mango");
	st.push("Mange");
	st.push("Apple");
	st.push("Graph");
	st.push("Banana");
	System.out.println(st);
    
	/*st.pop();
	System.out.println(st);
    st.peek();
    System.out.println();*/
    st.search(st);
    System.out.println(st);
   
		
	}
	}


