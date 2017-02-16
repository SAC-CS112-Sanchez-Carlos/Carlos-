public class Quadrilateral implements Polygon{

	//declares sides1,2,3, & 4 as double and oppositeAngleA,B
	private double side1, side2, side3, side4;
	private double oppositeAngleA, oppositeAngleB;
	
	//sets side1
	public void setSide1(double side1){
		this.side1 = side1;
	}
	//returns side1
	public double getSide1(){ 
		return side1;
	}
	
	//sets side2
	public void setSide2(double side2){
		this.side2 = side2;
	}
	//returns side2
	public double getSide2(){ 
		return side2;
	}
	
	//sets side3
	public void setSide3(double side3){
		this.side3 = side3;
	}
	//returns side3
	public double getSide3(){ 
		return side3;
	}
	
	//sets side4
	public void setSide4(double side4){
		this.side4 = side4;
	}
	//returns side4
	public double getSide4(){ 
		return side4;
	}
	
	//sets oppositeAngleA
	public void setAngleA(double oppositeAngleA){
		this.oppositeAngleA = oppositeAngleA;
	}
	//returns oppositeAngleA
	public double setAngleA(){ 
		return oppositeAngleA;
	}
	
	//sets oppositeAngleB
	public void setAngleB(double oppositeAngleB){
		this.oppositeAngleB = oppositeAngleB;
	}
	//returns oppositeAngleB
	public double setAngleB(){ 
		return oppositeAngleB;
	}
	
	//calculates area of the Quadrilateral
	public double area () { 
		double s = .5*(side1+side2+side3+side4);
		double area = Math.sqrt((s-side1)*(s-side2)*(s-side3)*(s-side4)-side1*side2*side3*side4*Math.cos(.5*(oppositeAngleA+oppositeAngleB)));
		area = (double)Math.round(area * 1d) / 1d;
		return area;
	}

	//calculates perimeter of Quadrilateral
	public double perimeter() {
		double perimeter = (side1+side2+side3+side4);
		return perimeter;
	}

}
