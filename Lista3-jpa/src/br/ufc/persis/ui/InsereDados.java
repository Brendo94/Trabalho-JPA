package br.ufc.persis.ui;

import java.util.ArrayList;
import java.util.List;

import br.ufc.persis.dao.FuncionarioJPADAO;
import br.ufc.persis.model.Funcionario;
import br.ufc.persis.model.Limpeza;
import br.ufc.persis.model.Pesquisador;

public class InsereDados {
	private static List<Funcionario> Funcionarios = null;
	private static FuncionarioJPADAO FuncionarioDAO;

	public static void main(String[] args) {
		
		

//		Limpeza funcionarioDeLimpeza = new Limpeza();
//
//		funcionarioDeLimpeza.setNome("Marcilio");
//		funcionarioDeLimpeza.setEndereço("Rui maia");
//		funcionarioDeLimpeza.setSexo("Masculino");
//		funcionarioDeLimpeza.setSalario(1500.50);
//		funcionarioDeLimpeza.setCargo("Limpador");
//		funcionarioDeLimpeza.setJornada_trabalho("15 horas semanais");

//		Pesquisador funcionarioDePesquisa = new Pesquisador();
//		funcionarioDePesquisa.setNome("Laisa");
//		funcionarioDePesquisa.setEndereço("Rui maia");
//		funcionarioDePesquisa.setSexo("Feminino");
//		funcionarioDePesquisa.setData_de_aniversario("21/05/1992");
//		funcionarioDePesquisa.setSalario(2500.50);
//		funcionarioDePesquisa.setArea_de_atuacao("Pesquisadora em Data Mining");
//		

//		Funcionarios = new ArrayList<Funcionario>();
//		Funcionarios.add(funcionarioDeLimpeza);
//		FuncionarioDAO = new FuncionarioJPADAO();
//		FuncionarioDAO.beginTransaction();
//		FuncionarioDAO.save(funcionarioDeLimpeza);
//		FuncionarioDAO.commit();
//		FuncionarioDAO.close();
	}
}
