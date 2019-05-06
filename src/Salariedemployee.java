
public class Salariedemployee extends Employee  {
double salary;
	
Salariedemployee(int Emp_ID, String Name, String Department,int rating,double salary)
{
		super(Emp_ID,Name,Department,rating);
		this.salary=salary;
		
}

void show(){
	System.out.println("The Employee id is" + Emp_ID );
	System.out.println("The value of Name is" + Name);
	System.out.println("The value of Department is" + Department);
	System.out.println("The new salary is " + hike());
	
}

	
	
	double hike(){
				
		if(Rating==1)
				salary= 1.2*salary;
        else if(Rating==2)	
				salary= 1.15*salary;
        else if(Rating==3)	
			salary= 1.1*salary;

	
return salary;				
				
		
		
			
		}
	

		
		
		
		
		
		
		
		
		
	}

