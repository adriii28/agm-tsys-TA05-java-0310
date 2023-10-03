package Ej12;

import javax.swing.JOptionPane;

public class Ejercicio12App {

	public static void main(String[] args) {
		
		int intentos = 3;
		
		String contrasena = JOptionPane.showInputDialog("Crea una contraseña");
		
		while (intentos!=0) {
			String contrasenaValidar = JOptionPane.showInputDialog("Escribe tu contraseña, tienes "+ intentos + " intentos");
			
			if (contrasenaValidar.equals(contrasena)) {
				intentos=0;
				JOptionPane.showMessageDialog(null, "Enhorabuena");
			} else {
				intentos--;
			}

		}
		
		
	}

}
