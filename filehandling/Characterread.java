package filehandling;

import java.io.FileReader;
import java.io.IOException;
public class Characterread {

	public static void main(String[] args) throws IOException {
		
         FileReader fr=new FileReader("C:\\Users\\Binaya\\Documents\\even.txt");
         int i;
         while((i=fr.read())!=-1)
         {
        	 System.out.print((char)i);
        	
        	 
         }
         fr.close();
         
	}

}
