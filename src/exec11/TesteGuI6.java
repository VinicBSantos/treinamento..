package exec11;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TesteGuI6 {

	private JFrame janela;
	private JPanel painelDaJanela;
	private JComboBox cbox;
	private String[] equipamentos = {"monitor","teclado","mouse","moden","celular"};
	
	public void iniciarGuI() {
		//criar janela
		janela = new JFrame("exemplo de combo box");
		painelDaJanela = (JPanel)janela.getContentPane();
		cbox = new JComboBox(equipamentos);
		
		//config combo box
		cbox.setSelectedIndex(-1);
		cbox.setBounds(10, 10, 300, 30);
		cbox.setMaximumRowCount(10);
		
		//config painel
		painelDaJanela.setLayout(null);
		painelDaJanela.add(cbox);
		
		//config tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400,300);
		janela.setVisible(true);
	}
	
	public static void main (String[]args) {
		new TesteGuI6().iniciarGuI();
	}
}
