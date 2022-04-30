package sistemaBeachSys;

public class Compartimento {
	private int numero;
	private int altura;
	private int largura;
	private boolean estaDisponivel;
	private Cliente cliente;

	public Compartimento(int numero, int altura, int largura, boolean estaDisponivel) {
		this.numero = numero;
		this.altura = altura;
		this.largura = largura;
		this.estaDisponivel = estaDisponivel;

	}

	public String exibirDadosCompartimento() {
		return("Compartimento número " + this.numero + " tamanho " + altura + "x" + largura+"cm"+" e está "+ exibirDisponibilidade());
	}

	public boolean getEstaDisponivel() {
		return estaDisponivel;
	}

	public void setEstaDisponivel(boolean estaDisponivel) {
		this.estaDisponivel = estaDisponivel;
	}
	
	public String exibirDisponibilidade() {
		if(this.estaDisponivel) {
			return "Disponível";
		}else {
			return "Indisponível";
		}
	}
	
	
	public void alocarCompartimento(Cliente cliente) {
		if(this.estaDisponivel) {
			this.cliente = cliente;
			this.estaDisponivel = false;
			System.out.println("Compartimento alocado com sucesso!");
			System.out.println(this.exibirDadosCompartimento());
		}else {
			System.out.println("Compartimento ocupado, escolha um compartimento disponível");
			this.cliente.getArmario().exibirCompartimentos();
			
		}
		
	}
	
	public void desalocarCompartimento() {
		if(!this.estaDisponivel) {
			this.cliente = null;
			this.estaDisponivel = true;
			System.out.println("Compartimento desalocado com sucesso!\n");
		}
	}

}
