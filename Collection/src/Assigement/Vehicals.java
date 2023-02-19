package Assigement;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Vehicals implements Comparable<Vehicals>{
  private String Vehical;
  private double Prize;
 public Vehicals(String Vehical,double Prize){
	 this.Prize=Prize;
	 this.Vehical=Vehical;
 }
 public String toString() {
	return this.Vehical+" "+this.Prize;
	 
 }
 public int compareTo(Vehicals o) {
		
		if(Prize==o.Prize)
		return 0;
		else if(Prize>o.Prize)
			return 1;
		else 
			return-1;
}
	public static void main(String[] args) {
		Set <Vehicals >set1=new <Vehicals>();
		set1.add(new Vehicals("Bas",10000));
		set1.add(new Vehicals("Bike",1000));
		set1.add(new Vehicals("Track",15000));
		set1.add(new Vehicals("Car",11000));
	
	System.out.println(set1);
	
	Collections.sort((List<Vehicals>) set1);
	System.out.println(set1);
		}

	}
	