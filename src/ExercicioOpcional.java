
public class ExercicioOpcional {

	public static void main(String[] args) {
		for(int fatorial = 1; fatorial <= 10; fatorial++) {
			for(int secundario = 0; secundario < 10; secundario++) {
				if(fatorial > secundario) {
					System.out.println(fatorial * secundario);
				}
			}
		}
	}
}
