package Assigement;

import java.util.Collections;
import java.util.LinkedList;

public class Student implements Comparable<Student> {
	String name;
	double Percentage;
	int id;
	public Student(String name,double Percentage,int id) {
		this.name=name;
		this.Percentage=Percentage;
		this.id=id;
	}
	public int compareTo(Student o) {
		if(Percentage==o.Percentage)
		return 0;
		else if(Percentage>o.Percentage)
			return 1;
		else 
			return-1;
	}
	public String toString() {
		return this.name+" "+this.Percentage+" "+this.id;
		
	}
	public static void main(String[] args) {
		LinkedList<Student>list=new LinkedList<>();
		list.add(new Student("Puja",105,49));
		list.add(new Student("Ram",104,65));
		list.add(new Student("Sham",102,85));
		list.add(new Student("Marry",103,75));
		list.add(new Student("Palak",101,45));
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
      

	}

}
