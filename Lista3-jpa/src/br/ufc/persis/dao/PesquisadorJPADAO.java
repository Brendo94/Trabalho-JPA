package br.ufc.persis.dao;

import br.ufc.persis.model.Pesquisador;

public class PesquisadorJPADAO extends GenericJPADAO<Pesquisador> implements PesquisadorDAO {

	public PesquisadorJPADAO() {
		this.persistentClass = Pesquisador.class;
	}
	
	
}
