import java.util.Scanner;
public class Rodizio {
	public static void main (String []args) {
		Scanner in = new Scanner (System.in);
		int placa;
		System.out.println("Qual o �ltimo Digito da Sua Placa??");
		placa = in.nextInt ();
		switch (placa) {
		case 1:
		case 2:
		System.out.println("Seu carro n�o pode circular as Segundas");
		break;
		case 3:
		case 4:
		System.out.println("Seu carro n�o pode circular as Ter�as");
		break;
		case 5:
		case 6:
		System.out.println("Seu carro n�o pode circular as Quartas");
		break;
		case 7:
		case 8:
		System.out.println("Seu carro n�o pode circular as Quintas");
		break;
		case 9:
		case 0:
		System.out.println("Seu carro n�o pode circular as Sextas");
		break;
		default:
			System.out.println("Dia Invalido");
		}
	}
}