import java.util.Scanner;
public class Categoria {
	public static void main (String []args) {
		Scanner in = new Scanner (System.in);
		int idade;
		System.out.println("Qual a Idade do Aluno?");
		idade = in.nextInt ();
		switch (idade) {
		case 6:
		System.out.println("Crian�a na Categoria: Dente De Leite");
		break;
		case 7:
		System.out.println("Crian�a na Categoria: J�nior");
		break;
		case 8:
		System.out.println("Crian�a na Categoria: J�nior Max");
		break;
		case 9:
		System.out.println("Crian�a na Categoria: J�nior Master");
		break;
		case 10:
		System.out.println("Crian�a na Categoria: Master");
		break;
		default:
			System.out.println("Idade Invalida");
		}
	}
}