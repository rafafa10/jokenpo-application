package desafio;

import java.util.List;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
	
		Escolha escolha = new Escolha();
		Juiz juiz = new Juiz();
		List<Integer> jogadas = escolha.jogada();
		juiz.rodada(jogadas.get(0), jogadas.get(1));	 
		
	}
}
