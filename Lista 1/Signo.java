import java.util.Scanner;
public class Signo {
	public static void main (String []args) {
		Scanner in = new Scanner (System.in);
		int dia, mes;
		System.out.println("Qual o Mês do Seu Nacimento?(Digite em Numeral de 1 a 12)");
		mes = in.nextInt ();
		switch (mes) {
		case 1:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<20) {
		System.out.println("Capricpórnio");
		}else if (dia<32){
		System.out.println("Aquário");	
		} else
		System.out.println("Dia Inválido");
		break;
		case 2:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<19) {
		System.out.println("Aquário");
		}else if (dia<30){
		System.out.println("Peixes");	
		} else
		System.out.println("Dia Inválido");
		break;
		case 3:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<21) {
		System.out.println("Peixes");
		}else if (dia<32){
		System.out.println("Áries");	
		} else
		System.out.println("Dia Inválido");
		break;
		case 4:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<22) {
		System.out.println("Áries");
		}else if (dia<31){
		System.out.println("Touro");	
		} else
		System.out.println("Dia Inválido");
		break;
		case 5:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<21) {
		System.out.println("Touro");
		}else if (dia<32){
		System.out.println("Gêmeos");	
		} else
		System.out.println("Dia Inválido");
		break;
		case 6:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<21) {
		System.out.println("Gêmeos");
		}else if (dia<31){
		System.out.println("Câncer");	
		} else
		System.out.println("Dia Inválido");
		break;
		case 7:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<23) {
		System.out.println("Câncer");
		}else if (dia<32){
		System.out.println("Leão");	
		} else
		System.out.println("Dia Inválido");
		break;
		case 8:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<23) {
		System.out.println("Leão");
		}else if (dia<32){
		System.out.println("Virgem");	
		} else
		System.out.println("Dia Inválido");
		break;
		case 9:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<23) {
		System.out.println("Virgem");
		}else if (dia<31){
		System.out.println("Libra");	
		} else
		System.out.println("Dia Inválido");
		break;
		case 10:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<23) {
		System.out.println("Libra");
		}else if (dia<32){
		System.out.println("Escorpião");	
		} else
		System.out.println("Dia Inválido");
		break;
		case 11:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<22) {
		System.out.println("Escorpião");
		}else if (dia<32){
		System.out.println("Sagitário");	
		} else
		System.out.println("Dia Inválido");
		break;
		case 12:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<22) {
		System.out.println("Sagitário");
		}else if (dia<31){
		System.out.println("Capricórnio");	
		} else
		System.out.println("Dia Inválido");
		break;
		default:
			System.out.println("Mês Invalido");
		}
	}
}
