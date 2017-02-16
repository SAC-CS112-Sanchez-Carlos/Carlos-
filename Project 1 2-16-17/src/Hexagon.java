public class Hexagon implements Polygon{

	//declares side as double
	private double side; 
	
	//sets side of the hexagon
	public void setSide(double side){
		this.side = side;
	}
	
	//returns side of hexagon
	public double getSide(){ 
		return side;
	}
	
	//calculates area of the hexagon
	public double area () { 
		double area = ((3 * (Math.pow(3, 0.5))) / 2) * side * side;
		area = (double)Math.round(area * 100d) / 100d;
		return area;
	}

	//calculates perimeter of hexagon
	public double perimeter() {
		double perimeter = (side*6);
		return perimeter;
	}

}
