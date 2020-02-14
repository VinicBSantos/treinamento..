package exec7;
/**
 * exemplo de Vetor
 * @author vbsantos
 * @since 13/02/2020 
 */


public class Vetor {

	public static void main(String[] args) {
		
		int qtd[]= new int[4];
        qtd[0]= 10;
        qtd[3]= 4;
        
        System.out.println("valor do vetor " +qtd);
        
        for (int i=0; i<qtd.length; i++) {
        	System.out.println("valor do vetor"+qtd[i]);
        }
	}

}
