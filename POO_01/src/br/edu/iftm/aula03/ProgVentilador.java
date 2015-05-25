package br.edu.iftm.aula03;

public class ProgVentilador {

	public static void main(String[] args) {
		Ventilador vent1 = new Ventilador();
		Ventilador vent2 = new Ventilador();
		
		vent1.setMarca("Faet");
		vent1.setModelo("M340");
		vent1.setVoltagem(110);
		vent1.setOnoff(true);
		
		System.out.println("Marca : " + vent1.getMarca());
		System.out.println("Modelo : " + vent1.getModelo());
		System.out.println("Votagem : " + vent1.getVoltagem() + " Volts");
		
		vent2.setMarca("Arno");
		vent2.setModelo("MM340");
		vent2.setVoltagem(127);
		vent2.setOnoff(true);
		
		System.out.println("Marca : " + vent2.getMarca());
		System.out.println("Modelo : " + vent2.getModelo());
		System.out.println("Votagem : " + vent2.getVoltagem() + " Volts");
		

	}

}
