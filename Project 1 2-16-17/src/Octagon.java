public class Octagon implements Polygon{

	//declares side as double
	private double side; 
	
	//sets side of the octagon
	public void setSide(double side){
		this.side = side;
	}
	
	//returns side of octagon
	public double getSide(){ 
		return side;
	}
	
	//calculates area of the octagon
	public double area () { 
		double area = (2 + (4/Math.sqrt(2))) * side * side;
		area = (double)Math.round(area * 100d) / 100d;
		return area;
	}

	//calculates perimeter of octagon
	public double perimeter() {
		double perimeter = (side*8);
		return perimeter;
	}

}
