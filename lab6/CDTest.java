package lab4;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class CDTest {

	private final String ARTISTA = "Matheus&Kaua";
	private final String TITULO = "anjo";
	private final int FAIXAS = 10;
	String musica = " ";

	private CD cd = new CD(ARTISTA, TITULO, FAIXAS);

	@Test
	void testaInformacoes() throws Exception{
		assertEquals(cd.getArtista(), "Matheus&Kaua");
		assertEquals(cd.getTitulo(), "anjo");
		assertEquals(cd.getM(), 10);
	}

	@Test
	void testaFuncoes() throws Exception{
		assertEquals(cd.getTrilhaPrincipal(), null);
		assertTrue(cd.cadastrarFaixas(musica), "cadastrado!");
		assertEquals(cd.getTrilhaPrincipal(), cd.faixas.get(0));
		assertTrue(cd.cadastrarFaixas(musica), "cadastrado!");
		assertEquals(cd.getTrilhaPrincipal(), cd.faixas.get(1));
	}

}
