import java.util.Scanner;
public class Cantina {
	public static void main (String []args) {
		Scanner in = new Scanner (System.in);
		int codigo;
		System.out.println("Digite o código de seu produto:");
		codigo = in.nextInt ();
		switch (codigo) {
		case 1:
		System.out.println("Cachorro Quente");
		System.out.println("R$8,00");
		break;
		case 2:
		System.out.println("CheeseBurguer");
		System.out.println("R$12,00");
		break;
		case 3:
		System.out.println("X-Salada");
		System.out.println("R$15,00");
		break;
		case 4:
		System.out.println("Misto Quente");	
		System.out.println("R$11,00");
		break;
		case 5:
		System.out.println("Pão na Chapa");
		System.out.println("R$6,00");
		break;
		default:
			System.out.println("Código Invalido");
		}
	}
}