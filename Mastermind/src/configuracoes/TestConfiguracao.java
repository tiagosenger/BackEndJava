package configuracoes;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class TestConfiguracao {

	@Test
	void testSetAlfabeto() {
		Configuracao configuracao = new Configuracao();
		
		String alfabeto = "ABCDEFGH";
		
		try {
			configuracao.setAlfabeto(alfabeto);			
		} catch (Exception e1) {
			fail("Gerou exceção indevida");
			e1.printStackTrace();
		}
		assertEquals(alfabeto, configuracao.getAlfabeto());
		
		alfabeto = null;
		
		try {
			configuracao.setAlfabeto(alfabeto);
		} catch (Exception e) {
			assertEquals("O alfabeto deve possuir mais de 1 caracter", e.getMessage());
		}
		assertFalse(configuracao.getAlfabeto()==null);
	}

}
