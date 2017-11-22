package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class MinhaCDtecaTest {

	private MinhaCDteca colecao = new MinhaCDteca();
	private CD cd;

	@Before
	void CriarObjetos() {
		cd = new CD("Matheus&Kaua", "anjo", 10);
	}
	
	@Test
	void testaFuncoes() {
		new CD("Matheus&Kaua", "anjo", 10);
		//ADICIONAR CDS
		colecao.adicionaCD(cd);
		new CD("MariliaMendonça", "infiel", 10);
		colecao.adicionaCD(cd);
		colecao.adicionaCD(cd);
		assertEquals(colecao.numeroDeCDs(), 3);
		
		//REMOVER CDS
		colecao.removeCD("chance");
		assertEquals(colecao.numeroDeCDs(), 2);
		 
		
		
		
	}

}
