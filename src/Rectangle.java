
public class Rectangle extends figure {

	Rectangle(double length, double breadth) {
		super(length, breadth);
		
	}

	
	double area() {
		double ar= length*breadth;
		return ar;
	}

	
	double perimeter() {
		
		double perm=2*(length+breadth);
		return perm;
	}

}
