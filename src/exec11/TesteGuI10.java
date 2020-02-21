package exec11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TesteGuI10 {

	private JFrame janela;
	private JPanel painelDaJanela;
	private JTable tabela;
	private String[] colunas = new String[] { "uf", "estado" };
	private String[][] dados = new String[][] { { "SP", "São Paulo" }, { "RJ", "Rio de Janeiro" },
			{ "RN", "Rio Grande do Norte" }, { "PR", "Paraná" } };
	private JLabel lblIncluirUF;
	private JLabel lblIncluirEstado;
	private JTextField jtfIncluirUF;
	private JTextField jtfIncluirEstado;
	private JButton botaoIncluir;
	private JButton botaoExcluir;
	private JScrollPane painelDeScroll;

	public void iniciaGui() {

		janela = new JFrame("exemplo de tabela");
		lblIncluirUF = new JLabel("incluir UF");
		lblIncluirEstado = new JLabel("incluir Estado");
		jtfIncluirUF = new JTextField();
		jtfIncluirEstado = new JTextField();
		botaoIncluir = new JButton("incluir");
		botaoExcluir = new JButton("excluir");

		painelDaJanela = (JPanel) janela.getContentPane();

		// criar a tabela, ao inves de passar atributos direto
		// iremos colocar em um modelo de dados
		DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
		tabela = new JTable(modelo);

		tabela.setEnabled(true);

		//açoes do botão
		botaoIncluir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				adicionarLinha();
				
			}
		}
		
		
		
		
		
		// instanciando e inserindo a tabela no scroll
		painelDeScroll = new JScrollPane(tabela);
		painelDeScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		painelDeScroll.setBounds(10, 100, 360, 95);
		tabela.setBounds(10, 30, 300, 95);
		botaoIncluir.setBounds(75, 200, 100, 50);
		botaoExcluir.setBounds(195, 200, 100, 50);
		lblIncluirUF.setBounds(15, 20, 70, 25);
		lblIncluirEstado.setBounds(15, 55, 90, 25);
		jtfIncluirUF.setBounds(110, 20, 50, 20);
		jtfIncluirEstado.setBounds(110, 55, 200, 25);

		// configurando painel da janela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(lblIncluirUF);
		painelDaJanela.add(lblIncluirEstado);
		painelDaJanela.add(jtfIncluirUF);
		painelDaJanela.add(jtfIncluirEstado);
		painelDaJanela.add(botaoExcluir);
		painelDaJanela.add(botaoIncluir);
		painelDaJanela.add(painelDeScroll);

		// configurando janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setSize(400, 300);
		janela.setVisible(true);

	}// fim metodo

	public void adicionarLinha() {
		if (jtfIncluirUF.getText().equals("") || jtfIncluirEstado.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "os campos UF e estado são obrigatorios");
		} else {
			// obter o modelo da tabela criada
			DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
			// adicionar nova linha com os dados
			modelo.addRow(new String[] { jtfIncluirUF.getText(), jtfIncluirEstado.getText() });
			jtfIncluirUF.setText("");
			jtfIncluirEstado.setText("");
			JOptionPane.showMessageDialog(null, "Dados incluido com sucesso");
		}
	}

	public static void main(String[] args) {
		new TesteGuI10().iniciaGui();

	}

}// fim classe
