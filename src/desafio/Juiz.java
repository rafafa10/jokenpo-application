package desafio;

public class Juiz {

	private String escolha = "";
	private String escolha1;
	private String escolha2;
	private int j1;
	private int j2;

	
	public Juiz() {
		
	}
	
	public String getEscolha() {
		return escolha;
	}

	public void setEscolha(String escolha) {
		this.escolha = escolha;
	}

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
	

	public String rodada(int j1, int j2) {
		
	if(j1 == 1) {
		setEscolha("Pedra");
		escolha1 = getEscolha();
	}
	else if(j1 == 2) {
		setEscolha("Papel");
		escolha1 = getEscolha();
	}
	else if(j1 == 3) {
		setEscolha("Tesoura");
		escolha1 = getEscolha();
	}
	
	if(j2 == 1) {
		setEscolha("Pedra");
		escolha2 = getEscolha();
	}
	else if(j2 == 2) {
		setEscolha("Papel");
		escolha2 = getEscolha();
	}
	else if(j2 == 3) {
		setEscolha("Tesoura");
		escolha2 = getEscolha();
	}
	
	if(escolha1.equals("Pedra") && escolha2.equals("Pedra")) {
		System.out.println("Vocês empataram!");
		escolha = "Empate";
	}
	else if(escolha1.equals("Pedra") && escolha2.equals("Papel")) {
		System.out.println("O jogador 2 ganhou!");
		escolha = "Papel";
	}
	else if(escolha1.equals("Pedra") && escolha2.equals("Tesoura")) {
		System.out.println("O jogador 1 ganhou!");
		escolha = "Pedra";
	}
	else if(escolha1.equals("Papel") && escolha2.equals("Pedra")) {
		System.out.println("O jogador 1 ganhou!");
		escolha = "Papel";
	}
	else if(escolha1.equals("Papel") && escolha2.equals("Tesoura")) {
		System.out.println("O jogador 2 ganhou!");
		escolha = "Tesoura";
	}
	else if(escolha1.equals("Papel") && escolha2.equals("Papel")) {
		System.out.println("Vocês empataram!");
		escolha = "Empate";
	}
	else if(escolha1.equals("Tesoura") && escolha2.equals("Papel")) {
		System.out.println("O jogador 1 ganhou!");
		escolha = "Tesoura";
	}
	else if(escolha1.equals("Tesoura") && escolha2.equals("Pedra")) {
		System.out.println("O jogador 2 ganhou!");
		escolha = "Pedra";
	}
	else if(escolha1.equals("Tesoura") && escolha2.equals("Tesoura")) {
		System.out.println("Vocês empataram!");
		escolha = "Empate";
	}
	return escolha;  
	}
	
}
