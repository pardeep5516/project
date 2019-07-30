import java.rmi.*;
public class MyClient
{
	public static void main(String args[])
	{
		try
		{
			Adder stub = (Adder)Naming.lookup("rmi://localhost:5000/D:/py/30_7OS/MyClient.java");
			System.out.println("Sum = :" + stub.add(34, 4));
		}
		catch(Exception e)
		{

		}
	}
}