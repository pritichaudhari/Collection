package Vector;

import java.util.ArrayList;
import java.util.Scanner;

public class Student1 {

	public static void main(String[] args) {
	ArrayList<Student>st=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first student "+sc.nextInt());
	Student s1=new Student();
	s1.setName(sc.next());
	s1.setRollno(sc.nextInt());
	System.out.println("Enter secound student"+sc.nextInt());
	Student s2=new Student();
	s2.setName(sc.next());
	s2.setRollno(sc.nextInt());
	System.out.println("Enter third student"+sc.next());
	Student s3=new Student();
	s3.setName(sc.next());
	s3.setRollno(sc.nextInt());
	}

}
