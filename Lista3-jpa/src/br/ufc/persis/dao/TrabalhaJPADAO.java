package br.ufc.persis.dao;

import br.ufc.persis.model.Trabalha;

public class TrabalhaJPADAO extends GenericJPADAO<Trabalha> implements
		TrabalhaDAO {

	public TrabalhaJPADAO() {
		this.persistentClass = Trabalha.class;
	}
}
