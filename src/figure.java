
abstract class figure {

	public double length;
	public double breadth;
	
	
	figure(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
		
	}
	
	abstract double area();
	
	abstract double perimeter();
	
}
