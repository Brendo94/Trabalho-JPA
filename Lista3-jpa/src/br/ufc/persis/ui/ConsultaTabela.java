package br.ufc.persis.ui;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import br.ufc.persis.dao.FuncionarioJPADAO;
import br.ufc.persis.model.Funcionario;

public class ConsultaTabela {
	private static List<Funcionario> funcionarios;
	private static FuncionarioJPADAO funcionarioDAO;

	public static void main(String[] args) {

		// Usando o find da classe GenericJPADAO, que ja usa o criteria no
		// método find
		funcionarios = new ArrayList<Funcionario>();
		funcionarioDAO = new FuncionarioJPADAO();
		funcionarioDAO.beginTransaction();		
		funcionarios.addAll(funcionarioDAO.find());
		funcionarioDAO.close();

		for (int i = 0; i < funcionarios.size(); i++) {
			System.out.println("Id: " + funcionarios.get(i).getId() + " Nome: "
					+ funcionarios.get(i).getNome() + " Endereço: "
					+ funcionarios.get(i).getEndereço());
		}

	}
}
