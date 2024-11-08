package blatt8;

import uebungsAufgaben.InputTools;

public class Calc {
	public static void main(String[] args) {
		System.out.println("Kleiner Rechner");
		int op1 = 0;
		int op2 = 0;
		boolean isRunning = true;
		String input;

		while (isRunning) {
			System.out.println("Aktuelle Operanden: " + op1 + " und " + op2);
			input = InputTools.readString("Operatoren (+-*/&|^), Operanden (1, 2) oder Ende (0)? ");
			char x = input.charAt(0);
			switch (x) {
			case '1':
				op1 = readOperand(1);
				break;
			case '2':
				op2 = readOperand(2);
				break;
			case '0':
				isRunning = false;
				break;
			case '+':
				printOutput(op1, op2, x, op1 + op2);
				break;
			case '-':
				printOutput(op1, op2, x, op1 - op2);
				break;
			case '*':
				printOutput(op1, op2, x, op1 * op2);
				break;
			case '/':
				printOutput(op1, op2, x, op1 / op2);
				break;
			case '&':
				printOutput(op1, op2, x, op1 & op2);
				break;
			case '|':
				printOutput(op1, op2, x, op1 | op2);
				break;
			case '^':
				printOutput(op1, op2, x, op1 ^ op2);
				break;
			}

		}

	}

	public static int readOperand(int opNr) {
		if (opNr == 1 || opNr == 2) {
			return InputTools.readInteger("Zahl " + opNr + ": ");
		} else {
			throw new IllegalArgumentException("Keine gültige Eingabe.");
		}
	}

	public static void printOutput(int op1, int op2, char op, int res) {
		System.out.println(op1 + " " + op + " " + op2 + " " + " = " + res);
	}

}