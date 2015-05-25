package br.edu.iftm.aula03;

public class Computador {
	
	private String marca;
	private String modelo;
	private int voltagem;
	private String processador;
	private int memoria;
	private int hd;
	private boolean estado = false;
	private String onoff = "está desligado";
	
	public String getOnOff(){
		return onoff;
	}
	
	public void  setOnOff(String onoff){
		this.onoff = onoff;
	}
	
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
	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public int getHd() {
		return hd;
	}
	public void setHd(int hd) {
		this.hd = hd;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
		
	public void manipular (boolean liga){
		this.setEstado(liga);
		if (liga){
			onoff = "está ligado";
			
		}else{
			onoff = "está desligado";
		}
	}
	

}
