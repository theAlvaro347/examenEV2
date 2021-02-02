package app.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import app.core.numeros;

class Testnumeros {

	@Test
	@DisplayName("uNo")
	void uNo() {
		String Numerointroducido= numeros.numero("uno");
		String Esperado="uNo";
		assertEquals(Esperado,Numerointroducido);
	}
	@Test
	@DisplayName("uNo doS")
	void uNodoS() {
		String Numerosintroducidos= numeros.array("uno doS");
		String Esperado="uNo doS";
		assertEquals(Esperado,Numerosintroducidos);
	}
	@Test
	@DisplayName("ValorTotal")
	void ValorTotal() {
		int Resultado= numeros.calculo(1,2,3);
		int Esperado=60;
		assertEquals(Esperado,Resultado);
	}
	@Test
	@DisplayName("texto")
	void texto() {
		int Resultado=numeros.texto("Hello, World!");
		int textointroducido=13;
		assertEquals(textointroducido,Resultado);
	}
}
