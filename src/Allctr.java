import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Allctr {

	
	public static void main(String[] args) throws Exception {
		
		int sz,opt;
		
		System.out.println("Enter the size of the stack");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sz = Integer.parseInt(br.readLine());
		
		
		Stack obj1 = new Stack(sz);
		
	     
	        do{
	        	System.out.println("1. PUSH ");
	    	    System.out.println("2. POP ");
	    	    System.out.println("3. DISPLAY STACK ");
	    	    System.out.println("4. EXIT ");
	    	    System.out.println("\n Enter Your Option: ");
	    	    
	    		opt = Integer.parseInt(br.readLine());
	            switch(opt)
	            {
	                case 1: 
	                        obj1.push();
	                    	 break;

	                case 2: 
	                	
	               
	                	int j=obj1.pop();
	                	if(j==-1000030)
	                		
	                		System.out.println("Stack has underflown");
	                	else
	                	
	                        System.out.println("The element popped out is "+j);
	                        
	                        
	                        
	                        break;
	                

	                case 3: obj1.display();
	                        break;
	                case 4: System.exit(0);
	                break;
	                default:System.out.println("Invalid choice");
	                
	                 

	            }
	            
	        }while(opt!=4);

	    }
		
		
		
	}


