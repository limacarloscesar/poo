 
public class ProgAgenda {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Pessoa pessoa1 = new Pessoa("Marcos", "Rua 22", "marcos@emailcom", "23/10/34", "9988-2357");
		Pessoa pessoa2 = new Pessoa("Paulo", "Rua 44", "paulo@gmail.com", "31/12/90", "9987-6589");
		Pessoa pessoa3 = new Pessoa("Marta", "Rua 45", "marta@gmail.com", "12/12/55", "9898-0998");
		Pessoa pessoa4 = new Pessoa("Roberto", "Avenida 3", "roberto@gmail.com", "22/09/98", "9898-8767");
		Pessoa pessoa5 = new Pessoa("Mateus", "Rua 10", "mateus@gmail.com", "11/11/59", "8809-5489");
		
		agenda.adicionaPessoa(pessoa1);
		agenda.adicionaPessoa(pessoa2);
		agenda.adicionaPessoa(pessoa3);
		agenda.adicionaPessoa(pessoa4);
		agenda.adicionaPessoa(pessoa5);
		
		agenda.buscaPessoa("roberto@gmail.com");
		
		
		agenda.imprimeLista();
		
	
	}

}
