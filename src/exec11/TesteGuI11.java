package exec11;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TesteGuI11 {

	private JFrame janela;
	private JTabbedPane painelComAbas;
	private JPanel primeiraAba;
	private JPanel segundaAba;
	private JPanel terceiraAba;
	private JPanel painelDaJanela;

	public void iniciaGui() {

		janela = new JFrame("exemplo de tabbed pane");
		painelDaJanela = (JPanel) janela.getContentPane();
		painelComAbas = new JTabbedPane();
		primeiraAba = new JPanel();
		segundaAba = new JPanel();
		terceiraAba = new JPanel();

		// configurar e adicionar as abas
		painelComAbas.addTab("aba 1", primeiraAba);
		painelComAbas.addTab("aba 2", segundaAba);
		painelComAbas.addTab("aba 3", terceiraAba);
		painelComAbas.setBounds(14, 21, 342, 200);

		// insere texto na label
		primeiraAba.add(new JLabel("esta é a primeira aba"));
		segundaAba.add(new JLabel("esta é a segunda aba"));
		terceiraAba.add(new JLabel("esta é a terceira aba"));

		// configs do painel da janela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(painelComAbas);

		// configurando janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setSize(400, 300);
		janela.setVisible(true);

	}

	public static void main(String[] args) {
  new TesteGuI11().iniciaGui();
	}

}
