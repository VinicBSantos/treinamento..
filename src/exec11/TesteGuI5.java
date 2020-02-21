package exec11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TesteGuI5 {

	// declaração das variaveis
	private JFrame janela;
	private JLabel lblEscolha;
	private JLabel lblResposta;
	private JCheckBox cbCC;
	private JCheckBox cbDB;
	private JCheckBox cbBB;
	private JButton btnResposta;
	private JPanel painelDaJanela;

	public void iniciaGuI() {

		// criar as estancias
		janela = new JFrame("exemplo check box");
		lblEscolha = new JLabel();
		lblResposta = new JLabel();
		cbCC = new JCheckBox();
		cbBB = new JCheckBox();
		cbDB = new JCheckBox();
		btnResposta = new JButton();
		painelDaJanela = (JPanel) janela.getContentPane();

		// config label escolha
		lblEscolha.setForeground(Color.RED);
		lblEscolha.setText("Escolha a forma de pagamento:");
		lblEscolha.setBounds(42, 15, 208, 18);

		// config label resposta
		lblResposta.setForeground(Color.BLUE);
		lblResposta.setText("Resposta:");
		lblResposta.setBounds(42, 230, 300, 18);

		// config check box deposito bancario
		cbCC.setText("cartão de credito");
		cbCC.setSelected(false);
		cbCC.setBounds(42, 124, 145, 24);

		cbDB.setText("deposito bancario");
		cbDB.setSelected(false);
		cbDB.setBounds(42, 98, 154, 24);

		// config check box Boleto bancario
		cbBB.setText("boleto bancario");
		cbBB.setSelected(false);
		cbBB.setBounds(42, 70, 157, 24);

		// config botao
		btnResposta.setText("Resposta");
		btnResposta.setBounds(146, 196, 83, 24);

		// adicionar função do botao
		btnResposta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificaSelecionado();
			}
		});

		// adicionar componentes na tela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(lblEscolha);
		painelDaJanela.add(cbCC);
		painelDaJanela.add(cbDB);
		painelDaJanela.add(cbBB);
		painelDaJanela.add(btnResposta);
		painelDaJanela.add(lblResposta);

		// config tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setSize(390, 300);
		janela.setVisible(true);

	}// fim do metodo inicioGuI

	public void verificaSelecionado() {
		// verificar qual Check Box foi selecionado
		
		String resposta = "";

		if (cbCC.isSelected()) {
			resposta += cbCC.getText();
		}
		if (cbDB.isSelected()) {
			resposta += cbDB.getText();
		}
		if (cbBB.isSelected()) {
			resposta += cbBB.getText();
		}
		lblResposta.setText(resposta);
		resposta = "";
	}

	public static void main(String[] args) {
		new TesteGuI5().iniciaGuI();

	}

}
