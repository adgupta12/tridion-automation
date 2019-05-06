
public class Triangle extends figure {

	
	Triangle(double length, double breadth){
		super(length,breadth);
	}

	@Override
	double area() {
		return 0.5*length*breadth;
	}

	@Override
	double perimeter() {
		double h= Math.sqrt(Math.pow(length, 2)+Math.pow(breadth, 2));
		return h+length+breadth;
	}
}
