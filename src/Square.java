class Square extends GeometricObject implements Colorable {

	private double side;
	
	public Square() {
	}

	public Square(double side) {
	this.side = side;	
	}
	
	/** Return side */
	public double getSide() {
		return side;
	}
	
	/** Return area of perimeter */
	public double getArea() {
		return side*side;
	}
	
	/** Return perimeter of square */
	public double getPerimeter() {
		return side*4;
	}
	
	public void howToColor() {
		System.out.println("Color all four sides"); 
	}
}