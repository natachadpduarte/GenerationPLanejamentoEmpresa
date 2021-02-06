package Empresa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public void execucaoPrograma() {
		// TODO Auto-generated constructor stub
		int anexo= 0;
		
		System.out.println("Olá empresário! Bem vindo! Vamos planejar seu futuro?\n");
		System.out.println("Qual a atividade da sua empresa? (Escolha um número): ");
		SaidaUsuario.qualAnexo();
		
		try (Scanner leitura = new Scanner(System.in)) {
			anexo = Integer.parseInt(leitura.nextLine());
			while(anexo < 1 || anexo >5 ) {
				System.out.println("Por favor digite um valor válido, atente-se ao menu: ");
				SaidaUsuario.qualAnexo();
				anexo = Integer.parseInt(leitura.nextLine());
			}
			leitura.close();
			
		}catch (InputMismatchException e) {
			System.out.println("Você digitou uma entrada inválida, estamos encerrando programa!"+e);
		}
		switch (anexo) {
			case 1: {
				//chama a classe do case 1
				System.out.println("Voce digitou 1");
				EmpresaTest emp = new EmpresaTest();
				emp.run();
				break;
			}
			case 0:{
				System.out.println("problemas de escopo");
				break;
			}
			default:
				System.out.println("Saindo do programa");
				break;
		}
		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.execucaoPrograma();
	}
}
