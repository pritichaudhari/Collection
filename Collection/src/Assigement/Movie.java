package Assigement;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Movie implements Comparator<Movie> {
double BoxOffice;
int RelaizeYear;
public Movie(double BoxOffice,int RelaizeYear) {
	this.BoxOffice=BoxOffice;
	this.RelaizeYear=RelaizeYear;
}
public String toString() {
	return this.RelaizeYear+" "+this.BoxOffice;
	
}
	public static void main(String[] args) {
		Vector<Movie>list=new Vector<>();
		list.add(new Movie(11000,3));
		list.add(new Movie(10000,5));
		list.add(new Movie(12000,4));
		list.add(new Movie(14000,2));
		list.add(new Movie(17000,1));
		System.out.println(list);
		
		Collections.sort( list);
		System.out.println(list);
      	}

	public int compare(Movie o1, Movie o2) {

		if(o1.BoxOffice<o2.BoxOffice) 
			return-1;
			else if(o1.BoxOffice>o2.BoxOffice)
				return 1;
			else
		return 0;
	}
	
}
