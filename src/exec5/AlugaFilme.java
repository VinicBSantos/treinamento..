package exec5;

import java.util.Scanner;

public class AlugaFilme {

	/**
	 * essa classe é responsavel por verificar a disponibilidade do aluguel de filmes
	 * @author vbsantos
	 * @since 11/02/2020
	 * @version 0.1
	 */
	
public static void main (String [] args){
		
	Scanner scan=new Scanner (System.in);
	
	 //disponibilidade do filme
//true=disponivel   false=não disponivel
	  boolean inception = true;
	  boolean stolen = true;
	
	  //valor aluguel diario
		double vad = 2.50;
		
		//filmes
		System.out.println("qual filme você quer");
		System.out.println(" ");
		System.out.println("1- Inception");
        System.out.println("2- Stolen");
        System.out.println(" ");
        System.out.println("(digite o numero correspondente)");
        System.out.println(" ");
	  //Scanner Filmes
        int filme=scan.nextInt();
        
        		
  switch (filme){
          
case 2 :
	if (stolen==true) {
		System.out.println("o filme esta disponivel!");
		System.out.println(" ");
	}else {
		System.out.println("o filme não esta disponivel");
		System.out.println(" ");
	}
		
	break;
	
case 1 :
	if (inception==true) {
		System.out.println("o filme esta disponivel!");
		System.out.println(" ");
	}else {
		System.out.println("o filme não esta disponivel");
		System.out.println(" ");
	}   
	break;
	
 }
//verificar solicitação
  System.out.println("vai alugar o filme?");
  System.out.println("1-sim");
  System.out.println("2-não");
  System.out.println(" ");
  int verif=scan.nextInt();

  
  if (verif==1){
//Dias alugados			
	System.out.println("por quantos dias o filme sera alugado:");
	int dias =scan.nextInt();
	
//valor a pagar
	double vp = vad*dias;
System.out.println("total a pagar:"+vp);
System.out.println(" ");
	//valor pago
	System.out.println("valor pago pelo cliente:");
	double vpago=scan.nextDouble();
	
	if (vpago >= vp) { 
		  System.out.println("aluguel realizado com sucesso");
	}else {
		System.out.println("não é possivel alugar");	
	}
  
  }else {
	  System.out.println("fim da transação");
	  
  }
	
}

}