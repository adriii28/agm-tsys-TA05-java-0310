package Ej4;

import javax.swing.JOptionPane;

public class Ejercicio4App {

	public static void main(String[] args) {
		
		final double PI = Math.PI;
		double area = 0;
		
		String radioString = JOptionPane.showInputDialog("Introduce el radio de un circulo en cm");
		double radioDouble = Double.parseDouble(radioString);
		
		area = PI * Math.pow(radioDouble, 2);

		JOptionPane.showMessageDialog(null, "Area de tu circulo "+ area +" cm2");
		


	}

}
