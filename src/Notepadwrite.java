import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Notepadwrite {

	

	public static void main(String[] args) throws Throwable {
		
		FileWriter fr=new FileWriter("D:\\Cachebuster\\write.txt");
		BufferedWriter br=new BufferedWriter(fr);

		br.write("skadjaskdj");
		br.newLine();
		br.write("abcd4321");
		br.newLine();
		

		br.close();

	}

}
