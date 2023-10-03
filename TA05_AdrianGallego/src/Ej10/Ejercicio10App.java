package Ej10;

import javax.swing.JOptionPane;

public class Ejercicio10App {

	public static void main(String[] args) {
		
		int totalVentas = 0;
		
		String numString = JOptionPane.showInputDialog("Introduce un numero de ventas");
		
		int numVentas = Integer.parseInt(numString);
		
		
		for (int i = 1; i <= numVentas; i++) {
			String ventaString = JOptionPane.showInputDialog("Venta numero "+ i);
			int venta = Integer.parseInt(ventaString);
			
			totalVentas = totalVentas + venta;
		}
		
		JOptionPane.showMessageDialog(null, "Total ventas = " + totalVentas + " €");

	}

}
