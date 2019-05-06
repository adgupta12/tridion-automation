import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Stack {

	private int top;
	
	private int stack[];
	
	
	 Stack(int size) 
	    {
		 try{
	        stack = new int [size];
	        top = -1;
	    }
	    catch(Exception e){
	    	System.out.println("Please enter some element in stack "+ " " + e);
	    }
	    }

	
	void display()
	{
		for (int i=top ; i>=0; i--)
	    System.out.println(stack[i]);
		
		if (top==-1)
		{
			System.out.println("Stack has underflown");	
		}
		
	}
	
	void  push() throws Exception, NumberFormatException, IOException{
		if (top == stack.length-1)
        {
            System.out.println("Stack is full");
            
        }
		else
		{
			System.out.println("Enter the first element to be pushed");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int item = Integer.parseInt(br.readLine());
			top=top+1;
			stack[top]=item; 
			System.out.println("Top is " + top);
			
		}
       
    }
 
	
   int pop() 
    {
    	if (top==-1){
    		
    		return -1000030;
    	}
    	else{
    		
    		return stack[top--];
    	   
    	
    	}
    }

  
}
