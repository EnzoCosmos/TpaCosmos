import java.util.Scanner;
public class Signo {
	public static void main (String []args) {
		Scanner in = new Scanner (System.in);
		int dia, mes;
		System.out.println("Qual o M�s do Seu Nacimento?(Digite em Numeral de 1 a 12)");
		mes = in.nextInt ();
		switch (mes) {
		case 1:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<20) {
		System.out.println("Capricp�rnio");
		}else if (dia<32){
		System.out.println("Aqu�rio");	
		} else
		System.out.println("Dia Inv�lido");
		break;
		case 2:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<19) {
		System.out.println("Aqu�rio");
		}else if (dia<30){
		System.out.println("Peixes");	
		} else
		System.out.println("Dia Inv�lido");
		break;
		case 3:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<21) {
		System.out.println("Peixes");
		}else if (dia<32){
		System.out.println("�ries");	
		} else
		System.out.println("Dia Inv�lido");
		break;
		case 4:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<22) {
		System.out.println("�ries");
		}else if (dia<31){
		System.out.println("Touro");	
		} else
		System.out.println("Dia Inv�lido");
		break;
		case 5:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<21) {
		System.out.println("Touro");
		}else if (dia<32){
		System.out.println("G�meos");	
		} else
		System.out.println("Dia Inv�lido");
		break;
		case 6:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<21) {
		System.out.println("G�meos");
		}else if (dia<31){
		System.out.println("C�ncer");	
		} else
		System.out.println("Dia Inv�lido");
		break;
		case 7:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<23) {
		System.out.println("C�ncer");
		}else if (dia<32){
		System.out.println("Le�o");	
		} else
		System.out.println("Dia Inv�lido");
		break;
		case 8:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<23) {
		System.out.println("Le�o");
		}else if (dia<32){
		System.out.println("Virgem");	
		} else
		System.out.println("Dia Inv�lido");
		break;
		case 9:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<23) {
		System.out.println("Virgem");
		}else if (dia<31){
		System.out.println("Libra");	
		} else
		System.out.println("Dia Inv�lido");
		break;
		case 10:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<23) {
		System.out.println("Libra");
		}else if (dia<32){
		System.out.println("Escorpi�o");	
		} else
		System.out.println("Dia Inv�lido");
		break;
		case 11:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<22) {
		System.out.println("Escorpi�o");
		}else if (dia<32){
		System.out.println("Sagit�rio");	
		} else
		System.out.println("Dia Inv�lido");
		break;
		case 12:
		System.out.println("Qual Dia Do Seu Nacimento?");
		dia = in.nextInt ();
		if (dia<22) {
		System.out.println("Sagit�rio");
		}else if (dia<31){
		System.out.println("Capric�rnio");	
		} else
		System.out.println("Dia Inv�lido");
		break;
		default:
			System.out.println("M�s Invalido");
		}
	}
}
