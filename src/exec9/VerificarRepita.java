package exec9;

/**
 * contador de letras
 * @author vbsantos
 * @since 17/02/2020
 * @version 0.1
 */
public class VerificarRepita {

	public static void main(String[] args) {
	
		String str = "11 781164159";
		
		if (str.startsWith("11 ")) {
			System.out.println("� da regi�o de S�o paulo");
		}else {
			System.out.println("n�o � da regi�o de S�o paulo");
		}

	}

}
