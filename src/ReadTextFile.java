import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class ReadTextFile {
	public static void main(String[]args) throws IOException  {
		File file = new File("\\Users\\user\\eclipse-workspace\\core java\\src\\userdb.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line="";
		while(line!=null)
		{
			line = br.readLine();
			if(line==null)
			{
				break;
			}
			System.out.println(line);
		}
	}

}
