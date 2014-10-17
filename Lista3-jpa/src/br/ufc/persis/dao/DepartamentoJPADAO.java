package br.ufc.persis.dao;

import br.ufc.persis.model.Departamento;

public class DepartamentoJPADAO extends GenericJPADAO<Departamento> implements
		DepartamentoDAO {

	public DepartamentoJPADAO() {
		this.persistentClass = Departamento.class;
	}
}
