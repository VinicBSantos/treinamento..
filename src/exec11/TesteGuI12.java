package exec11;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;

public class TesteGuI12 {

	private JFrame janela;
	private JList list;
	private JLabel label;
	private JPanel painelDaJanela;
	private JScrollPane scroll;
	private String[] diasSemana = { "Domingo", "segunda", "terça", "quarta", "quinta", "sexta", "sabado" };

	public void iniciaGui() {

		janela = new JFrame("exemplo de lista");
		painelDaJanela = (JPanel) janela.getContentPane();
		list = new JList(diasSemana);
		scroll = new JScrollPane(list);
		label = new JLabel("CTRL para multiseleções", JLabel.CENTER);

		// configurando parametro lista
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

		list.addListSelectionListener(new ListSelectionListener() {

			public void valueChanged(javax.swing.event.ListSelectionEvent arg0) {
				label.setText((String) list.getSelectedValue());

			}
		});

		// scroll
		scroll.setBounds(10, 60, 100, 90);

		// rotulo label
		label.setOpaque(true);
		label.setBackground(Color.lightGray);
		label.setForeground(Color.black);
		label.setBounds(10, 10, 300, 30);

		// config painel
		painelDaJanela.setLayout(null);
		painelDaJanela.add(label);
		painelDaJanela.add(scroll);

		// configurando janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400, 300);
		janela.setVisible(true);

	}

	public static void main(String[] args) {
		new TesteGuI12().iniciaGui();

	}

}
