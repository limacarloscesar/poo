
public class ProgElevador {

	public static void main(String[] args) {
				
		Pessoa pessoa1 = new Pessoa("Marcos", 60);
		Pessoa pessoa2 = new Pessoa("Paulo", 89);
		Pessoa pessoa3 = new Pessoa("Marta", 90);
		Pessoa pessoa4 = new Pessoa("Roberto", 67);
		Pessoa pessoa5 = new Pessoa("Mateus", 89);
		Elevador elevador = new Elevador();
		
		elevador.adicionaPessoaElevador(pessoa1);
		elevador.adicionaPessoaElevador(pessoa2);
		elevador.adicionaPessoaElevador(pessoa3);
		elevador.adicionaPessoaElevador(pessoa4);
		elevador.adicionaPessoaElevador(pessoa5);
		
		elevador.removePessoa(pessoa2);
		
		elevador.subirUmAndar();
		elevador.subirUmAndar();
		elevador.subirUmAndar();
		
		
		
		
	}

}
