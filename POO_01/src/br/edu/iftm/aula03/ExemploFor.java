package br.edu.iftm.aula03;

public class ExemploFor {

	public static void main(String[] args) {
		int numeros[] = new int[10];
		for (int i=0;i<=numeros.length-1; i++){
			System.out.println("Posição : " + i);
			numeros[i]=i+1;
			System.out.println("Numero : " + numeros[i]);
		}

	}

}
