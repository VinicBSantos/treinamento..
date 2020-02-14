package exec3;

/**
 * essa classe é responsavel por armazenar os dados do produto Computador
 * @author vbsantos
 * @since 11/02/2020
 * @version 0.1
 */

public class Computador extends Produto{
	
	String processador = "Ryzen 9", memoria = "32gb", tela = "42 polegada ", placaVideo = "RTX 2660ti";
	
	public void exibirComputador(){
System.out.println(processador);
System.out.println(memoria);
System.out.println(tela);
System.out.println(placaVideo);
exibirTudo();
	}
    

}
