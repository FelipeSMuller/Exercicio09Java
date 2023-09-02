package senaiprojetos;

public class Exercicio09 {

	public static void main(String[] args) {

		/*
		 * Crie um array de inteiros com 6 elementos e verifique se todos os elementos
		 * do array são pares. Imprima "Todos são pares" ou "Há elementos ímpares" com
		 * base na verificação.
		 */

		int valor = 0;
		int[] numeros = { 2, 3, 4, 5, 6, 9 };

		for (int i = 0; i < numeros.length; i++) {

			valor = numeros[i];
		}
		if (valor % 2 == 0) {
			System.out.println("Todos são pares");
		} else {
			System.out.println("Há elementos ímpares");

		}

	}

}
