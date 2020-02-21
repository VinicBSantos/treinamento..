package exec11;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TesteGuI1 {

	//Declarar variaveis de referebcua
	private static JFrame janela;
	private static JButton botao;
	
	
	public static void main(String[] args) {
		
		//criar nova tela(instancia)
		janela = new JFrame("minha primeira tela");
		//criar novo botão(instancia)
		botao = new JButton("Clique Aqui");
		//adicionar o botão no painel da janela
		janela.getContentPane().add(botao);
		//configurar o tamanho da tela
		janela.setSize(300, 300);
		//configurar a visibilidade da tela
		janela.setVisible(true);
		//informar que a tela não tem layout pré definido
		janela.getContentPane().setLayout(null);
		

	}

}
