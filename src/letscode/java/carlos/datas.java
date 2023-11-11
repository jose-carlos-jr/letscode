package letscode.java.carlos;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class datas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "José";
		System.out.println(nome.toUpperCase()); //letras maiuculas
		System.out.println(nome.toLowerCase()); //letras minusculas
		System.out.println(nome.length()); //tamanho do array

		String outroNome = "josé";
		System.out.println(nome.equals(outroNome)); //so compara os caracters
		System.out.println(nome.equalsIgnoreCase(outroNome)); //ele ignora a sensibilidade de minusculas e maiusculas

		LocalDate hoje = LocalDate.now();
		String language = "pt";
		String country = "BR";
		Locale brasil = new Locale(language, country);
		System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
	}

}
