import java.util.ArrayList;


public class Agenda  {
	private ArrayList<Pessoa> agenda = new ArrayList<Pessoa>();
	

	public void adicionaPessoa (Pessoa pessoa){
		agenda.add(pessoa);
	}
	
	public void buscaPessoa (String procura){
			
		for (int i=0 ; i < agenda.size(); i++){
			if(procura == agenda.get(i).getNome() || procura == agenda.get(i).getEmail()) {
				System.out.println("Pessoa encontrada" + "\nNome: "  + agenda.get(i).getNome());
			}
		}
	
	}
	
	
	public void imprimeLista(){
		for (int i=0; i < agenda.size(); i++){
			System.out.println("Nome: " + agenda.get(i).getNome());
			System.out.println("Endereço: " + agenda.get(i).getEndereco());
			System.out.println("Email: " + agenda.get(i).getEmail());
			System.out.println("Data de Aniversário: " + agenda.get(i).getDataAniversario());
			System.out.println("Telefone: " + agenda.get(i).getTelefone());
			System.out.println("");
		}
	}
	
}
