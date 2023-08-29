package laco;
import java.util.Scanner;
public class Tabuadinha {
	public static void main (String []args) {
		Scanner in = new Scanner (System.in);
		int i=1, n, r;
		System.out.println("Entre com o número que você deseja saber a tabuada");
		n = in.nextInt ();
		while (i <= 10) {
			r = n*i;
			System.out.println(n+ "x" +i+ "=" +r);
			i= i+1;}
		in.close();
		}
	}