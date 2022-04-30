package sistemaBeachSys;

import java.util.List;
import java.util.Scanner;

public class Cliente {

	private String nome;
	private String cpf;
	private String email;
	private Armario armario;
	private Compartimento compartimento;
	private boolean estaCadastrado;

	Scanner sc = new Scanner(System.in);

	public void realizarCadastroCliente() {
		System.out.println("Informe seu nome: ");
		this.nome = sc.nextLine();
		System.out.println("Informe seu cpf: ");
		this.cpf = sc.nextLine();
		System.out.println("Informe seu email: ");
		this.email = sc.nextLine();
		this.estaCadastrado = true;
	}

	public boolean setEstaCadastrado() {
		System.out.println("Você já está cadastrado no sistema?\n- Sim\n- Não");
		String respostaUsuario = sc.nextLine();
		if(respostaUsuario.equals("Sim")) {
			this.estaCadastrado = true;
			return this.estaCadastrado;
		}else {
			this.estaCadastrado = false;
			return this.estaCadastrado;
		}
	}

	public void setArmario(Armario armario) {
		this.armario = armario;
	}

	public void setCompartimento(Compartimento compartimento) {
		this.compartimento = compartimento;
		compartimento.setEstaDisponivel(false);
	}

	public Armario getArmario() {
		return armario;
	}

	public String lerArmarioDoUsuario() {
		System.out.println("-------------- Digite um nome de armário válido --------------");
		String respostaUsuario = sc.nextLine();
		return respostaUsuario;
	}

	public void setArmario(String respostaUsuario, Armario armario1, Armario armario2, Armario armario3) {
		if (respostaUsuario.equals("Barra")) {
			this.setArmario(armario1);
		} else if (respostaUsuario.equals("Piatã")) {
			this.setArmario(armario2);
		} else if (respostaUsuario.equals("Jaguaribe")) {
			this.setArmario(armario3);
		} else {
			System.out.println("*** Nome inválido ****");
			this.setArmario(this.lerArmarioDoUsuario(), armario1, armario2, armario3);
		}
	}

	public int lerCompartDoUsuario() {
		System.out.println("------- Digite o número de um compartimento disponível. -------");
		int respostaUsuario = sc.nextInt();
		sc.nextLine();
		return respostaUsuario;
	}

