import java.io.FileWriter;
import java.io.IOException;
class CreateFile
{
	public static void main(String[] args)throws IOException
	{
		String str = "File handling in java using file writer and File Reader";
		FileWriter fw = new FileWriter("output.txt");
		for(int i = 0; i < str.length();i++)
		{
			fw.write(str.charAt(i));
		}
		System.out.println("Writing successfull");
		fw.close();
	}
}