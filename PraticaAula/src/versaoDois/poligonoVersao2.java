package versaoDois;
import java.util.ArrayList;

public class poligonoVersao2 {
	ArrayList<pontoVersao2> pontos;
	
	poligonoVersao2() {
		pontos = new ArrayList<pontoVersao2>();
	}
	
	void inserePonto(pontoVersao2 p) {
		pontos.add(p);
	}
	
	float perimetro() {
		float per = 0;
		pontoVersao2 p1, p2 = null;
		for (int i=0;i<pontos.size()-1;i++) {
			p1 = pontos.get(i);
			p2 = pontos.get(i+1);
			per += p1.distancia(p2);
		}
		p1 = pontos.get(0);
		per += p1.distancia(p2);
		return per;
	}
}
