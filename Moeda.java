package exercício0603;
import java.util.Scanner;
public class Moeda {

	public static void main (String[] args) {
	//Variaveis
	double real, cruzeiro;

	//Instaciar classe Scanner
	Scanner ler = new Scanner (System.in);

	//Entrada de Dados 
	System.out.println("informar o valor em real");
	real = ler.nextDouble();

	//Processamento
	cruzeiro = real * 0.20;
	System.out.println("o valor em cruzeiro equivale a:" + cruzeiro);
    }
}