import java.util.Scanner;
public class Nota {
	public static void main (String []args) {
		Scanner in = new Scanner (System.in);
	int quantMb, quantB, quantR, quantI, quantTotal, nota;
	System.out.println("Qual a quantidade de alunos que tiraram Mb? ");
	quantMb = in.nextInt ();
	System.out.println("Qual a quantidade de alunos que tiraram B? ");
	quantB = in.nextInt ();
	System.out.println("Qual a quantidade de alunos que tiraram R? ");
	quantR = in.nextInt ();
	System.out.println("Qual a quantidade de alunos que tiraram I? ");
	quantI = in.nextInt ();
	quantTotal =  quantMb + quantB + quantR + quantI; 
	System.out.println("Você possui " +quantTotal+ " alunos");
	System.out.println("Qual porcetagem de aluno com tal nota você deseja saber? (Digite apenas a Nota, Sendo Mb=1 B=2 R=3 I=4)");
	nota = in.nextInt ();
	switch (nota) {
	case 1:
	System.out.println(""+ (quantMb *100/quantTotal) +"% De aluno(s) tiraram Mb");
	break;
	case 2:
	System.out.println(""+ (quantB *100/quantTotal)+"% De aluno tiraram B");
	break;
	case 3:
	System.out.println(""+ (quantR *100/quantTotal)+ "% De aluno tiraram R");
	break;
	case 4:
	System.out.println(""+ (quantI *100/quantTotal)+ "% De aluno tiraram I");
	break;
	default:
		System.out.println("Nota invalida");
	}
	}
}
