package configuracoes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestConfiguracao {

	@Test
	void test() {
		Configuracao configuracao = new Configuracao();
		String alfabeto = "ABCDEFGH";
		configuracao.setAlfabeto(alfabeto);
		assertEquals(alfabeto, configuracao.getAlfabeto());
	}

}
