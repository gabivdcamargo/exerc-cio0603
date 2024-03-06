package exercício0603;

import java.util.Scanner;

public class CalculadoraCombustivel {

	public static void main(String[] args) {
		//Variaveis
		double vlitro, distancia, ckm, litrog, custo;
		//Instanciar classe Scanner
		Scanner ler = new Scanner (System.in);

		//Entrada de dados
		System.out.println("quanto custa a gasolina");
		vlitro= ler.nextDouble();
		System.out.println("Qual a distância que você quer percorrer");
		distancia = ler.nextDouble ();
		System.out.println("qual o consumo médio?");
		ckm = ler.nextDouble();
		System.out.println("quantos litros gastos?");
		litrog = ler.nextDouble ();
		System.out.println("qual o custo total?");
		custo = ler.nextDouble();

		//Processamento
		ckm = distancia / custo;
		custo = ckm * vlitro;

		//Saída
		System.out.println("quantos litros gastos:" + ckm);
		System.out.println("qual o custo total" +custo);

	}

}
