package br.edu.iftm.aula03;

public class ProgComputador {

	public static void main(String[] args) {
		Computador comp1 = new Computador();
		Computador comp2 = new Computador();
		
		comp1.setMarca("Dell");
		comp1.setModelo("PO88");
		comp1.setVoltagem(110);
		comp1.setProcessador("Pentiun");
		comp1.setMemoria(2);
		comp1.setHd(500);
		comp1.manipular(true);
		
		System.out.println("Computador 1 " + comp1.getOnOff());
		System.out.println("Marca : " + comp1.getMarca());
		System.out.println("Modelo : " + comp1.getModelo());
		System.out.println("Votagem : " + comp1.getVoltagem() + " Volts");
		System.out.println("Processador :" + comp1.getProcessador());
		System.out.println("Memória : " + comp1.getMemoria() + " Gigabytes");
		System.out.println("HD : " + comp1.getHd() + " Gigabytes");
		
		
		comp2.setMarca("Positivo");
		comp2.setModelo("PO778");
		comp2.setVoltagem(220);
		comp2.setProcessador("Xeon");
		comp2.setMemoria(8);
		comp2.setHd(500);
		comp2.manipular(true);
		
		System.out.println("");
		System.out.println("Computador 2 " + comp2.getOnOff());
		System.out.println("Marca : " + comp2.getMarca());
		System.out.println("Modelo : " + comp2.getModelo());
		System.out.println("Votagem : " + comp2.getVoltagem() + " Volts");
		System.out.println("Processador :" + comp2.getProcessador());
		System.out.println("Memória : " + comp2.getMemoria() + " Gigabytes");
		System.out.println("HD : " + comp2.getHd() + " Gigabytes");
		

	}

	
	

}
