package br.ufc.persis.dao;

import br.ufc.persis.model.Projeto;

public class ProjetoJPADAO extends GenericJPADAO<Projeto> implements ProjetoDAO {

	public ProjetoJPADAO() {
		this.persistentClass = Projeto.class;
	}
}
