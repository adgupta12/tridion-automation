
public class Employee {

	int Emp_ID;
	String Name;
	String Department;
	int Rating;
	
	
	
	
		Employee(int Emp_ID,String Name, String Department,int Rating){
			this.Emp_ID=Emp_ID;
			this.Name=Name;
			this.Department=Department;
			this.Rating=Rating;
			
			
		}

	void show(){
		System.out.println("The Employee id is" + Emp_ID );
		System.out.println("The value of Name is" + Name);
		System.out.println("The value of Department is" + Department);
		
	}
	
	int score(int EmpId){
		
		System.out.println("For the Employee id " +EmpId + "The rating is" + Rating );
		return Rating;
	}

}
