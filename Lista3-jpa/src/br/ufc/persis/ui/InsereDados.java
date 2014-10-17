package br.ufc.persis.ui;

import java.util.ArrayList;
import java.util.List;

import br.ufc.persis.dao.DepartamentoJPADAO;
import br.ufc.persis.dao.FuncionarioJPADAO;
import br.ufc.persis.dao.ProjetoJPADAO;
import br.ufc.persis.model.Departamento;
import br.ufc.persis.model.Funcionario;
import br.ufc.persis.model.Projeto;

public class InsereDados {
	private static DepartamentoJPADAO departamentoDAO;

	private static List<Funcionario> Funcionarios = null;
	private static FuncionarioJPADAO FuncionarioDAO;

	
	private static DepartamentoJPADAO DepartamentoDAO;

	private static List<Projeto> Projetos = null;
	private static ProjetoJPADAO ProjetoDAO;

	public static void main(String[] args) {

		Projeto projeto1 = new Projeto();

		departamentoDAO = new DepartamentoJPADAO();
		departamentoDAO.beginTransaction();

		projeto1.setNome("Projeto de Iniciação Científica");
		projeto1.setDepartamento(departamentoDAO.find(2));
		projeto1.setPeriodo_desenvolvimento("5 anos");
		departamentoDAO.close();

		Projetos = new ArrayList<Projeto>();
		Projetos.add(projeto1);
		ProjetoDAO = new ProjetoJPADAO();
		ProjetoDAO.beginTransaction();
		ProjetoDAO.save(projeto1);
		ProjetoDAO.commit();
		ProjetoDAO.close();

		// Departamento departamento1 = new Departamento();
		//
		// departamento1.setNome("Departamento Universidade Federal");
		// departamento1.setNumero(1522);
		//
		//
		// Departamentos = new ArrayList<Departamento>();
		// Departamentos.add(departamento1);
		// DepartamentoDAO = new DepartamentoJPADAO();
		// DepartamentoDAO.beginTransaction();
		// DepartamentoDAO.save(departamento1);
		// DepartamentoDAO.commit();
		// DepartamentoDAO.close();

		// departamentoDAO = new DepartamentoJPADAO();
		// departamentoDAO.beginTransaction();
		//
		// Limpeza funcionarioDeLimpeza = new Limpeza();
		//
		// funcionarioDeLimpeza.setNome("Brendo");
		// funcionarioDeLimpeza.setEndereço("Rui maia");
		// funcionarioDeLimpeza.setSexo("Masculino");
		// funcionarioDeLimpeza.setSalario(1500.50);
		// funcionarioDeLimpeza.setCargo("Lixeiro");
		// funcionarioDeLimpeza.setJornada_trabalho("15 horas semanais");
		// funcionarioDeLimpeza.setDepartamento(departamentoDAO.find(2));
		// departamentoDAO.close();

		// Pesquisador funcionarioDePesquisa = new Pesquisador();
		// funcionarioDePesquisa.setNome("Laisa");
		// funcionarioDePesquisa.setEndereço("Rui maia");
		// funcionarioDePesquisa.setSexo("Feminino");
		// funcionarioDePesquisa.setData_de_aniversario("21/05/1992");
		// funcionarioDePesquisa.setSalario(2500.50);
		// funcionarioDePesquisa.setArea_de_atuacao("Pesquisadora em Data Mining");
		//

		// Funcionarios = new ArrayList<Funcionario>();
		// Funcionarios.add(funcionarioDeLimpeza);
		// FuncionarioDAO = new FuncionarioJPADAO();
		// FuncionarioDAO.beginTransaction();
		// FuncionarioDAO.save(funcionarioDeLimpeza);
		// FuncionarioDAO.commit();
		// FuncionarioDAO.close();
	}
}
