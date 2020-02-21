package exec11;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class TesteGuI8 {

	private JFrame janela;
	private JPanel painel;
	private JLabel jlSenha;
	private JPasswordField jpwSenha;

	public void iniciaGui() {

		janela = new JFrame("exemplo senha");
		painel = (JPanel) janela.getContentPane();
		jlSenha = new JLabel();
		jpwSenha = new JPasswordField();

		// confi a label senha
		jlSenha.setText("senha");
		jlSenha.setBounds(10, 40, 100, 20);

		jpwSenha.setBounds(60, 40, 100, 20);

		// config painel
		painel.setLayout(null);
		painel.add(jlSenha);
		painel.add(jpwSenha);

		// tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(300, 300);
		janela.setVisible(true);
	}

	public static void main(String[] args) {
    new TesteGuI8().iniciaGui();
	}

}
