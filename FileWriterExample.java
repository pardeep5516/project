import java.io.FileWriter;
public class FileWriterExample
{
	public static void main(String[] args)
	{
		try
		{
			FileWriter fw = new FileWriter("sample.txt");
			fw.write("Welcome to java");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Success....!");
	}
}