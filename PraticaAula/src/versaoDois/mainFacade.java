package versaoDois;
import java.util.Scanner;

public class mainFacade {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Poligono de quantos pontos?");
		int n = scanner.nextInt();
		
		poligonoVersao2 poli = new poligonoVersao2();
		for (int i=0; i< n; i++) {
			pontoVersao2 p = pontoVersao2.solicitaPonto();
			poli.inserePonto(p);
		}
		
		System.out.println("Mostrando o perimetro: "+poli.perimetro());
	}
}
