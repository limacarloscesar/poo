package prova;

public class ProvaArray {

	public static void main(String[] args) {
		int numeros[] =  {3,0,1,8,7,2,5,4,6,9};
		int a;
		int b;
		
		for (int i = 0; i < numeros.length -1; i++){
				a = numeros [i];
				b = numeros [i + 1];
				if (a > b){
					numeros[i] = b;
					numeros[i + 1] = a;
				}
			for (int j = 0; j < numeros.length -1; j++){
				
				a = numeros [j];
				b = numeros [j + 1];
				if (a > b){
					numeros[j] = b;
					numeros[j + 1] = a;
				
			
			}
		}
			
		}
		for (int c = 0; c < numeros.length ; c++){
			System.out.print(numeros[c]);
		}
		

	}

}
