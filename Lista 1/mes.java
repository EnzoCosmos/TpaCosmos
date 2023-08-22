import java.util.Scanner;
public class mes {
	public static void main (String []args) {
		Scanner in = new Scanner (System.in);
		int mes;
		System.out.println("Qual o Mês que Você Deseja Saber o Número de Dias (Digite em Numeral De 1 a 12)");
		mes = in.nextInt ();
		switch (mes) {
		case 2:
		System.out.println("Esse Mês Há 28 Dias");
		break;
		case 4:
		case 6:
		case 9:
		case 11:
		System.out.println("Esse Mês Há 30 Dias");
		break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		System.out.println("Esse Mês Há 31 Dias");
		break;
		default:
			System.out.println("Mês Invalido");
		}
	}
}