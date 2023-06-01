package filehandling;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Copyfile {

	public static void main(String[] args) throws IOException {
	
		  FileReader fr=new FileReader("C:\\Users\\Binaya\\Documents\\even.txt");
		  FileWriter fw=new FileWriter("C:\\Users\\Binaya\\Documents\\evencopy.txt");
		  int i=0;
		  
		  while((i=fr.read())!=-1)
	         {
			  
			  fw.write(i);
			 
	         }
     fr.close();
     fw.close();
	}

}
