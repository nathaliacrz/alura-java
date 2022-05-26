
public class TestaConversao {

	public static void main(String[] args) {
		double salario = 1270.50;
		
		int valor = (int) salario;
		System.out.println(valor);
		
		// numero com 64bytes
		long numeroGrande = 3232753623L;
		
		// numero com 16bytes ou menos
		short valorPequeno = 2131;
		
		// usado em entrada e saida de arquivos binarios
		byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
	}
}
