package Assigement;
import java.util.Comparator;
import java.util.Queue;

public class Employee implements Comparator<Employee> {
	
	public static final Comapreid Comapreid = null;
	String name;
	 int id;
	 int experience;
	  double salary;
    Employee(String name,int id,int experience, double salary ){
    	this.name=name;
    	this.id=id;
    	this.salary=salary;
    	this.experience=experience;
    }
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.id<o2.id) 
			return-1;
			else if(o1.id>o2.id)
				return 1;
			else
		return 0;
	}
	class CompareName implements Comparator<Employee>{
		public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
		}
		public static void main(String[] args) {
			Employee e1=new Employee("Pranali", 104, 45000, 2);
			Employee e2=new Employee("Puja", 101, 5000, 1);
			Employee e3=new Employee("Pranali", 102, 3000, 4);
			Employee e4=new Employee("Pranali", 103, 35000, 3);
			Employee e5=new Employee("Pranali", 105, 25000, 6);
		}
		Comapreid id=new Comapreid();
		Comapreid name= Comapreid;
		Queue<Employee>em=new Queue<Employee>();
		em.add(e1)
		em.add(e2)
		em.add(e3)
		em.add(e4)
		em.add(e5)
		System.out.priintln(em);
	}
	
}
    