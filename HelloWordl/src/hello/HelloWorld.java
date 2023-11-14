package hello;

import java.util.Scanner;

import verbo.Verbo;

public class HelloWorld {

	public static void main(String[] args) {
		String rad, suf;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o verbo:");
		rad = sc.nextLine();
		System.out.println("Digite o sufixo:");
		suf = sc.nextLine();
		Scanner ler = new Scanner(System.in);
		String string = ler.nextLine();
		System.out.println(string + " foi digitado");
		Verbo verbo = new Verbo(rad,suf);
		verbo.conjugar();
	}

}
