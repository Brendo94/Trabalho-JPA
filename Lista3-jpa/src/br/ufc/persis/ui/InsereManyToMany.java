package br.ufc.persis.ui;

import java.util.ArrayList;
import java.util.List;

import br.ufc.persis.dao.DepartamentoJPADAO;
import br.ufc.persis.dao.FuncionarioJPADAO;
import br.ufc.persis.dao.ProjetoJPADAO;
import br.ufc.persis.model.Departamento;
import br.ufc.persis.model.Funcionario;
import br.ufc.persis.model.Pesquisador;
import br.ufc.persis.model.Projeto;
import br.ufc.persis.model.Trabalha;

public class InsereManyToMany {

	private static DepartamentoJPADAO departamentoDAO;

	private static List<Funcionario> Funcionarios = null;
	private static FuncionarioJPADAO FuncionarioDAO;

	private static List<Departamento> Departamentos = null;
	private static DepartamentoJPADAO DepartamentoDAO;

	private static List<Projeto> Projetos = null;
	private static ProjetoJPADAO ProjetoDAO;

	public static void main(String[] args) {

		Projeto projeto = new Projeto();
		Pesquisador pesquisador = new Pesquisador();
		Trabalha trabalha = new Trabalha();

		departamentoDAO = new DepartamentoJPADAO();
		departamentoDAO.beginTransaction();

		trabalha.setPesquisador(pesquisador.find(1));
		trabalha.setProjeto(projeto.find(1));
		trabalha.setHoras_trabalhadas(10);

		departamentoDAO.commit();
		departamentoDAO.close();
		Departamento departamento1 = new Departamento();

		departamento1.setNome("Departamento Universidade Federal");
		departamento1.setNumero(1522);

		Departamentos = new ArrayList<Departamento>();
		Departamentos.add(departamento1);
		DepartamentoDAO = new DepartamentoJPADAO();
		DepartamentoDAO.beginTransaction();
		DepartamentoDAO.save(departamento1);
		DepartamentoDAO.commit();
		DepartamentoDAO.close();

		departamentoDAO = new DepartamentoJPADAO();
		departamentoDAO.beginTransaction();
		//
		// Limpeza funcionarioDeLimpeza = new Limpeza();
		//
		// funcionarioDeLimpeza.setNome("Brendo");
		// funcionarioDeLimpeza.setEndere�o("Rui maia");
		// funcionarioDeLimpeza.setSexo("Masculino");
		// funcionarioDeLimpeza.setSalario(1500.50);
		// funcionarioDeLimpeza.setCargo("Lixeiro");
		// funcionarioDeLimpeza.setJornada_trabalho("15 horas semanais");
		// funcionarioDeLimpeza.setDepartamento(departamentoDAO.find(2));
		// departamentoDAO.close();

		// Pesquisador funcionarioDePesquisa = new Pesquisador();
		// funcionarioDePesquisa.setNome("Laisa");
		// funcionarioDePesquisa.setEndere�o("Rui maia");
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
