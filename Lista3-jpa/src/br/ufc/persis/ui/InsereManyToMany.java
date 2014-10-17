package br.ufc.persis.ui;

import java.util.ArrayList;
import java.util.List;

import br.ufc.persis.dao.PesquisadorJPADAO;
import br.ufc.persis.dao.ProjetoJPADAO;
import br.ufc.persis.dao.TrabalhaJPADAO;
import br.ufc.persis.model.Trabalha;

public class InsereManyToMany {

	private static List<Trabalha> trabalhos = null;
	private static TrabalhaJPADAO trabalhaDAO;

	private static PesquisadorJPADAO pesquisadorDAO;

	private static ProjetoJPADAO projetoDAO;

	public static void main(String[] args) {

		Trabalha trabalha = new Trabalha();

		pesquisadorDAO = new PesquisadorJPADAO();
		pesquisadorDAO.beginTransaction();
		trabalha.setPesquisador(pesquisadorDAO.find(4));
		pesquisadorDAO.close();

		projetoDAO = new ProjetoJPADAO();
		projetoDAO.beginTransaction();
		trabalha.setProjeto(projetoDAO.find(4));
		projetoDAO.close();

		trabalha.setHoras_trabalhadas(40);

		trabalhos = new ArrayList<Trabalha>();
		trabalhos.add(trabalha);
		trabalhaDAO = new TrabalhaJPADAO();
		trabalhaDAO.beginTransaction();
		trabalhaDAO.save(trabalha);
		trabalhaDAO.commit();
		trabalhaDAO.close();

	}

}
