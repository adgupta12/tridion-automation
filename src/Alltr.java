import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Alltr {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		
		
		Salariedemployee arr[] = new Salariedemployee[100];
		do
		{
		System.out.println("Enter the employee id");
		 int id = Integer.parseInt(br.readLine());
		System.out.println("Enter the Employee name");
		String name = br.readLine();
		System.out.println("Enter the Department name");
		String dept = br.readLine();
		System.out.println("Enter the Rating name");
		int rtng = Integer.parseInt(br.readLine());
		System.out.println("Enter your salary");
		double sal= Double.parseDouble(br.readLine());
		Salariedemployee obj1 = new Salariedemployee(id,name,dept,rtng,sal);
		arr[i++] = obj1; 
		}while(i<2);
		
		arr[0].show();
		arr[1].show();
		//arr[2].show();
		

	}
	
	

}
