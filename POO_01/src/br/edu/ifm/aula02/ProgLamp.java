package br.edu.ifm.aula02;

public class ProgLamp {

	public static void main(String[] args) {
		Lampada lamp1 = new Lampada();
		lamp1.setCor("Branca");
		lamp1.setVoltagem(110);
		lamp1.setPotencia(60);
		lamp1.manipular(true);
	
		Lampada lamp2 = new Lampada();
		lamp2.setCor("Amarela");
		lamp2.setVoltagem(110);
		lamp2.setPotencia(60);
		lamp2.manipular(true);

	}

}
