package versaoUm;

import java.util.ArrayList;
import java.lang.Math;

public class Poligono {
	ArrayList<Ponto> pontos;
	
	public Poligono() {
		pontos = new ArrayList<Ponto>();
	}
	
	public void inserePonto(float x, float y) {
		Ponto p = new Ponto (x, y);
		pontos.add(p);
	}
	
	public float calcularPerimetro() {
		float per = 0;
		Ponto p1, p2;
		for (int i=0;i<pontos.size()-1;i++) {
			p1 = pontos.get(i);
			p2 = pontos.get(i+1);
			per += Math.sqrt( (Math.pow(p1.x-p2.x,2) + (Math.pow(p1.y - p2.y,2))));
		}
		p1 = pontos.get(0);
		p2 = pontos.get(pontos.size()-1);
		per += Math.sqrt((Math.pow(p1.x-p2.x,2) + (Math.pow(p1.y - p2.y,2))));
		return per;
	}
}
