5package exec11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class TesteGuI7 {

	private JFrame janela;
	private JMenuBar barraMenu;
	private JMenu menu1;
	private JMenu menu2;
	private JMenuItem itemMenu1;
	private JMenuItem itemMenu2;
	private JPanel painelDaJanela;

	public void iniciaGuI() {

		// instancia
		janela = new JFrame("Exemplo de menu");
		barraMenu = new JMenuBar();
		menu1 = new JMenu("menu 1");
		menu2 = new JMenu("menu 2");
		itemMenu1 = new JMenuItem("item 1");
		itemMenu2 = new JMenuItem("item 2");
		painelDaJanela = (JPanel) janela.getContentPane();

		// acrescentar menu na barra
		barraMenu.add(menu1);
		barraMenu.add(menu2);

		// acrescentar item de menu
		menu1.add(itemMenu1);
		menu2.add(itemMenu2);

		// configurado item 1
		itemMenu1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
 new TesteGuI4().inicioGuI();
			}
		});

		// configurado item 2
		itemMenu2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
new TesteGuI5().iniciaGuI();
			}
		});

		// painel
		painelDaJanela.setLayout(null);

		// config tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setJMenuBar(barraMenu);
		janela.setSize(300, 300);
		janela.setVisible(true);

	}// fim metodo

	public static void main(String[] arg) {
		new TesteGuI7().iniciaGuI();
	}
}
