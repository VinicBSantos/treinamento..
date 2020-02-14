package exec3;

/**
 * essa classe é responsavel por armazenar os dados do produto Caneca
 * @author vbsantos
 * @since 11/02/2020
 * @version 0.1
 */

public class Caneca extends Produto {

String estampa = "shrek",tamanho ="média", cor = "branco", material = "plastico";
	
	public void exibirCaneca(){
System.out.println(estampa);
System.out.println(tamanho);
System.out.println(cor);
System.out.println(material);
exibirTudo();
	
    }
}
