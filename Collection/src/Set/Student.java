package Set;


import java.util.Comparator;
import java.util.TreeSet;
 

public class Student implements Comparator<Student> {
	String name;
	float percentage;
	int rollno;
public Student(String name,int Rollno,float percentage)
{
	this.name=name;
	this.percentage=percentage;
	this.rollno=rollno;
}
public String toString() {
	return this.name+" "+this.percentage+" "+this.rollno;
}
	public static void main(String[] args) {
		Student s1=new Student("Priya", 101, 56.8f);
		Student s2=new Student("Priyanka", 102, 58.8f);
		Student s3=new Student("Puja", 103, 66.8f);
		Student s4=new Student("Priti", 104, 86.8f);
		
		TreeSet<Student>set=new TreeSet<>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		System.out.println(set);
		
	}
	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.name.compareTo(o2.name);
	}
	

}
