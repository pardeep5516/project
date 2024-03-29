class Prime implements Runnable
{
	long j, c;
	Prime()
	{	
		super();
		c = 0;
	}
	public void run()
	{
		for(long i = 0; i <=100 ;i++)
		{
			for(j = 2; j <=i; j++)
			{
				if(i%j == 0)
					break;
			}
			if(j == i)
			{
				c++;
				System.out.println(c +"th" + " Prime Number = " + i);
			}
		}
	}
}
//Fibonacci Series
class Fib implements Runnable
{
	long a, b, c, n;
	Fib()
	{
		a = c = n = 0;
		b = 1;
	}
	public void run()
	{
		while(n++ < 75)
		{
			System.out.println(n + "th" + "Fibonnaci Number = " + a);
			c = a+b;
			a = b;
			b = c;
			try
			{
				if(n == 50)
				{
					System.out.println("Thread Fibonacci is put into sleep :" );
					Thread.sleep(500);
				}
			}
			catch(InterruptedException e)
			{
				System.out.println("Error : "  + e);
			}
		}
	}
}
public class MyPriFib
{
	public static void main(String args[])
	{
		Thread ct = Thread.currentThread();
		System.out.println("Main Thread Name :" + ct.getName());
		Prime p = new Prime();
		Fib f = new Fib();
		Thread fib = new Thread(f, "Fibonnaci");
		Thread Prime  = new Thread(p, "Prime");
		fib.start();
		System.out.println("Thread " + fib.getName() + "started");
		Prime.start();
		System.out.println("Thread" + Prime.getName() + "started"); 
	}
}
