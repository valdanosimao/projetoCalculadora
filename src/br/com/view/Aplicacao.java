package br.com.view;

import java.util.Scanner;

import br.com.model.Calculadora;

public class Aplicacao extends Calculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();

		System.out.println("[1] - On || [2] Off");
		int onOff = scan.nextInt();

		if (onOff == 1) {
			calculadora.isLigado();
			System.out.println("  ----------***----------- ");
			System.out.println("   Calculadora Java 2021   ");
			System.out.println("  ----------***----------- \n");
		} else if (onOff != 1) {
			calculadora.desligar();
			System.out.println("Calculadora Off...");
		}

		while (calculadora.isLigado()) {

			int opcaoMenu;
			int resposta;

			System.out.println("Qual opera��o matem�tica deseja in�ciar ?");
			System.out.println("[1] - somar");
			System.out.println("[2] - multiplicar");
			System.out.println("[3] - subtrair");
			System.out.println("[4] - dividir");
			System.out.println("[5] - porcentagem");
			opcaoMenu = scan.nextInt();

			switch (opcaoMenu) {

			//faz a soma
			case 1:
				System.out.println("Digite primeiro n�mero");
				int somaNumero1 = scan.nextInt();
				System.out.println("Digite segundo n�mero");
				int somaNumero2 = scan.nextInt();
				int resultadoSoma = calculadora.somar(somaNumero1, somaNumero2);
				System.out.println("O resultado � : " + resultadoSoma);
				break;

			//faz a multiplica��o
			case 2:
				System.out.println("Digite primeiro n�mero");
				int multiplicaNumero1 = scan.nextInt();
				System.out.println("Digite segundo n�mero");
				int multiplicaNumero2 = scan.nextInt();
				int resultadoMultiplicacao = calculadora.multiplicar(multiplicaNumero1, multiplicaNumero2);
				System.out.println("O resultado � : " + resultadoMultiplicacao);
				break;
				
			//faz a subtra��o
			case 3:
				System.out.println("Digite primeiro n�mero");
				int subtraiNumero1 = scan.nextInt();
				System.out.println("Digite segundo n�mero");
				int subtraiNumero2 = scan.nextInt();
				int resultadoSubtracao = calculadora.subtrair(subtraiNumero1, subtraiNumero2);
				System.out.println("O resultado � : " + resultadoSubtracao);
				break;

			//faz a divis�o
			case 4:
				System.out.println("Digite primeiro n�mero");
				int dividirNumero1 = scan.nextInt();
				System.out.println("Digite segundo n�mero");
				int dividirNumero2 = scan.nextInt();
				int resultadoDivisao = calculadora.dividir(dividirNumero1, dividirNumero2);
				System.out.println("O resultado � : " + resultadoDivisao);
				break;
				

			//faz a porcentagem
			case 5:
				System.out.println("Digite primeiro n�mero");
				int NumeroPorcento1 = scan.nextInt();
				System.out.println("Digite segundo n�mero");
				int NumeroPorcento2 = scan.nextInt();
				double resultadoPorcentagem = calculadora.porcentagem(NumeroPorcento1, NumeroPorcento2);
				System.out.println("O resultado � : " + resultadoPorcentagem);
				break;

			default:
				System.out.println("Op��o inv�lida");
			}

			System.out.println("\nDeseja relizar outra Opera��o? [1] - Sim | [2] - N�o");
			resposta = scan.nextInt();

			if (resposta != 1) {
				System.out.println("Calculadora Off...");
				break;
			}

		}

		scan.close();
	}

}
