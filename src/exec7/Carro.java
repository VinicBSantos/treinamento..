package exec7;

import javax.swing.JOptionPane;

public class Carro {

	String model;
	String placa;
	int velo;
	String comb;
	double valor;
	String cor;
	boolean vendido = false;
	
	public Carro(String model, String placa, int velo, String comb, double valor,String cor) {
		
		this.model = model;
		this.placa = placa;
		this.velo = velo;
		this.comb = comb;
		this.valor = valor;
		this.cor = cor;
	}

	
	public void exibir() {
	
	JOptionPane.showMessageDialog(null,"-modelo: "+model+"\n-cor: "+cor+"\n-combustivel: "+comb+"\n-Velocidade maxima: "+velo+"Km/h");
	
	}	
}
	

