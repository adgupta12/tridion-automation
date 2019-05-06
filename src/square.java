
public class square extends figure{

	square(double l) {
		super(l, l);
		// TODO Auto-generated constructor stub
	}

	
	double area() {
		return length*breadth;
	}

	
	double perimeter() {
		
		return 2*(length+breadth);
	}

}
