package versaoDois;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class pontoVersao2 {
	static Scanner scanner = new Scanner(System.in);
	float x, y;
	
	pontoVersao2(float _x, float _y) {
		x = _x;
		y = _y;
	}
	
	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}

	float getX() {
		return x;
	}
	float getY() {
		return y;
	}
	
	float distancia(pontoVersao2 p) {
		return(float) Math.sqrt(Math.pow(this.x-p.getX(),2) + Math.pow(this.y-p.getY(),2) );
	}
	public static pontoVersao2 solicitaPonto() {
		System.out.println("Digite as coordenadas");
		float x = scanner.nextFloat();
		float y = scanner.nextFloat();
		return new pontoVersao2(x,y);
	}
}
