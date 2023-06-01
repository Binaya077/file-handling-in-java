package filehandling;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Evenodd {

	public static void main(String[] args) throws IOException
	{
		
	PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Binaya\\Documents\\even.txt"));
	PrintWriter pr = new PrintWriter(new FileWriter("C:\\Users\\Binaya\\Documents\\odd.txt"));

	for (int i = 1; i <= 200; i++) {
		if (i % 2 == 0)
		{
		
			pw.println(i);
			
			
		}
		else
		{
			pr.println(i);
		}
	}
	pw.close();
	pr.close();
	}
}
	