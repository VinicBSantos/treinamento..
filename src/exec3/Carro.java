package exec3;

/**
 * essa classe é responsavel por armazenar os dados do produto Carro
 * @author vbsantos
 * @since 11/02/2020
 * @version 0.1
 */

public class Carro extends Produto {

String marca = "Fiat", modelo = "Marea", motor = "2.4 turbo";

int ano = 2006;
	
	public void exibirCarro(){
System.out.println(marca);
System.out.println(modelo);
System.out.println(motor);
System.out.println(ano);
exibirTudo();
	}
}


