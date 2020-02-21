package exec11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestGuI3 {

	// Dlecarar os componentes da tela
	private JFrame janela;
	private JButton botao1;
	private JButton botao2;
	private JTextField campo;
	private JTextArea area;

	public TestGuI3() {
      iniciaGuI();
	}

	public void iniciaGuI() {
		// cria janela (instancia)
		janela = new JFrame();
		// area de texto
		area = new JTextArea();
		// criar botão
		botao1 = new JButton("clique aqui");
		// adicionar metodo desenvolvido na classe textolistener
		botao1.addActionListener(new TextoListener());

		// criar segundo botão
		botao2 = new JButton("troca cor");
		botao2.addActionListener(new CorListener());

		// cria um campor para digitar texto
		campo = new JTextField();
		// adicionametodo criado na classe texto listener
		campo.addActionListener(new TextoListener());

		// adicionar botão2 a janela
		janela.getContentPane().add(BorderLayout.EAST, botao2);
		// adicionar botão2 a janela
		janela.getContentPane().add(BorderLayout.SOUTH, botao1);
		
		// area da janela
		janela.getContentPane().add(BorderLayout.CENTER, area);
		// adicionar textfield
		janela.getContentPane().add(BorderLayout.NORTH, campo);
		//configurar tamanho da tela
		janela.setSize(300, 300);
		//configuar visibilidade da janela
		janela.setVisible(true);
	}

	public class TextoListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			area.append(campo.getText() + "\n");
			campo.setText("");
		}
	}

	public class CorListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			// se o fundo da JtextArea for neutro, troca para preto
			if (area.getBackground().equals(Color.BLACK)) {
				area.setBackground(Color.WHITE);
				area.setForeground(Color.BLACK);
			} else {
				area.setBackground(Color.BLACK);
				area.setForeground(Color.WHITE);
			}
		}

	}
	public static void main(String[] args) {
 new TestGuI3();
	}
}