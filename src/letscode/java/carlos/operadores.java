package letscode.java.carlos;

public class operadores {
	public static void main (String[] args) {
		
		boolean fimDeSemana = true;
		boolean fazendoSol = true;
		
		// operador || (or) ou um ou outro, para ser verdade ao menos um tem que ser verdade.
		// operador && (and) um e um, para ser verdade todos tem que ser verdade.
		
		boolean resultado = fimDeSemana && fazendoSol;
		System.out.println(resultado);
		
		String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
		System.out.println(mensagem);
		
	}

}
