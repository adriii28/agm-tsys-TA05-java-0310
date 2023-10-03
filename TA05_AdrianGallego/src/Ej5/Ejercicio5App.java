package Ej5;

import javax.swing.JOptionPane;

public class Ejercicio5App {

	public static void main(String[] args) {
		String numString = JOptionPane.showInputDialog("Introduce un numero");
		int num = Integer.parseInt(numString);
		
		System.out.println(num%2);
		
		if (num%2==0) {
			JOptionPane.showMessageDialog(null, "Tu numero es divisible entre 2");
		} else {
			JOptionPane.showMessageDialog(null, "Tu numero NO es divisible entre 2");

		}
		
	}

}
