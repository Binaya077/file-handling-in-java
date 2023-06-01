package filehandling;
import java.io.FileWriter;
import java.io.IOException;

public class Characterstream {

	public static void main(String[] args) throws IOException { 
		
           FileWriter fw=new FileWriter("C:\\Users\\Binaya\\Documents\\test.txt");
           fw.write("my name is Binaya pokhrel");
           fw.close();
           System.out.println("success");
	}

}
