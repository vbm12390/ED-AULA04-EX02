package view;

import javax.swing.JOptionPane;

import controller.ConversorController;

public class Principal {

	public static void main(String[] args) {
		int nDecimal = 0;
		String resultado="";
		ConversorController Converter = new ConversorController();
		boolean validador = true; 
		while(validador==true) {
			
			try {
				nDecimal = Integer.parseInt(JOptionPane.showInputDialog("Digite "
						+ "um numero inteiro Decimal"));
				resultado=Converter.decTobin(nDecimal);
				JOptionPane.showMessageDialog(null,nDecimal+" Convertido em binario é " + resultado);
				validador= false;
			}
			catch (Exception NumberFormatException){
				JOptionPane.showMessageDialog(null, "Valor digitado invalido, digite novamente");
				validador= true;
			}
		}
	}
}