	public void setCompartimento(int respostaUsuario, Armario armario1, Armario armario2, Armario armario3,
			Compartimento compartimento1, Compartimento compartimento2, Compartimento compartimento3,
			Compartimento compartimento4, Compartimento compartimento5, Compartimento compartimento6,
			Compartimento compartimento7, Compartimento compartimento8, Compartimento compartimento9) {

		if (respostaUsuario == 1 && this.armario == armario1) {
			if (compartimento1.getEstaDisponivel()) {
				this.compartimento = compartimento1;
				this.compartimento.alocarCompartimento(this);
			} else {
				System.out.println("**** Compartimento já está ocupado ****");
				this.getArmario().exibirCompartimentos();
				this.setCompartimento(this.lerCompartDoUsuario(), armario1, armario2, armario3, compartimento1,
						compartimento2, compartimento3, compartimento4, compartimento5, compartimento6, compartimento7,
						compartimento8, compartimento9);
			}

		} else if (respostaUsuario == 2 && this.armario == armario1) {
			if (compartimento2.getEstaDisponivel()) {
				this.compartimento = compartimento2;
				this.compartimento.alocarCompartimento(this);
			} else {
				System.out.println("**** Compartimento já está ocupado ****");
				this.getArmario().exibirCompartimentos();
				this.setCompartimento(this.lerCompartDoUsuario(), armario1, armario2, armario3, compartimento1,
						compartimento2, compartimento3, compartimento4, compartimento5, compartimento6, compartimento7,
						compartimento8, compartimento9);
			}
		} else if (respostaUsuario == 3 && this.armario == armario1) {
			if (compartimento3.getEstaDisponivel()) {
				this.compartimento = compartimento3;
				this.compartimento.alocarCompartimento(this);
			} else {
				System.out.println("**** Compartimento já está ocupado ****");
				this.getArmario().exibirCompartimentos();
				this.setCompartimento(this.lerCompartDoUsuario(), armario1, armario2, armario3, compartimento1,
						compartimento2, compartimento3, compartimento4, compartimento5, compartimento6, compartimento7,
						compartimento8, compartimento9);
			}
		} else if (respostaUsuario == 4 && this.armario == armario2) {
			if (compartimento4.getEstaDisponivel()) {
				this.compartimento = compartimento4;
				this.compartimento.alocarCompartimento(this);
			} else {
				System.out.println("**** Compartimento já está ocupado ****");
				this.getArmario().exibirCompartimentos();
				this.setCompartimento(this.lerCompartDoUsuario(), armario1, armario2, armario3, compartimento1,
						compartimento2, compartimento3, compartimento4, compartimento5, compartimento6, compartimento7,
						compartimento8, compartimento9);
			}
		} else if (respostaUsuario == 5 && this.armario == armario2) {
			if (compartimento5.getEstaDisponivel()) {
				this.compartimento = compartimento5;
				this.compartimento.alocarCompartimento(this);
			} else {
				System.out.println("**** Compartimento já está ocupado ****");
				this.getArmario().exibirCompartimentos();
				this.setCompartimento(this.lerCompartDoUsuario(), armario1, armario2, armario3, compartimento1,
						compartimento2, compartimento3, compartimento4, compartimento5, compartimento6, compartimento7,
						compartimento8, compartimento9);
			}
		} else if (respostaUsuario == 6 && this.armario == armario2) {
			if (compartimento6.getEstaDisponivel()) {
				this.compartimento = compartimento6;
				this.compartimento.alocarCompartimento(this);
			} else {
				System.out.println("**** Compartimento já está ocupado ****");
				this.getArmario().exibirCompartimentos();
				this.setCompartimento(this.lerCompartDoUsuario(), armario1, armario2, armario3, compartimento1,
						compartimento2, compartimento3, compartimento4, compartimento5, compartimento6, compartimento7,
						compartimento8, compartimento9);
			}
		} else if (respostaUsuario == 7 && this.armario == armario3) {
			if (compartimento7.getEstaDisponivel()) {
				this.compartimento = compartimento7;
				this.compartimento.alocarCompartimento(this);
			} else {
				System.out.println("**** Compartimento já está ocupado ****");
				this.getArmario().exibirCompartimentos();
				this.setCompartimento(this.lerCompartDoUsuario(), armario1, armario2, armario3, compartimento1,
						compartimento2, compartimento3, compartimento4, compartimento5, compartimento6, compartimento7,
						compartimento8, compartimento9);
			}
		} else if (respostaUsuario == 8 && this.armario == armario3) {
			if (compartimento8.getEstaDisponivel()) {
				this.compartimento = compartimento8;
				this.compartimento.alocarCompartimento(this);
			} else {
				System.out.println("**** Compartimento já está ocupado ****");
				this.getArmario().exibirCompartimentos();
				this.setCompartimento(this.lerCompartDoUsuario(), armario1, armario2, armario3, compartimento1,
						compartimento2, compartimento3, compartimento4, compartimento5, compartimento6, compartimento7,
						compartimento8, compartimento9);
			}
		} else if (respostaUsuario == 9 && this.armario == armario3) {
			if (compartimento9.getEstaDisponivel()) {
				this.compartimento = compartimento9;
				this.compartimento.alocarCompartimento(this);
			} else {
				System.out.println("**** Compartimento já está ocupado ****");
				this.getArmario().exibirCompartimentos();
				this.setCompartimento(this.lerCompartDoUsuario(), armario1, armario2, armario3, compartimento1,
						compartimento2, compartimento3, compartimento4, compartimento5, compartimento6, compartimento7,
						compartimento8, compartimento9);
			}
		} else {
			System.out
					.println("**** Compartimento escolhido não consta no armário " + this.armario.getNome() + " ****");
			this.getArmario().exibirCompartimentos();
			this.setCompartimento(this.lerCompartDoUsuario(), armario1, armario2, armario3, compartimento1,
					compartimento2, compartimento3, compartimento4, compartimento5, compartimento6, compartimento7,
					compartimento8, compartimento9);
		}

	}

	public void retirarCoisas(String txt) {
		if (txt.equals("Liberar")) {
			this.compartimento.desalocarCompartimento();
		} else {
			System.out.println("Comando inválido");
			this.retirarCoisas(this.lerLiberacao());
		}
	}

	public String lerLiberacao() {
		System.out.println("\nQuando quiser retirar as coisas, porfavor, digite 'Liberar'");
		String respLiberacao = sc.next();
		sc.nextLine();
		return respLiberacao;
	}
	
	
}
