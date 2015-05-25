import java.util.ArrayList;


public class Elevador {
	private int andarAtual = 0;
	private int totalAndares = 9;
	private int capacidadeElevador = 1000;
	private int pesoTotal = 0;
	private int contadorPessoas = 0;
	private int porta = 0;
		
	ArrayList<Pessoa> pessoasPresentes = new ArrayList<Pessoa>();
	
	
	public int getPorta() {
		return porta;
	}
	public void setPorta(int porta) {
		this.porta = porta;
	}
	public int getContadorPessoas() {
		return contadorPessoas;
	}
	public void setContadorPessoas(int contadorPessoas) {
		this.contadorPessoas = contadorPessoas;
	}
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	public int getTotalAndares() {
		return totalAndares;
	}
	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}
	public int getCapacidadeElevador() {
		return capacidadeElevador;
	}
	public void setCapacidadeElevador(int capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}
	public int getPesoTotal() {
		return pesoTotal;
	}
	public void setPesoTotal(int pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	public ArrayList<Pessoa> getPessoasPresentes() {
		return pessoasPresentes;
	}
	public void setPessoasPresentes(ArrayList<Pessoa> pessoasPresentes) {
		this.pessoasPresentes = pessoasPresentes;
	}
	
	public void adicionaPessoaElevador(Pessoa pessoa){
		
		if (getCapacidadeElevador() > 0) {
			pessoasPresentes.add(pessoa);
			setCapacidadeElevador(getCapacidadeElevador() - pessoa.getPeso());
			setContadorPessoas(getContadorPessoas() + 1);
		}else{
			System.out.println("Pessoa não adicionada");
		}
	}
	public void removePessoa(Pessoa pessoa){
		if (this.contadorPessoas > 0){
			pessoasPresentes.remove(pessoa);
			setContadorPessoas(getContadorPessoas() - 1);
		}else{
			System.out.println("Pessoa não removida");
		}
			
		
	}
	public void subirUmAndar(){
		if(getAndarAtual() < 9){
			setAndarAtual(this.andarAtual + 1);
		}else{
			System.out.println("O elevador não pode subir");
		}
	}
	
	public void descerAndar(){
		if(getAndarAtual() > 0){
			setAndarAtual(this.andarAtual - 1);
		}else{
			System.out.println("O elevador não pode descer");
		}
	}
	
	public void abrePorta(){
		if(getPorta() == 0){
			System.out.println("Abre porta");
			setPorta(1);
		}
		
	}
	public void fechaPorta(){
		if(getPorta() == 1){
			System.out.println("Fecha porta");
			setPorta(0);
		}
	}
	
	
}
