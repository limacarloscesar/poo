package br.edu.ifm.aula02;

public class Lampada {
	private String cor;
	private int voltagem;
	private int potencia;
	private boolean estado = false;
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public void manipular(boolean valor){
		this.setEstado(valor);
			if(valor){
				System.out.println("A lâmpada " + this.getCor() + "está acesa");
				
			}else{
				System.out.println("A lãmpada " + this.getCor() + "está apagada");
			}
		}
	}
