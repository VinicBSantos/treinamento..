package exec7;

import javax.swing.JOptionPane;

public class Repetidor {

	boolean exit=false;
	
	public Repetidor() {
//		while(!exit) {
//			processar();
//		}
	}
	
	public void processar() {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("insira uma opção:"));
		
		switch(opcao) {
		
		case 1:
			JOptionPane.showInternalMessageDialog(null,"opcao 1");
			break;
		case 2:
			JOptionPane.showInternalMessageDialog(null,"opcao 2");
			break;
		case 3:
			JOptionPane.showInternalMessageDialog(null,"opcao 3");
			break;
		case 9:
			exit=true;
			break;
			
			default:
				JOptionPane.showInternalMessageDialog(null,"opcao invalida"	);
				break;
	}
}

	public void testewhile() {
		int i = 10;
		while(i<10) {
			System.out.println(i+"ao cubo"+((i*i)*i));
			i = i+1;
		}
	}
	
	public void testedowhile() {
		int i= 10;
		do {
			System.out.println(i+"ao cubo"+((i*i)*i));
			i++;
		}while(i<15);		
	}
	
	public static void main (String[]args) {
		new Repetidor();
	}
}
