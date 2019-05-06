
public class Account {
	
		   private String name;

		   private long amount;

		   Account(String name, long amount)
		   {
		      this.name = name;
		      setAmount(amount);
		   }

		   void deposit(long amount)
		   {
		      this.amount = this.amount+amount;
		      System.out.println(this.amount);
		   }

		   String getName()
		   {
		      return name;
		   }

		   long getAmount()
		   {
		      return amount;
		   }

		   void setAmount(long amount)
		   {
		      this.amount = amount;
		   }
		

	

	}
	
	
