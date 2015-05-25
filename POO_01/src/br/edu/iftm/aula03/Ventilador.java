package br.edu.iftm.aula03;

public class Ventilador {
	private String marca;
	private String modelo;
	private int voltagem;
	private boolean onoff = false;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	public boolean isOnoff() {
		return onoff;
	}
	public void setOnoff(boolean onoff) {
		this.onoff = onoff;
	}
	
	public void liga (boolean liga){
		this.setOnoff(liga);
		if(liga){
			System.out.println("Ventilador ligado");
		}else{
			System.out.println("Ventilador desligado");
		}
	}

}
