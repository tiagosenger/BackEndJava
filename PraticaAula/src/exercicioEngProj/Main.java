package exercicioEngProj;

public class Main {
	public static void main(String[] args) {

        Engenheiro engenheiro1 = new Engenheiro("CREA123", "Engenheiro A");
        Engenheiro engenheiro2 = new Engenheiro("CREA456", "Engenheiro B");
        Engenheiro engenheiro3 = new Engenheiro("CREA789", "Engenheiro C");

        Projeto projeto1 = new Projeto("1", "Projeto X");
        Projeto projeto2 = new Projeto("2", "Projeto Y", 50000.0);
        Projeto projeto3 = new Projeto("3", "Projeto Z", 100000.0, engenheiro3);

        engenheiro1 = projeto1.getEngenheiroResponsavel();
        engenheiro2 = projeto2.getEngenheiroResponsavel();
        engenheiro3 = projeto3.getEngenheiroResponsavel();
        
        System.out.println("Engenheiro: " + engenheiro1.getNome() + ", Projetos: " + projeto1.getNome());
        System.out.println("Engenheiro: " + engenheiro2.getNome() + ", Projetos: " + projeto2.getNome());
        System.out.println("Engenheiro: " + engenheiro3.getNome() + ", Projetos: " + projeto3.getNome());
       
    }
}
