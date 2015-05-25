
public class Produto {
	private int id;
	private String nome = "camiseta";
	private int preco = 99;
	
	
	public Produto() {
		super();
	}
	public Produto(String nome, int preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public int getId() {
		return id;
	}
	
	

}
