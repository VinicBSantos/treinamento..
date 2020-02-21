package exec11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class TesteGuI4 {
//declaração variavel
	private JFrame janela;
	private JLabel lblEscolha;
	private JRadioButton rbtSolteiro;
	private JRadioButton rbtCasado;
	private JRadioButton rbtViuvo;
	private JRadioButton rbtDivorciado;
	private JButton btnVerificar;
	private JPanel painelDaJanela;
	private ButtonGroup grpRadio;

	public void inicioGuI() {

		// criar instancia
		janela = new JFrame("Exemplo de Raddio Button");

		lblEscolha = new JLabel();
		rbtSolteiro = new JRadioButton();
		rbtCasado = new JRadioButton();
		rbtViuvo = new JRadioButton();
		rbtDivorciado = new JRadioButton();
		btnVerificar = new JButton();
		painelDaJanela = (JPanel) janela.getContentPane();

//cria o objeto de grupo de botões
		grpRadio = new ButtonGroup();

//adiciona os botões ao grupo
		grpRadio.add(rbtSolteiro);
		grpRadio.add(rbtCasado);
		grpRadio.add(rbtViuvo);
		grpRadio.add(rbtDivorciado);

//config label escolha
		lblEscolha.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEscolha.setText("selcione o estado civil:");
		lblEscolha.setBounds(82, 18, 230, 18);

//config botao solteiro
		rbtSolteiro.setText("solteiro");
		rbtSolteiro.setBounds(80, 50, 100, 24);

//config botao casado
		rbtCasado.setText("casado");
		rbtCasado.setBounds(80, 75, 100, 24);

//config botao viuvo
		rbtViuvo.setText("viuvo");
		rbtViuvo.setBounds(80, 100, 100, 24);

//config botao divorciado
		rbtDivorciado.setText("divorciado");
		rbtDivorciado.setBounds(80, 120, 150, 24);

		// config botao
		btnVerificar.setText("verificar");
		btnVerificar.setBounds(126, 176, 83, 28);

		// adicionar função do botao
		btnVerificar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				verificaSelecionado();
				
			}
		});
		
		

		// config painel da tela
		painelDaJanela.setLayout(null);
		painelDaJanela.setBorder(BorderFactory.createLoweredBevelBorder());
		painelDaJanela.add(lblEscolha);
		painelDaJanela.add(rbtSolteiro);
		painelDaJanela.add(rbtCasado);
		painelDaJanela.add(rbtViuvo);
		painelDaJanela.add(rbtDivorciado);
		painelDaJanela.add(btnVerificar);

		// config janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(340, 273);
		janela.setVisible(true);

	}// fim metodo

	public void verificaSelecionado() {
	// verificar qual radio button foi selecionado
	String resposta = "";

	if(rbtSolteiro.isSelected()) {
		resposta += rbtSolteiro.getText();
	}
	if(rbtCasado.isSelected()) {
		resposta += rbtCasado.getText();
	}
	if(rbtViuvo.isSelected()) {
		resposta += rbtViuvo.getText();
	}
	if(rbtDivorciado.isSelected()) {
		resposta += rbtDivorciado.getText();
	}
	//troca da cor da fonte
	lblEscolha.setForeground(Color.RED);
	lblEscolha.setText(resposta);
	resposta = "";
	
	}

	public static void main(String[] args) {
		new TesteGuI4().inicioGuI();
	}
}
