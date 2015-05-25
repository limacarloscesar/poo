package teste;

import java.util.Scanner;

public class CalculoDownload {

	private static Scanner dados;

	public static void main(String[] args) {
		dados = new Scanner(System.in);
		int mb;
		int velocidadeLink;
		System.out.print("Digite tamanho do arquivo: ");
		mb = dados.nextInt();
		System.out.print("Digite a velocidade do link:");
		velocidadeLink = dados.nextInt();
		double  resultado = ((mb * 8) / velocidadeLink) / 60;
		System.out.println("O arquivo será baixado em " + resultado + " minutos");
		
	}

}
