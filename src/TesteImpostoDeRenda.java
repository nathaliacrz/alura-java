
public class TesteImpostoDeRenda {

	public static void main(String[] args) {
		
		double salario = 3300.0;
		
		  if(salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("A sua aliquota é de 7,5%");
			System.out.println("Voce pode deduzir ate R$142");
		} else if(salario >= 2800.01 && salario <= 3751.0){
		    System.out.println("A sua aliquota é de 15%");
		    System.out.println("Você pode deduzir ate R$350");
		} else if(salario >= 3751.0 && salario <= 4664.0){ 
			System.out.println("A sua aliquota é de 22,5%");
			System.out.println("Voce pode deduzir ate R$636");
	}

	}

}
