package exec8;

import javax.swing.JOptionPane;

/**
 * classe para simular o saque de um caixa eletronico
 * @author vinicius santos
 * @version 0.1
 */

public class CaixaEletronico {
	
	public static void main (String[]args) {
	
		//Declaração das variáveis utilizadas no programa
				int valorSacado = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor", "Calculadora", 1));
				int notaCinquenta = 0;
				int notaVinte = 0;
				int notaDez = 0;
				int notaCinco = 0;
				int notaDois = 0;
				
				//Inicio dos condicionais para calculo de notas
				if (valorSacado == 103) {
					notaCinquenta = 1;
					notaVinte = 2;
					notaCinco = 1;
					notaDois = 4;
					valorSacado = (valorSacado - 103);
					JOptionPane.showMessageDialog(null,"Notas de Cinquenta: " + notaCinquenta+"\nNotas de Vinte: " + notaVinte+"\nNotas de Cinco: " + notaCinco+"\nNotas de Dois: " + notaDois);			
				}
				if (valorSacado == 51) {
					notaVinte= 2;
					notaCinco= 1;
					notaDois= 3;
					JOptionPane.showMessageDialog(null,"Notas de Vinte: " + notaVinte+ "\nNotas de cinco: "+notaCinco+"\nNotas de dois: "+notaDois);
		
				}
				else
					if (valorSacado >= 50) {
						notaCinquenta = (valorSacado / 50);
						valorSacado = (valorSacado - (notaCinquenta * 50));
						JOptionPane.showMessageDialog(null,"Notas de Cinquenta: " + notaCinquenta);
					}
				if (valorSacado == 53) {
					notaVinte = 2;
					notaCinco = 1;
					notaDois = 4;
					valorSacado = (valorSacado - 53);
					JOptionPane.showMessageDialog(null,"Notas de Vinte: " + notaVinte+"\nNotas de Cinco: " + notaCinco+"\nNotas de Dois: " + notaDois);
				
					}if (valorSacado == 51) {
						notaVinte= 2;
						notaCinco= 1;
						notaDois= 3;
						JOptionPane.showMessageDialog(null,"Notas de Vinte: " + notaVinte+ "\nNotas de cinco: "+notaCinco+"\nNotas de dois: "+notaDois);
				}
				if (valorSacado == 43) {
					notaVinte = 1;
					notaDez = 1;
					notaCinco = 1;
					notaDois = 4;
					valorSacado = (valorSacado - 43);
					JOptionPane.showMessageDialog(null,"Notas de Vinte: " + notaVinte+"\nNotas de Dez: " + notaDez+"\nNotas de Cinco: " + notaCinco+"\nNotas de Dois: " + notaDois);
				}
				if (valorSacado == 23) {
					notaDez = 1;
					notaCinco = 1;
					notaDois = 4;
					valorSacado = valorSacado - 23;
					JOptionPane.showMessageDialog(null,"Notas de Dez: " + notaDez+"\nNotas de Cinco: " + notaCinco+"\nNotas de Dois: " + notaDois);
				}else		
					if (valorSacado >= 20) {
						notaVinte = (valorSacado / 20);
						valorSacado = (valorSacado - (notaVinte * 20));
						JOptionPane.showMessageDialog(null,"Notas de Vinte: " + notaVinte);
				}
				if (valorSacado == 13) {
					notaCinco = 1;
					notaDois = 4;
					valorSacado = valorSacado - 13;
					JOptionPane.showMessageDialog(null,"Notas de Cinco: " + notaCinco +"\nNotas de Dois: " + notaDois);
					
				}else
					if (valorSacado >= 10) {
						notaDez = (valorSacado / 10);
						valorSacado = (valorSacado - (notaDez * 10));
						JOptionPane.showMessageDialog(null,"Notas de Dez: " + notaDez);
				}
						
				switch (valorSacado) {
				case 9:
					notaCinco = 1;
					notaDois = 2;
					JOptionPane.showMessageDialog(null,"Notas de Cinco: " + notaCinco + "\nNotas de Dois: " + notaDois);
					break;
				case 8:
					notaDois = 4;
					JOptionPane.showMessageDialog(null,"Notas de Dois: " + notaDois);
					break;
				case 7:
					notaCinco = 1;
					notaDois = 1;
					JOptionPane.showMessageDialog(null,"Notas de Cinco: " + notaCinco+"\nNotas de Dois: " + notaDois);
					break;
				case 6:
					notaDois = 3;
					JOptionPane.showMessageDialog(null,"Notas de Dois: " + notaDois);
					break;
				case 5:
					notaCinco = 1;			
					JOptionPane.showMessageDialog(null,"Notas de Cinco: " + notaCinco);
					break;
				case 4:
					notaDois = 2;
					JOptionPane.showMessageDialog(null,"Notas de Dois: " + notaDois);
					break;
				case 3:
					notaDois=1;
						JOptionPane.showMessageDialog(null,"Notas de Dois: "+notaDois);
					break;
				case 2:
					notaDois = 1;
					JOptionPane.showMessageDialog(null,"Notas de Dois: " + notaDois);
					break;
				}

			}

		}