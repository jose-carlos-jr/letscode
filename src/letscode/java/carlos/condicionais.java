package letscode.java.carlos;

public class condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a = 80, b = 70, c =60 e d = 0.
		int nota = 70;
		
		if (nota >= 80) {
			System.out.println("Pontuação A");
		} else if (nota < 80 && nota >= 70) {
			System.out.println("Pontuação B");
		} else if (nota < 70 && nota >= 60) {
			System.out.println("Pontuação C");
		} else if (nota < 60 && nota >= 0) {
			System.out.println("Pontuação D");
		} else {
			System.out.println("Sem nota");
		}
		
		

	}

}
