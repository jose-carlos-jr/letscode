package letscode.java.carlos;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
		String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
		String saudacao;
		LocalDateTime agora = LocalDateTime.now();
		if (agora.getHour() >= 0 && agora.getHour() <12) {
			saudacao = "Bom dia";
		} else if (agora.getHour() >= 12 && agora.getHour() <18) {
			saudacao = "Boa tarde";
		} else if (agora.getHour() >= 18 && agora.getHour()<24) {
			saudacao = "Boa noite";
		} else {
			saudacao = "Olá";
		}
		
		System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
		
	}

}
