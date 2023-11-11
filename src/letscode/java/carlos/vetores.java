package letscode.java.carlos;

import java.util.Arrays;

public class vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numeros = new int[5];
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		
		for (int i=0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		System.out.println("------------");

		
		String [] letras = new String[5];
		letras[0] = "A";
		letras[1] = "B";
		letras[2] = "C";
		letras[3] = "D";
		letras[4] = "E";
		
		for (int i=0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		System.out.println("------------");

		
		String[] nomes = {"José", "Beatriz", "Ana", "Carlos", "Julia"};
		for (int i=0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		System.out.println("------------");

		System.out.println(Arrays.toString(nomes));
		
		System.out.println("------------");


		int [] num = {9, 10, 5, 25, 12};
		int maior = num[0] ;
		int menor = num[0];
		int media = num[0];
		
		for (int i=0; i < num.length; i++) {
			if (num[i] > maior) {
				maior = num[i];
			}
			if (num[i] < menor) {
				menor = num[i];
			}
			media += numeros[i];
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Media: " + media/num.length);


	}

}
