package br.ufc.persis.ui;

import java.util.ArrayList;
import java.util.List;

import br.ufc.persis.dao.DependenteJPADAO;
import br.ufc.persis.dao.FuncionarioJPADAO;
import br.ufc.persis.model.Dependente;

public class InsereDependente {
	private static List<Dependente> dependentes = null;
	private static DependenteJPADAO dependenteDAO;
	
	private static FuncionarioJPADAO funcionarioDAO;

	public static void main(String[] args) {

		Dependente rafael = new Dependente();

		funcionarioDAO = new FuncionarioJPADAO();
		funcionarioDAO.beginTransaction();

		rafael.setNome("Rafael Ribeiro");
		rafael.setSexo("Masculino");
		rafael.setData_de_aniversario("21/05/1992");
		rafael.setGrau_de_parentesco("Filho");
		rafael.setFuncionario(funcionarioDAO.find(3));
		funcionarioDAO.close();

		dependentes = new ArrayList<Dependente>();
		dependentes.add(rafael);
		dependenteDAO = new DependenteJPADAO();
		dependenteDAO.beginTransaction();
		dependenteDAO.save(rafael);
		dependenteDAO.commit();
		dependenteDAO.close();
	}

}
