package Vector;

import java.util.ArrayList;
import java.util.Scanner;

public class Student12 {
	private int positivelist,Negativelist;
	
	public int getPositivelist() {
		return positivelist;
	}

	public void setPositivelist(int positivelist) {
		this.positivelist = positivelist;
	}

	public int getNegativelist() {
		return Negativelist;
	}

	public void setNegativelist(int negativelist) {
		Negativelist = negativelist;
	}

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Postive List");
		sc.nextInt();
		sc.nextInt();
		sc.nextInt();
		sc.nextInt();
		sc.nextInt();
		System.out.println("Enter Negative list");
		sc.nextInt();
		sc.nextInt();
		sc.nextInt();
		sc.nextInt();
		sc.nextInt();
		
		ArrayList<Student12>sc1=new ArrayList<>();
		
	}

}
