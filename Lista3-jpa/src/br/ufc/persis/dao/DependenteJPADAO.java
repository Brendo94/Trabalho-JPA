package br.ufc.persis.dao;

import br.ufc.persis.model.Dependente;


public class DependenteJPADAO extends GenericJPADAO<Dependente> implements DependenteDAO {

	public DependenteJPADAO() {
		this.persistentClass = Dependente.class;
	}
}
