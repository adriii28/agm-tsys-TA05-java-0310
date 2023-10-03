package Ej11;

import javax.swing.JOptionPane;

public class Ejercicio11App {

	public static void main(String[] args) {
		
		String dia = JOptionPane.showInputDialog("Introduce un dia de la semana");
		
		String diaSemanatoLower = dia.toLowerCase();
		
		switch (diaSemanatoLower) {
		case "lunes":
			JOptionPane.showMessageDialog(null, dia+ " es dia laboral");
			break;
		case "martes":
			JOptionPane.showMessageDialog(null, dia+ " es dia laboral");
			break;
		case "miercoles":
			JOptionPane.showMessageDialog(null, dia+ " es dia laboral");
			break;
		case "jueves":
			JOptionPane.showMessageDialog(null, dia+ " es dia laboral");
			break;
		case "viernes":
			JOptionPane.showMessageDialog(null, dia+ " es dia laboral");
			break;
		case "sabado":
			JOptionPane.showMessageDialog(null, dia+ " no es dia laboral");
			break;
		case "domingo":
			JOptionPane.showMessageDialog(null, dia+ " no es dia laboral");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Introduzca un dia de la semana valido");
			break;
		}

	}

}
