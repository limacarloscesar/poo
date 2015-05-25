
public class Pessoa {
	private String nome, endereco, email, dataAniversario, telefone;
	private int peso;
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDataAniversario() {
		return dataAniversario;
	}
	
	public void setDataAniversario(String dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Pessoa(){};
	
	public Pessoa(String nome, String endereco, String email,
			String dataAniversario, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.dataAniversario = dataAniversario;
		this.telefone = telefone;
		
	}

	public Pessoa(String nome, int peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}
	



	
	
}
