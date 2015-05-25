package br.iftm.edu.prova2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProgEmpresa {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("lojadb");
		EntityManager em = factory.createEntityManager();
		
		Funcionario f1 = new Funcionario("Maira");
		Funcionario f2 = new Funcionario("Juliana");
		Funcionario f3 = new Funcionario("Paula");
		
		Departamento dep = new Departamento("Contabilidade");
		
		dep.addFuncionario(f1);
		dep.addFuncionario(f2);
		dep.addFuncionario(f3);
		
		
		em.getTransaction().begin();
		em.persist(f1);
		em.persist(f2);
		em.persist(f3);
		em.persist(dep);
		em.getTransaction().commit();
		

	}

}
