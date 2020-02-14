package exec7;

import javax.swing.JOptionPane;

public class Locadora {

	static Carro vetorCarro[];

	public static void main(String[] args) {

		vetorCarro = new Carro[10];
		Carro carro1 = new Carro("OPALA", "OLD-1972", 260, "GASOLINA", 20000, "PRETO");
		vetorCarro[0] = carro1;

		Carro carro2 = new Carro("PORSHE", "FON-1242", 320, "GASOLINA", 150000, "AMARELO");
		vetorCarro[1] = carro2;

		Carro carro3 = new Carro("SUPRA", "BLZ-1902", 320, "GASOLINA", 180000, "BRANCO");
		vetorCarro[2] = carro3;

		Carro carro4 = new Carro("UNO", "SLZ-4820", 180, "ALCOOL", 13000, "BRANCO");
		vetorCarro[3] = carro4;

		Carro carro5 = new Carro("GOL", "GOL-9520", 210, "ALCOOL", 50000, "CINZA");
		vetorCarro[4] = carro5;

		Carro carro6 = new Carro("FOX", "KPT-1596", 160, "ALCOOL", 80000, "CINZA");
		vetorCarro[5] = carro6;

		Carro carro7 = new Carro("UNO", "MVP-2226", 180, "GASOLINA", 18000, "PRETO");
		vetorCarro[6] = carro7;

		Carro carro8 = new Carro("CHEVETTE", "MVV-4026", 180, "GASOLINA", 18000, "AMARELO");
		vetorCarro[7] = carro8;

		Carro carro9 = new Carro("FUSCA", "AWP-3267", 160, "GASOLINA", 20000, "AZUL");
		vetorCarro[8] = carro9;

		Carro carro10 = new Carro("GOL", "CSV-3267", 210, "ALCOOL", 20000, "BRANCO");
		vetorCarro[9] = carro10;

		new Locadora();

	}

	Locadora() {
		decisaoBusca();
	}

	public void decisaoBusca() {

		int escolha = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite o modo de busca: \n 1 - Modelo \n 2 - Combustivel \n 3 - velocidade \n 4 - cor "));

		switch (escolha) {
		case 1:
			String model = JOptionPane.showInputDialog("Digite o modelo:").toUpperCase();
			buscamodelo(model);
			break;

		case 2:
			String comb = JOptionPane.showInputDialog("Digite o combustivel:").toUpperCase();
			buscacombustivel(comb);
			break;

		case 3:
			int velo = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade"));
			buscavelocidade(velo);
			break;

		case 4:
			String cor = JOptionPane.showInputDialog("Digite a cor:").toUpperCase();
			buscacor(cor);
			break;

		}
	}

	public void buscamodelo(String model) {
		boolean encontrou = false;

		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].model.equals(model)) {
				vetorCarro[i].exibir();
				encontrou = true;
			}

		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "não existe resultado para sua busca");
		}
	}

	public void buscacombustivel(String comb) {

		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].comb.equals(comb)) {
				vetorCarro[i].exibir();
			}

		}
	}

	public void buscavalor(int valor) {

		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].valor == (valor)) {
				vetorCarro[i].exibir();
			}
		}
	}

	public void buscavelocidade(int velo) {

		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].velo == (velo)) {
				vetorCarro[i].exibir();
			}

		}
	}

	public void buscacor(String cor) {

		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].cor.equals(cor)) {
				vetorCarro[i].exibir();
			}
		}
	}

}
