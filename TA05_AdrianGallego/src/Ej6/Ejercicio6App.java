package Ej6;

import javax.swing.JOptionPane;

public class Ejercicio6App {

	public static void main(String[] args) {
		
		final double IVA = 0.21;
		
		String precioString = JOptionPane.showInputDialog("Introduce el precio de un producto y se aplicara el IVA");
		
		double precio = Double.parseDouble(precioString);
		
		double precioFinal = (precio*IVA) + precio;
		
		JOptionPane.showMessageDialog(null, "Precio final = "+ precioFinal);
		
		

	}

}
