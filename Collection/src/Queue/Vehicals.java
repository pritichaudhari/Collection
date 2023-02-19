package Queue;

public class Vehicals {
	String name, Fuel;
	double prize;
	Boolean actomatedtype,ac;
	String Vehical;
    
    public Vehicals(String string, String string2, int i, String string3, boolean b, boolean c) {
    this.name=name;
    this.prize=prize;
    this.actomatedtype= actomatedtype;
    this.ac=ac;
    this.Fuel=Fuel;
    this.Vehical=Vehical;
    }
	
	public String getName() {
		return name;
	}

	public Boolean getAc() {
		return ac;
	}
	public void setAc(Boolean ac) {
		this.ac = ac;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getFuel() {
		return Fuel;
	}

	public void setFuel(String fuel) {
		Fuel = fuel;
	}

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

	public Boolean getActomatedtype() {
		return actomatedtype;
	}

	public void setActomatedtype(Boolean actomatedtype) {
		this.actomatedtype = actomatedtype;
	}

	public String getVehical() {
		return Vehical;
	}

	public void setVehicals(String vehical) {
		Vehical = vehical;
	}
  public String toString() {
	   return this.name+" "+this.ac+" "+this.prize+" "+this.Fuel+" "
	   		+ ""+this.Vehical+" "+this.actomatedtype;
   }



}


