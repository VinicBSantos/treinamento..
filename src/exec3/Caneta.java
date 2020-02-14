package exec3;

/**
 * essa classe é responsavel por armazenar os dados do produto Caneta
 * @author vbsantos
 * @since 11/02/2020
 * @version 0.1
 */

public class Caneta extends Produto{

	String marca="Bic", cor="preta", material="aluminio", formato="padrão";
	
	public void exibirCaneta(){
System.out.println(marca);
System.out.println(cor);
System.out.println(material);
System.out.println(formato);
exibirTudo();
	}
}
