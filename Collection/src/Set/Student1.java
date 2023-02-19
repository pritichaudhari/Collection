package Set;

import java.util.Comparator;
import java.util.TreeSet;
class CompairedId implements Comparator<Student1>{

	
	public int compare(Student1 o1, Student1 o2) {
		if(o1.id<o2.id)
		return -1;
		else if(o1.id>o2.id)
			return 1;
		else
			return 0;
	}
}
class ComparePercentage implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		if(o1.percentage<o2.percentage)
			return -1;
			else if(o1.percentage>o2.percentage)
				return 1;
			else
				return 0;
	}
	
}
class CompareName implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
    return o1.name.compareTo(o2.name);
	}
	/*public int compare(Student1 o1, Student1 o2) {
		if(o1.name<o2.name)
			return -1;
			else if(o1.name>o2.name)
				return 1;
			else
				return 0;
	}*/
		
	
}
public class Student1 {
	String name;
	float percentage;
	int id;
public Student1(String name,int id,float percentage)
{
	this.name=name;
	this.percentage=percentage;
	this.id=id;
}
public String toString() {
	return this.name+" "+this.percentage+" "+this.id;
}
	public static void main(String[] args) {
		Student s1=new Student("Priya", 101, 56.8f);
		Student s2=new Student("Priyanka", 102, 58.8f);
		Student s3=new Student("Puja", 103, 66.8f);
		Student s4=new Student("Priti", 104, 86.8f);
		CompairedId id=new CompairedId();
		CompareName name=new CompareName();
		ComparePercentage percentage=new ComparePercentage();
		TreeSet<Student1>set1=new TreeSet<>(id);
		TreeSet<Student1>set2=new TreeSet<>(name);
		TreeSet<Student1>set3=new TreeSet<>(percentage);
		set1.add(s1);
		set1.add(s2);
		set1.add(s3);
		set1.add(s4);
		
		set2.add(s1);
		set2.add(s2);
		set2.add(s3);
		set2.add(s4);
		
		set3.add(s1);
		set3.add(s2);
		set3.add(s3);
		set3.add(s4);
		System.out.println(set1);
		System.out.println(set2);
		TreeSet<Student1>obset=(TreeSet<Student1>)set3.descendingSet();
		System.out.println(obset);
	}

	

}
