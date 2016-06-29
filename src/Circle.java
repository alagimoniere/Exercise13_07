/** Circle.java: The circle class that extends GeometricObject */
class Circle extends GeometricObject { 
	
	private double radius;
	
	public Circle() {
	}
	
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    /** Return radius of circle */
    public double getRadius(){
        return radius;
    }

    /** Set radius of circle */
    public void setRadius(double radius){
        this.radius = radius;
    }

    /** Return area of circle */
    public double getArea(){
        return radius * radius * Math.PI;
    }

    /** Return diameter of circle */
    public double getDiameter(){
        return 2 * radius;
    }

    /** Return perimeter of circle */
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    /** Return description of circle */
    public String toString() {
    	return "The circle is created " + getDateCreated() +
            " and the radius is " + radius;
    }
 
}