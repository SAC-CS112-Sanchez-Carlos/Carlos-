public class Pentagon implements Polygon{

	//declares side as double
	private double side; 
	
	//sets side of the Pentagon
	public void setSide(double side){
		this.side = side;
	}
	
	//returns side of Pentagon
	public double getSide(){ 
		return side;
	}
	
	//calculates area of the Pentagon
	public double area () { 
		double area = .25* (Math.sqrt(5*(5+2*Math.sqrt(5)))*side*side);
		area = (double)Math.round(area * 100d) / 100d;
		return area;
	}

	//calculates perimeter of Pentagon
	public double perimeter() {
		double perimeter = (side*5);
		return perimeter;
	}

}
