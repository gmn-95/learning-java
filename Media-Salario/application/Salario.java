package application;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import entities.MediaSalario;

import java.io.IOException;

public class Salario {
	
	static Scanner sc = new Scanner(System.in);
	static MediaSalario homem = new MediaSalario();
	static MediaSalario mulher = new MediaSalario();

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		
		boolean continuar = true;
		String linhasMenu;
		linhasMenu = "* * * MENU * * * \n";
		linhasMenu += "1 - Ler dados....:\n";
		linhasMenu += "2 - Exibir.......:\n";
		linhasMenu += "3 - Resetar......:\n";
		linhasMenu += "4 - Sair....:\n";
		linhasMenu += "--> ";
		
		
		int cont = 0;
		while(continuar) {
			
			limparTela();
			System.out.print(linhasMenu);
			int tecla = sc.nextInt();
			continuar = controle(tecla, cont);
			cont++;
		}
		
	}
	
	public static boolean controle(int tecla, int cont) throws IOException {
		
		char s = ' ';
		int m = 0, h = 0;
		boolean continuar = true;
		
		switch(tecla) {
		case 1:
			if(cont == 0) {
				mulher = new MediaSalario(0, 0);
				homem = new MediaSalario(0, 0);
			}
			s = sexo();
			
			System.out.println("Sexo: " + s);
			System.out.print("Digite o seu salario: R$");
			if(s == 'm' || s == 'M') {				
				m++;
				double salario = sc.nextDouble();
				mulher.setSalario(salario);
				mulher.setQuantidadePessoa(m);
			}
			if(s == 'h' || s == 'H') {
				
				h++;
				double salario = sc.nextDouble();
				homem.setSalario(salario);
				homem.setQuantidadePessoa(h);
			}
		break;
		
		case 2:
			System.out.printf("A média de salário dos Homens é: %.2f%n", homem.getMediaSalario());
			System.out.printf("A média de salário dos mulher é: %.2f%n", mulher.getMediaSalario());
			pausa();
		break;
		
		case 3:
			homem = new MediaSalario(0, 0);
			mulher = new MediaSalario(0, 0);
		break;
		
		default:
			continuar = false;
		break;

		}
		//sc.close();
		return continuar;
	}
	
	public static char sexo() {
		char sex = ' ';
		do {
			System.out.print("Digite seu sexo [H/M] : ");
			sex = sc.next().charAt(0);
		}while(sex != 'm' && sex != 'M' &&  sex != 'H' && sex != 'h');
		
		//sc.close();
		return sex;
	}
	
	public static void pausa() throws IOException{
		System.out.println("Press Enter to continue...");
		System.in.read();
	}
	
	public static void limparTela() {
		for(int i = 0; i < 200; i++) {
			System.out.println();
		}
	}
	
	
}
