package exec11;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TesteGuI2 {

	public static void main(String[] args) {

		// defininir tela e suas caracteristicas
		JFrame janela = new JFrame();
		janela.setTitle("Geladeira Tsunami");
		janela.setSize(500, 300);
		janela.getContentPane().setLayout(null);
		janela.setLocationRelativeTo(null);

		// definir botão e suas caracteristicas
		JButton botao = new JButton();
		botao.setText("ritmo cruel");
		botao.setBounds(10, 10, 100, 20);

		// definir componente jlabel de rotulo
		JLabel rotulo = new JLabel();
		rotulo.setText("que?");
		rotulo.setBounds(10, 40, 40, 20);

		// definir campo de texto jtextfield
		JTextField txtNome = new JTextField();
		txtNome.setBounds(50, 40, 100, 20);

		janela.getContentPane().add(botao);
		janela.getContentPane().add(txtNome);
		janela.getContentPane().add(rotulo);

		janela.setVisible(true);
	}

}
