package exec3;

/**
 * essa classe � responsavel por armazenar as fun��es a serem realizadas
 * @author vbsantos
 * @since 11/02/2020
 * @version 0.1
 */

public class Produto {

		
	  String nome = "";
	  int qtd = 100, qtdV = 50;
	  double custo = 10, pctLucro = 0.25, valor, lucro;
	  
	  public void exibirNome() {
		  if (nome != null){ 
		    System.out.println("nome do produto: "+nome);
		  } else{
			  System.out.println("nome � nulo");
		  }
		}
		
	  public void exibirValor(){
		
		  if (custo > 0 && pctLucro > 0) {
		System.out.println("o valor � de: "+((custo*pctLucro)+custo));
		  } else{
			  System.out.println("algumo dos valores s�o invalidos!");
		  }
	  }
		  
	  public void exibirLucro(){
		  if (pctLucro > 0) {
		  System.out.println("o lucro foi de: "+(custo*pctLucro));
		  }else{
			 System.out.println("o valor � invalido");
		  }
	 }
	  
	  public void exibirTudo(){
		  System.out.println(nome);
		  System.out.println(custo);
		  System.out.println(valor);
		  System.out.println(lucro);
		  
	  }
		
	

}
