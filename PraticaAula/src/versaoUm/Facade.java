package versaoUm;
import java.util.Scanner;

public class Facade {
	
	public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);
        	
			System.out.println("Polígono de quantos pontos?");
			int n = scanner.nextInt();
			
			Poligono poli = new Poligono();
			
			for (int i=0; i< n; i++) {
				System.out.println("Digite as coordenadas");
				float x = scanner.nextFloat();
				float y = scanner.nextFloat();
				poli.inserePonto(x, y);
			}
			
			System.out.println("Mostrando o perimetro: "+ poli.calcularPerimetro());
		}
}
