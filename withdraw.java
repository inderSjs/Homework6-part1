import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class withdraw implements Runnable 
{
	private BankAccount ac;
	private int amount;

	
	
	public withdraw( BankAccount ac, int amount )
	{
		this.ac = ac;
		this.amount = amount;

	}
	
	public void run()
	{
			for( int i = 1; i <= 20 ; i++)
			{
				ac.withdraw(amount);
			}
		
		
	}

}
