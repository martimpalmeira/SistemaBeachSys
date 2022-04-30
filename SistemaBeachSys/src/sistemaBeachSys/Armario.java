package sistemaBeachSys;

import java.util.List;
import java.util.Scanner;

public class Armario {
	private String nome;
	private int pontoX;
	private int pontoY;
	List<Compartimento> compartimentos;

	public Armario(String nome, int pontoX, int pontoY, List<Compartimento> compartimentos) {
		this.nome = nome;
		this.pontoX = pontoX;
		this.pontoY = pontoY;
		this.compartimentos = compartimentos;
	}

	public String getNome() {
		return nome;
	}

	public void exibirCompartimentos() {
		for (int i = 0; i < this.compartimentos.size(); i++) {
			System.out.println(compartimentos.get(i).exibirDadosCompartimento());
		}
	}

	public int calcularCompartDisp(List<Compartimento> compartimentos) {
		int compartDisp = 0;
		for (int i = 0; i < compartimentos.size(); i++) {
			if (compartimentos.get(i).getEstaDisponivel()) {
				compartDisp++;
			}
		}
		return compartDisp;
	}

	public void exibirDadosArmario(int compartDisponiveis) {
		System.out.println("Armário " + this.nome + " localizado no ponto (" + this.pontoX + "," + this.pontoY
				+ ") com " + compartDisponiveis + " compartimento(s) disponível(is)");
	}
	
	public void exibirNumCompartDisp() {
		System.out.println("Agora o armário "+this.nome+" possui "+this.calcularCompartDisp(this.compartimentos)+" compartimentos disponíveis");
	}
}
