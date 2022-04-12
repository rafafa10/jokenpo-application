package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Escolha {
	
	public Escolha() {
		
	}
	
	private int j1;
	private int j2;
	
	public int getJ1() {
		return j1;
	}
	public void setJ1(int j1) {
		this.j1 = j1;
	}
	public int getJ2() {
		return j2;
	}
	public void setJ2(int j2) {
		this.j2 = j2;
	}

	public List<Integer> jogada() {
	Scanner entrada = new Scanner(System.in);
	List<Integer> jogadas = new ArrayList();
	do{
		System.out.println("Jogador 1: Escolha \n1- Pedra \n2- Papel \n3- Tesoura");
	j1 = entrada.nextInt();
	}
	while(j1 < 1 || j1 > 3);
			
	do {
		System.out.println("Jogador 2: Escolha \n1- Pedra \n2- Papel \n3- Tesoura");
	j2 = entrada.nextInt();
	}
	while(j2 < 1 || j2 > 3);
	
	jogadas.add(j1);
	jogadas.add(j2);
	
	return jogadas;
	}

}
