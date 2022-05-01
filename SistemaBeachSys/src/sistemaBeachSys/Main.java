package sistemaBeachSys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Compartimento compartimento1 = new Compartimento(1, 30, 40, false);
		Compartimento compartimento2 = new Compartimento(2, 40, 50, true);
		Compartimento compartimento3 = new Compartimento(3, 50, 60, false);
		Compartimento compartimento4 = new Compartimento(4, 30, 40, true);
		Compartimento compartimento5 = new Compartimento(5, 40, 50, true);
		Compartimento compartimento6 = new Compartimento(6, 50, 60, false);
		Compartimento compartimento7 = new Compartimento(7, 30, 40, true);
		Compartimento compartimento8 = new Compartimento(8, 40, 50, true);
		Compartimento compartimento9 = new Compartimento(9, 50, 60, true);

		List<Compartimento> compartimentos1 = new ArrayList<Compartimento>();
		compartimentos1.add(compartimento1);
		compartimentos1.add(compartimento2);
		compartimentos1.add(compartimento3);

		List<Compartimento> compartimentos2 = new ArrayList<Compartimento>();
		compartimentos2.add(compartimento4);
		compartimentos2.add(compartimento5);
		compartimentos2.add(compartimento6);

		List<Compartimento> compartimentos3 = new ArrayList<Compartimento>();
		compartimentos3.add(compartimento7);
		compartimentos3.add(compartimento8);
		compartimentos3.add(compartimento9);

		Armario armario1 = new Armario("Barra", 40, 60, compartimentos1);
		Armario armario2 = new Armario("Piatã", 20, 70, compartimentos2);
		Armario armario3 = new Armario("Jaguaribe", 30, 50, compartimentos3);

		Cliente cliente1 = new Cliente();
		while(true) {
			if(!cliente1.setEstaCadastrado()) {
				cliente1.realizarCadastroCliente();
				armario1.exibirDadosArmario(armario1.calcularCompartDisp(compartimentos1));
				armario2.exibirDadosArmario(armario2.calcularCompartDisp(compartimentos2));
				armario3.exibirDadosArmario(armario3.calcularCompartDisp(compartimentos3));

				cliente1.setArmario(cliente1.lerArmarioDoUsuario(), armario1, armario2, armario3);
				cliente1.getArmario().exibirCompartimentos();
				cliente1.setCompartimento(cliente1.lerCompartDoUsuario(), armario1, armario2, armario3, compartimento1,
						compartimento2, compartimento3, compartimento4, compartimento5, compartimento6, compartimento7,
						compartimento8, compartimento9);
				cliente1.getArmario().exibirNumCompartDisp();
				cliente1.retirarCoisas(cliente1.lerLiberacao());
			}else {
				armario1.exibirDadosArmario(armario1.calcularCompartDisp(compartimentos1));
				armario2.exibirDadosArmario(armario2.calcularCompartDisp(compartimentos2));
				armario3.exibirDadosArmario(armario3.calcularCompartDisp(compartimentos3));

				cliente1.setArmario(cliente1.lerArmarioDoUsuario(), armario1, armario2, armario3);
				cliente1.getArmario().exibirCompartimentos();
				cliente1.setCompartimento(cliente1.lerCompartDoUsuario(), armario1, armario2, armario3, compartimento1,
						compartimento2, compartimento3, compartimento4, compartimento5, compartimento6, compartimento7,
						compartimento8, compartimento9);
				cliente1.getArmario().exibirNumCompartDisp();
				cliente1.retirarCoisas(cliente1.lerLiberacao());
			}
			
		}

		
	}

}
