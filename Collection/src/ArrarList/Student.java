package ArrarList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Student Details");
		Student s1=new Student();
		s1.setRollNum(sc.nextInt());
		s1.setName(sc.next());
		System.out.println("Enter Secound Student Details");
		Student s2=new Student();
		s2.setRollNum(sc.nextInt());
		s2.setName(sc.next());
		System.out.println("Enter Secound Student Details");
		Student s3=new Student();
		s3.setRollNum(sc.nextInt());
		s3.setName(sc.next());
		}
      
	ArrayList<Student>studentList=new ArrayList<>();
       studentList.add(s1)
       studentList.add(s2)
       studentList.add(s3)
       System.out.println(studentList)
       System.out.println(0)
       System.out.println(studentList)
       System.out.println(studentList.contains(s1));
       
       /*Iterator<Student1> itr= StudentList.iterator();
       itr.remove();
       while(itr.hasNext()){
       System.out.println(s.getRollNum()+"/t");
       System.out.println(s.getName()+"/n");*/
       
       itr.remove();
       System.out.println(itr.next().getName()+"/t"+itr.next().getName());
       
       System.out.println(studentList);
       
       ListIterator<Student> litr=studentList.listiterator();
       while(litr.hasNext()) {
    	Student s=(Student)litr.next();
    	System.out.println(s.getRollNum()+"/t");
        System.out.println(s.getName()+"/n");
       }
	
	}   
	}

	
		
	

	
		
	}
	


