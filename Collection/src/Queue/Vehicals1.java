package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Vehicals1 {

	public static void main(String[] args) {
		Vehicals vr1=new Vehicals("Audi","Disel",10000,"Car",true,true);
		Vehicals vr2=new Vehicals("Traveller","Disel",15000,"Transport",true,true);
		Vehicals vr3=new Vehicals("Swift","Disel",12000,"Transport",true,false);
		Vehicals vr4=new Vehicals("Truck","Disel",11000,"Car",false,true);
		
		PriorityQueue<Vehicals>vr=new PriorityQueue<>();
		vr.add(vr1);
		vr.add(vr2);
		vr.add(vr3);
		vr.add(vr4);
		System.out.println(vr);
		
		Iterator<Vehicals>itr=Vehicals.iterator();
		System.out.println("List of cars on prices /nname /tprize");
		while(itr.hasNext()) {
			Vehicals v =itr.next();
			if(v.getVehical().equals("car")) {
				System.out.println(v.getName()+" "+v.getPrize());
			}
		}
	}
	}


