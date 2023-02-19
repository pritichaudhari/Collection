package TreeSet;

import java.util.Comparator;
class Comapareaddress implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1.)
		return 0;
	}
	
}

public class TreeSetDemo{
        int memberid;
		String name;
		String address;
		double bil;
  public TreeSetDemo(int memberid,String name,String address,double bil) {
	  this.memberid=memberid;
	  this.address=address;
	  this.bil=bil;
	  this.name=name;
  }
  public String toString() {
	return this.address+"  "+this.bil+" "+this.memberid+" "+this.name+" ";
	  
  }
	public static void main(String[] args) {
		TreeSetDemo t1=new TreeSetDemo (103, "Priya", "Pune", 45000);
		TreeSetDemo t2=new TreeSetDemo (104, "Puja", "Pune", 5000);
		TreeSetDemo t3=new TreeSetDemo (101, "Priti", "nasik", 49000);
	}
	@Override
	

}
