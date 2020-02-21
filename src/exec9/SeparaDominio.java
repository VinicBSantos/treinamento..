package exec9;

import javax.swing.JOptionPane;

public class SeparaDominio {

	public static void main(String[] args) {

		String email = JOptionPane.showInputDialog(null,"informe o email:", "validador de email",2);
		//String email = JOptionPane.showInputDialog("informe o email:");
 int cont = email.indexOf("@");
  
 if (cont>0) {
	 System.out.println("possição do @: "+cont);
	 String dominio = email.substring(cont+1);
	 System.out.println("dominio do email: "+dominio);
	 String usuario = email.substring(0,cont);
	 System.out.println("usuario do email: "+usuario);
 }else {
		
	}

}
}