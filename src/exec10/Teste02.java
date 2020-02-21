package exec10;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Teste02 {

	public static void main(String[] args) {
		
		try {
			PrintStream gravador= new PrintStream ("saida.txt");
		
			gravador.println("texto");
			gravador.println("texto");
			gravador.println("texto");
			gravador.println("texto");
			gravador.println("texto");
			
			gravador.close();
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
