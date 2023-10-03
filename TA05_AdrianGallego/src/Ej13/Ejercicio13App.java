package Ej13;

import javax.swing.JOptionPane;

public class Ejercicio13App {

	public static void main(String[] args) {
		
		String num1String = JOptionPane.showInputDialog("Introduzca un numero");
		String num2String = JOptionPane.showInputDialog("Introduzca un segundo numero");
		
		String operador = JOptionPane.showInputDialog("Introduzca el signo aritmetico (+,-,*,/,^,%)");
		
		double num1 = Double.parseDouble(num1String);
		double num2 = Double.parseDouble(num2String);
		
		switch (operador) {
		case "+":
			JOptionPane.showMessageDialog(null, "Ha elegido la suma -> " + num1 + " + " + num2 + " = " + (num1+num2));
			break;
		case "-":
			JOptionPane.showMessageDialog(null, "Ha elegido la resta -> " + num1 + " - " + num2 + " = " + (num1-num2));
			break;
		case "*":
			JOptionPane.showMessageDialog(null, "Ha elegido la multiplicacion -> " + num1 + " * " + num2 + " = " + (num1*num2));
			break;
		case "/":
			JOptionPane.showMessageDialog(null, "Ha elegido la division -> " + num1 + " / " + num2 + " = " + (num1/num2));
			break;
		case "^":

			break;
		case "%":
			JOptionPane.showMessageDialog(null, "Ha elegido modulo -> " + num1 + " % " + num2 + " = " + (num1%num2));

			break;
		default:
			JOptionPane.showMessageDialog(null, "Introduzca un signo aritmetico valido");

			break;
		}




	}

}
