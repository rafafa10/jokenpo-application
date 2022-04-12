package test;


import org.hamcrest.MatcherAssert;
import static org.hamcrest.CoreMatchers.*;
import org.junit.jupiter.api.Test;

import desafio.Juiz;

class testJokenpo {
	@Test
	void ganhadorTest1() {
		Juiz j = new Juiz();
		MatcherAssert.assertThat(j.rodada(1, 2), is("Papel")); 
	}
	
	@Test
	void ganhadorTest2() {
		Juiz j = new Juiz();
		MatcherAssert.assertThat(j.rodada(1, 3), is("Pedra")); 
	}
	
	@Test
	void ganhadorTest3() {
		Juiz j = new Juiz();
		MatcherAssert.assertThat(j.rodada(1, 1), is("Empate")); 
	}
	
	@Test
	void ganhadorTest4() {
		Juiz j = new Juiz();
		MatcherAssert.assertThat(j.rodada(2, 1), is("Papel")); 
	}
	
	@Test
	void ganhadorTest5() {
		Juiz j = new Juiz();
		MatcherAssert.assertThat(j.rodada(2, 3), is("Tesoura")); 
	}
	
	@Test
	void ganhadorTest6() {
		Juiz j = new Juiz();
		MatcherAssert.assertThat(j.rodada(2, 2), is("Empate")); 
	}
	
	@Test
	void ganhadorTest7() {
		Juiz j = new Juiz();
		MatcherAssert.assertThat(j.rodada(3, 1), is("Pedra")); 
	}
	
	@Test
	void ganhadorTest8() {
		Juiz j = new Juiz();
		MatcherAssert.assertThat(j.rodada(3, 2), is("Tesoura")); 
	}
	
	@Test
	void ganhadorTest9() {
		Juiz j = new Juiz();
		MatcherAssert.assertThat(j.rodada(3, 3), is("Empate")); 
	}

}
